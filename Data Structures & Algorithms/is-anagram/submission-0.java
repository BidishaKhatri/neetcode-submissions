// Pattern: Frequency Count (Array of size 26)
// Idea: Count characters in s (+1) and t (-1) simultaneously; all must cancel to 0. (using a fixed 26-size array)

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i ++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count){
            if ( val != 0) {
                return false;
            }
        }
        return true;
    }
}

//time complexity: O(n)
//space complexity: O(1)
//Explanation:  n = length of s(and t); count is a constant-size array (26), so extra space is O(1); the loops run in linear time.
