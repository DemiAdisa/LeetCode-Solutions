class Solution {
    
    
    public int[] shuffle(int[] nums, int n) {
        
        int[] arr = new int[2*n];
        int count = 0;
        
        //First Half of nums
        for(int i =0; i < 2*n; i+=2)
        {
            arr[i] = nums[count];
            count++;            
        }
        
        count = n;
        
        //Second Half of nums
        for(int i =1; i < 2*n; i+=2)
        {
            arr[i] = nums[count];
            count++;            
        }
        
        return arr;
    }
    
    
}