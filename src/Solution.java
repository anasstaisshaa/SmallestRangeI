import java.util.Arrays;

class Solution {
    public int smallestRangeI(int[] nums, int k) {

        Arrays.sort(nums);


        int diff= (nums[nums.length-1]-k)-(nums[0]+k);

        return (diff>0) ? diff : 0;
    }
}