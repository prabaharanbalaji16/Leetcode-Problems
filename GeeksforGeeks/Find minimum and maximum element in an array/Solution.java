
 class pair  
{  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class Compute 
{
    static pair getMinMax(long a[], long n)  
    {
        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(min>a[i])
                min = (int)a[i];
            if(max<a[i])
                max =(int) a[i];
        }
        //Write your code here
        return new pair(min,max);
    }
}