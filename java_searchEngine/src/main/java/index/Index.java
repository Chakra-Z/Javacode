package index;

import common.DocInfo;
import org.ansj.domain.Term;
import org.ansj.splitWord.analysis.ToAnalysis;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Index {
    // word在docId中出现的次数
    static public class Weight{
        public String word;
        public int docId;
        // weight = 标题中出现的次数*10 + 正文中出现的次数
        public int weight;
    }

    // 正排索引 是个数组，docId做下标 docId => DocInfo
    private ArrayList<DocInfo> forwardIndex = new ArrayList<>();

    // 倒排 词 => 一组docId
    // 还需要一个权重 用词频代表相关性 在标题中出现，比正文中出现更大
    private HashMap<String, ArrayList<Weight>> invertedIndex = new HashMap<>();


    // 查正排方法
    public DocInfo getDocInfo(int docId){
        return forwardIndex.get(docId);
    }

    // 查倒排
    public ArrayList<Weight> getInverted(String term){
        return invertedIndex.get(term);
    }

    // 构建索引
    public void build(String inputPath) throws IOException {


        long startTime = System.currentTimeMillis();
        System.out.println("build start!");
        // 1.读取
        BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(inputPath)));
        // 2.用\3来切分
        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            // 3.构造docInfo对象
            DocInfo docInfo = buildForward(line);
            // 4.构造倒排
            buildInverted(docInfo);
            System.out.println("Build " + docInfo.getTitle()+" ...");
        }
        bufferedReader.close();

        long finishTime = System.currentTimeMillis();
        System.out.println("build finish" +(finishTime - startTime) +" ms");

    }

    private DocInfo buildForward(String line) {
        // 按 \3 分割 成标题、url、正文
        String[] tokens = line.split("\3");
        if(tokens.length != 3){
            System.out.println("文件格式存在问题" + line);
            return null;
        }
        DocInfo docInfo = new DocInfo();
        docInfo.setDocId(forwardIndex.size());
        docInfo.setTitle(tokens[0]);
        docInfo.setUrl(tokens[1]);
        docInfo.setContent(tokens[2]);
        forwardIndex.add(docInfo);
        return docInfo;
    }

    private void buildInverted(DocInfo docInfo) {
        class WordCnt{
            public int titleCount;
            public int contentCount;

            public WordCnt(int titleCount, int contentCount) {
                this.titleCount = titleCount;
                this.contentCount = contentCount;
            }
        }
        HashMap<String,WordCnt> wordCntHashMap = new HashMap<>();

        List<Term> terms = ToAnalysis.parse(docInfo.getTitle()).getTerms();
        for(Term term : terms){
            String word = term.getName();
            WordCnt wordCnt = wordCntHashMap.get(word);
            if(wordCnt == null){
                // 不存在
                wordCntHashMap.put(word, new WordCnt(1, 0));
            } else {
                wordCnt.titleCount++;
            }
        }

        List<Term> contentTerms = ToAnalysis.parse(docInfo.getContent()).getTerms();
        for(Term term : contentTerms){
            String word = term.getName();
            WordCnt wordCnt = wordCntHashMap.get(word);
            if(wordCnt == null){
                // 不存在
                wordCntHashMap.put(word, new WordCnt(0, 1));
            } else {
                wordCnt.contentCount++;
            }
        }


        for(HashMap.Entry<String, WordCnt> entry : wordCntHashMap.entrySet()){
            Weight weight = new Weight();
            weight.word = entry.getKey();
            weight.docId = docInfo.getDocId();
            weight.weight = entry.getValue().titleCount*10 + entry.getValue().contentCount;
            // 构建倒排
            ArrayList<Weight> invertedList = invertedIndex.get(entry.getKey());
            if(invertedList == null){
                invertedList = new ArrayList<>();
                invertedIndex.put(entry.getKey(), invertedList);
            }
            invertedList.add(weight);
        }
    }

}
