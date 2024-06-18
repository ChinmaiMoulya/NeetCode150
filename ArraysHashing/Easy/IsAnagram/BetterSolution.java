package ArraysHashing.Easy.IsAnagram;

import java.util.HashMap;
import java.util.Map;

public class BetterSolution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        } else {
            HashMap<Character, Integer> sMap = new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(sMap.containsKey(s.charAt(i))){
                    int count = sMap.get(s.charAt(i));
                    sMap.put(s.charAt(i), ++count);
                } else {
                    sMap.put(s.charAt(i), 1);
                }
            }

            HashMap<Character, Integer> tMap = new HashMap<>();
            for(int i=0; i<t.length(); i++){
                if(tMap.containsKey(t.charAt(i))){
                    int count = tMap.get(t.charAt(i));
                    tMap.put(t.charAt(i), ++count);
                } else {
                    tMap.put(t.charAt(i), 1);
                }
            }
            for(Map.Entry<Character, Integer> entry : sMap.entrySet()){
                if((!tMap.containsKey(entry.getKey())) || (tMap.containsKey(entry.getKey()) && (tMap.get(entry.getKey()) != entry.getValue()))){
                    return false;
                }
            }
            return true;
        }
    }
}
