package package0117;

public class Test {
    public static void main(String[] args){
        Solution arr = new Solution();
        //String arr2 = arr.toLowerCase("Hello");
        int[] arr3 = {-1};
        arr.rotate(arr3,2);
        for (int x = 0; x < arr3.length; x++) {
            System.out.print(arr3[x]);
        }
    }
}
class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    public void reverse(int[] nums, int start, int end){
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
//    class Solution {
//        public String toLowerCase(String str) {
//            char[] arr = str.toCharArray();
//            for (int i = 0; i < arr.length; i++) {
//                if (arr[i] < 'a' && arr[i] >= 'A'){
//                    arr[i] = (char)(arr[i]+32);
//                }
//            }
//            String s="";
//            for (char x:arr) {
//                s += x;
//            }
//            return s;
//        }
//    }

