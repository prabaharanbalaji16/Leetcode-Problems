class Solution {
    public int[] twoSum(int[] numbers, int target) {

    // Using Binary Search


        // int i=0,j=0, n = numbers.length-1;
        // while(i<n)
        // {
        //    j= search(numbers,i+1,n,target-numbers[i]);
        //    if(j>0)
        //    {
        //        break;
        //    }
        //     i++;
        // }
        // return new int[]{i+1,j+1};

    // Using Two Pointer
        int i=0,j=numbers.length-1;
        while(i<j)
        {
            int sum = numbers[i]+numbers[j];

            if(sum==target)
                return new int[]{i+1,j+1};
            else if(sum > target) 
                j--;
            else
                i++;
        }
        return new int[2];
    }

    public int search(int[] arr,int low,int high, int data)
    {
        int mid = (low+high)/2;
        if(low > high)
            return -1;
        else if(arr[mid]==data)
            return mid;
        else if(arr[mid]<data)
            return search(arr,mid+1,high,data);
        else 
            return search(arr,low,mid-1,data);
    }
}