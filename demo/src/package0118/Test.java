package package0118;

public class Test {
    public static void main(String[] args){
        int[] arr = {1,5,2,4,3,1,1};
        Solution result = new Solution();
        int n = result.removeElement(arr,1);
        System.out.println(n);
        for(int a = 0; a < n;a++){
            System.out.print(arr[a]);
        }
    }
}

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++){
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}

