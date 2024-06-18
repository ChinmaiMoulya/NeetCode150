package ArraysHashing.Easy.ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

public class BetterSolution {
    public boolean hasDuplicate(int[] nums) {
        Set s = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i])){
                return true;
            } else {
                s.add(nums[i]);
            }
        }
        return false;
    }
}