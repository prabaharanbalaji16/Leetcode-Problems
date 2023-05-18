class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<String>();
        for(int i=1;i<=n;i++)
        {
            boolean divisibleBy3 = i%3==0;
            boolean divisibleBy5 = i%5==0;
            if(divisibleBy3 && divisibleBy5)
            {
                arr.add("FizzBuzz");
            }
            else if(divisibleBy3)
            {
                arr.add("Fizz");
            }
            else if(divisibleBy5)
            {
                arr.add("Buzz");
            }
            else
            {
                arr.add(String.valueOf(i));
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.fizzBuzz(3);
    }
}