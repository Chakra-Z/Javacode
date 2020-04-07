import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int flag = scanner.nextInt();
        List<Record> records = new ArrayList<>();
        int m = n;
        while(m != 0){
            Record record = new Record(scanner.next(),scanner.nextInt());
            records.add(record);
            m--;
        }
        mySort(records,flag);
        for (int i = 0 ; i < n; i++){
            System.out.println(records.get(i).toString());
        }
    }
    private static void mySort(List<Record> records, int flag){

        if(flag == 0){
            Collections.sort(records);
        }
        if(flag == 1){
            Comparator cmp = Collections.reverseOrder();
            Collections.sort(records,cmp);
        }
    }
}
class Record implements Comparable<Record>{
    public String name;
    public int mark;

    public Record(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name +" "+ mark;
    }

    @Override
    public int compareTo(Record o) {
        return o.mark - this.mark;
    }
}


class Substr {
    public boolean[] chkSubStr(String[] p, int n, String s) {
        boolean[] arr = new boolean[n];
        for(int i = 0; i < n; i++){
            if(s.contains(p[i])){
                arr[i] = true;
            }else {
                arr[i] = false;
            }
        }
        return arr;
    }
}