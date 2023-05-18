class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        return small(arr,l,r,k-1);
        
    } 
    
    static int small(int[] arr, int l, int r, int k)
    {
        int partition = partition(arr,l,r);
        if(partition==k)
        {
            return arr[partition];
        }
        else if(partition < k)
        {
            return small(arr,partition+1,r,k);
        }
        else
            return small (arr,l,partition-1,k);
    }
    
    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high], pivotloc = low;
        for(int i=low;i<=high;i++)
        {
            if(arr[i]<pivot)
            {
                int temp = arr[i];
                arr[i] = arr[pivotloc];
                arr[pivotloc] = temp;
                pivotloc++;
            }
        }
        int temp = arr[high];
        arr[high] = arr[pivotloc];
        arr[pivotloc] = temp;
        
        return pivotloc;
    }
}