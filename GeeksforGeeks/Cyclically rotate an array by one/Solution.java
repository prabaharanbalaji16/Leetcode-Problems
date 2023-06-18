class Compute {
    
    public void rotate(int arr[], int n)
    {
        for(int i=0;i<n;i++)
        {
            int temp = arr[n-1];
            arr[n-1] =arr[i];
            arr[i] = temp;
        }
    }
}