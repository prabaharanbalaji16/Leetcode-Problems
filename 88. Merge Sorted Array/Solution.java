class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int num1 = m-1;
        int num2 = n-1;

        int size = m+n-1;
        while(num1>=0 && num2>=0)
        {
            nums1[size--] = (nums1[num1]>nums2[num2]) ?
                            (nums1[num1--]) : (nums2[num2--]);
        }
        while(num2>=0)
        {
            nums1[size--] = nums2[num2--];
        }
    }
}
