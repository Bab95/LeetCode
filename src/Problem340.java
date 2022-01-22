import java.util.HashMap;
import java.util.Map;

public class Problem340 {
    public int longestkSubstr(String s, int k , boolean faster){
        Map<Character, Integer> mmap = new HashMap<>();
        int index = 0;
        int currentLength = 0;
        int maxLength = -1;
        int start = 0;
        while (index < s.length()){
            if (mmap.containsKey(s.charAt(index))){
                mmap.put(s.charAt(index), mmap.get(s.charAt(index)) + 1);
                currentLength++;
            }else if (mmap.size() < k){
                mmap.put(s.charAt(index), 1);
                currentLength++;
            }else{
                while (true){
                    mmap.put(s.charAt(start), mmap.get(s.charAt(start)) - 1);
                    if (mmap.get(s.charAt(start)) == 0){
                        currentLength = index - start;
                        mmap.put(s.charAt(index), 1);
                        mmap.remove(s.charAt(start));
                        start++;
                        break;
                    }
                    start++;
                }
            }
            index++;
            maxLength = Math.max(currentLength, maxLength);
        }
        return (mmap.size() == k) ? maxLength : -1;
    }
    public int longestkSubstr(String s, int k) {
        Map<Integer, Integer> mmap = new HashMap<Integer, Integer>();
        int index = 0;
        int currentLength = 0;
        int maxLength = -1;
        while (index < s.length()){
            char currrent = s.charAt(index);
            if (mmap.containsKey(Integer.valueOf(s.charAt(index)))){
                mmap.put(Integer.valueOf(s.charAt(index)), index);
                currentLength++;
            }else if (mmap.size() < k){
                mmap.put(Integer.valueOf(s.charAt(index)), index);
                currentLength++;
            }else if (mmap.size() == k){
                // now need to remove one character from map.
                int distanceFromIndex = -1;
                int canBeRemoved = 0;
                for (Map.Entry<Integer, Integer> entry : mmap.entrySet()){
                    if (index - entry.getValue() > distanceFromIndex){
                        distanceFromIndex = index - entry.getValue();
                        canBeRemoved = entry.getKey();
                    }
                }
                currentLength = index - mmap.get(canBeRemoved);
                mmap.remove(canBeRemoved);
                mmap.put(Integer.valueOf(s.charAt(index)), index);
                // currentLength++
            }
            maxLength = Math.max(maxLength, currentLength);
            index++;
        }
        return mmap.size() == k ? maxLength : -1;
    }
}
