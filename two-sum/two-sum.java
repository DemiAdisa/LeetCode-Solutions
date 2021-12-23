import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        boolean solutionFound = false;
        int solution[] = new int[2];
        int sum;
        
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(i != j)
                {
                    sum = nums[i] + nums[j];
                    
                    if(sum == target)
                    {
                        solution[0] = i;
                        solution[1] = j;
                        solutionFound = true;
                        break;
                        
                    }
                }
                
            }
            
            if(solutionFound)
            {
                break;
            }
        }
        
        return solution;
    }
}