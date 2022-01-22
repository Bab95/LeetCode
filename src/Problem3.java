public class Problem3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1){
            return s.length();
        }
        int[] hash = new int[256];
        for (int i =0;i < hash.length; i++){
            hash[i] = -1;
        }
        int index = 0;
        int maxLength = -1;
        int currentLength = 0;
        while(index < s.length()){
            if (hash[s.charAt(index)] == -1){
                currentLength++;
                hash[s.charAt(index)] = index;
            }else{
                // check if index is outside of current length.....
                if (index - currentLength > hash[s.charAt(index)]){
                    currentLength++;
                }else{
                    currentLength = index - hash[s.charAt(index)];
                }
                hash[s.charAt(index)] = index;
            }
            maxLength = Math.max(maxLength, currentLength);
            index++;
        }
        return maxLength;
    }
}
