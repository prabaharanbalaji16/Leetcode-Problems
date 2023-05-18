class Solution {
    public String firstPalindrome(String[] words) {
        
        for(int k=0;k<words.length;k++)
        {
            if(palindrome(words[k])) return words[k];
        }
        return "";
    }

    boolean palindrome(String word)
    {
        int i=(word.length())/2,j=(word.length()-1)/2;

            while(i>=0)
            {
                if(word.charAt(i--)!=word.charAt(j++))
                    return false;
            }
        return true;
    }
}