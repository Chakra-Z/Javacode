package package0118;

public class Test2 {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9};
        Solution2 result = new Solution2();
        int n = result.searchInsert(arr,3);
//        for(int a = 0; a < n;a++){
//            System.out.print(arr[a]);
//        }
        System.out.println(n);
    }
}
class Solution2 {
    public int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        int i = 0;
        while (nums[i]<target){
            i++;
        }
        return i;
    }
}
