class ReverseInteger {

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        reverseInteger.reverse(123);
    }
    public int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
            int y = x%10;
            if( ( rev > Integer.MAX_VALUE/10 ) || (rev < Integer.MIN_VALUE/10))
                return 0;
            rev = (rev*10)+y;
            x = x/10;
        }
        return rev;
    }
}