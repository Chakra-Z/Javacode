
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {5,0,0,0,0};
        int m = 1;
        int[] nums2 = {1,2,3,4};
        int n = 4;
        solution.merge(nums1,m,nums2,n);
        for(int i = 0; i < nums1.length;i++){
            System.out.println(nums1[i]);
        }
        //System.out.println(solution.lengthOfLastWord("abc"));
    }

    // 两个有序数组合并
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0){
            for(int i = 0; i < n; i++){
                nums1[i] = nums2[i];
            }
            return;
        }
        int end = m+n-1;
        int end1 = m-1;
        int end2 = n-1;
        while(end1 >= 0 && end2 >= 0){
            if(nums2[end2] >= nums1[end1]){
                nums1[end] = nums2[end2];
                end--;
                end2--;
            }else{
                nums1[end] = nums1[end1];
                end1--;
                end--;
            }
        }
        if(end1 < 0 && end2 >= 0){
            for(int i = 0; i <= end2; i++){
                nums1[i] = nums2[i];
            }
        }
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
