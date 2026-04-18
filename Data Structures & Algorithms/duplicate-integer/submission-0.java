// Pattern: HashSet
// Idea: track seen elements

class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();      // store numbers we've seen 
        for(int num :nums){
            if (seen.contains(num)){
                return true;
            }
            seen. add(num);
        }
        return false;
    }
}

//Time complexity O(n)
//Space complexity O(n)
