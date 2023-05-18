import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<Integer>();
        for( Integer num: nums ){
            if( seen.contains( num )) return true;
            seen.add( num );
        }
        return false;
    }
}