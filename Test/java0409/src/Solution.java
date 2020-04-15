import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {5,0,0,0,0};
        int m = 1;
        int[] nums2 = {1, 7, 3, 6, 5, 6};
        int n = 4;
        //solution.merge(nums1,m,nums2,n);
        int[] arr = solution.sortArrayByParity(nums2);
        System.out.println(solution.pivotIndex(nums2));
//        for(int i = 0; i < arr.length;i++){
//            System.out.println(arr[i]);
//        }
        //System.out.println(solution.lengthOfLastWord("abc"));
        //System.out.println(solution.containsDuplicate(nums1));
        //System.out.println(solution.containsDuplicate(nums2));
    }

    public int pivotIndex(int[] nums) {
        int i;
        int sum = 0;
        int len = nums.length;
        for(int x : nums){
            sum += x;
        }
        for(i = 0; i < len; i++){
            int leftsum = 0;
            for(int j = 0; j < i; j++){
                leftsum += nums[j];
            }
            if(leftsum == sum-nums[i]-leftsum){
                return i;
            }
        }
        return -1;
    }

    // 按奇偶排序数组
    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        int[] B = new int[A.length];
        while(left <= right){
            for(int i = 0; i < A.length; i++){
                if(A[i]%2 == 0){
                    B[left] = A[i];
                    left++;
                }if(A[i]%2 == 1){
                    B[right] = A[i];
                    right--;
                }
            }
        }
        return B;
    }

    // 有序数组的平方
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        for(int i = 0; i < n; i++){
            B[i] = A[i]*A[i];
        }
        Arrays.sort(B);
        return B;
    }
    //  存在重复元素
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                return true;
            }else {
                set.add(x);
            }
        }
        return false;
//        for(int i = 0; i < nums.length; i++){
//            int n = nums[i];
//            int count = 0;
//            for(int j = 0; j < nums.length; j++){
//                if(nums[j] == nums[i]){
//                    count++;
//                    if(count >= 2){
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
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
