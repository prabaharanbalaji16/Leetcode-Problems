public class Find_Pivot_Index {
    public static void main(String[] args) {
        Find_Pivot_Index find_Pivot_Index = new Find_Pivot_Index();
        int[] nums = new int[]{1,7,3,6,5,6};
        int index = find_Pivot_Index.pivotIndex(nums);
        System.out.println(index);
    }

    public int pivotIndex(int[] nums) {
        
        int num=0;
        for(int i=0;i<nums.length;i++)
        {
            int sumOfLeft =0;
            int sumOfRight=0;
            if(i==0)
            {
                sumOfLeft = 0;
            }
            else
            {
                for(int j=i-1;j>=0;j--)
                {
                    sumOfLeft= sumOfLeft+ nums[j];
                }
            }
            if(i==nums.length)
            {
                sumOfRight = 0;
            }
            else
            {
                for(int j=i+1;j<nums.length;j++)
                {
                    sumOfRight+=nums[j];
                }
            }
            if(sumOfLeft == sumOfRight)
            {
                num = i;
                break;
            }
            else
            {
                num = -1;
            }
        }
        return num;
    }
}
