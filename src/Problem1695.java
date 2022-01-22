import java.util.HashMap;
import java.util.Map;

public class Problem1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            sum[i] = sum[i-1] + nums[i];
        }
        Map<Integer, Integer> mmap = new HashMap<>();
        int currentWindow = 0;
        int maxSum = -1;
        int currentSum = 0;
        for (int i = 0;i < nums.length;i++){
            if (!mmap.containsKey(nums[i])){
                //mmap.put(nums[i], i);
                currentWindow++;
            } else if (mmap.containsKey(nums[i]) && mmap.get(nums[i]) < i - currentWindow){
                //mmap.put(nums[i], i);
                currentWindow++;
            } else{
                int _index = mmap.get(nums[i]);
                //mmap.put(nums[i], i);
                currentWindow = i - _index;
            }
            mmap.put(nums[i], i);
            currentSum = sum[i] - ((i-currentWindow >= 0) ? sum[i-currentWindow] : 0);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
