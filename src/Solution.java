
public class Solution {
	public int[] singleNumber(int[] nums) {
        int res[] = {0, 0};
        int diff = 0;
        for(int i = 0; i < nums.length; i++){
        	diff = diff ^ nums[i]; //do the exclusive or, and the result will be the two single number's exclusive or
        }
        
        diff = diff & (-diff); // find the first '1' in the diff, which means, the two single number have 0 and 1 for each in this bit
        
        for(int element: nums){
        	if((element & diff) != 0)//& to divide the nums into 2 groups and ^ them back
        		res[0] ^= element;
        	else
        		res[1] ^= element;
        		
        }
        
        return res;
    }
}
