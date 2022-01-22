import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mmap = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (mmap.containsKey((target-nums[i]))){
                return new int[] {mmap.get(target-nums[i]), i};
            }
            mmap.put(nums[i], i);
        }
        return new int[] {};
    }
}
