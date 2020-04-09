
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String  s = "";
        System.out.println(solution.lengthOfLastWord(s));
    }
    // 最后一个单词的长度
    public int lengthOfLastWord(String s) {
        int count = 0;
        int end = s.length()-1;
        while (end >= 0 && s.charAt(end) == ' '){
            end--;
        }
        while (end >= 0 && s.charAt(end) != ' '){
            end--;
            count++;
        }
        return count;
    }
    // 判断回文数
    public boolean isPalindrome(int x) {
        String s = x+"";
        char[] arr = s.toCharArray();
        int len = s.length()-1;
        int i = 0;
        while(i <= len){
            if(arr[i] != arr[len]){
                return false;
            }else {
                i++;
                len--;
            }
        }
        return true;
    }

    // 判断是否包含
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] b = new int[26];
        for(char c : magazine.toCharArray()){
            b[c-'a']++;
        }
        for(char c : ransomNote.toCharArray()){
            if(b[c-'a'] == 0){
                return false;
            }else {
                b[c-'a']--;
            }
        }
        return true;
    }

}
