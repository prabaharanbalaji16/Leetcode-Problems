class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int temp[] = new int[n];
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            {
                temp[j] = arr[i];
                j++;
            }
        }
        for(int k=0;k<n;k++)
        {
            if(arr[k]<0)
            {
                temp[j] = arr[k];
                j++;
            }
        }
        for(int i=0;i<n;i++)
        {
            arr[i] = temp[i];
        }
    }
}