
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int a,b;
        int[] c= new int[2];
        
        for(int i=0; i<(nums.length);i++)
        {
            for(int j=i+1;j<(nums.length);j++)
            {
                if((nums[i]+nums[j])==target)
                {
                    a=i; b=j; 
                    c[0] =a;c[1]=b;  
                    break;
                }   
            }
            
        }return c;
    }     
}
