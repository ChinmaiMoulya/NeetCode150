package ArraysHashing.Easy.ContainsDuplicate;

import java.util.*;
import java.util.stream.Collectors;
public class BruteForce {
    public boolean hasDuplicate(int[] nums) {
        Set s = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(s.size()<nums.length){
            return true;
        } else {
            return false;
        }
    }
}
