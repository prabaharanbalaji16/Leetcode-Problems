class Solution {

    int i=0;
    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int count=0;
        String temp = "";

        while(i<s.length())
        {
            char c = s.charAt(i++);

            if(c=='[')
            {
                temp = decodeString(s);
                for(int j=0;j<count;j++)
                {
                    result.append(temp);
                }
                count=0;
            }
            else if(c==']')
            {
                break;
            }
            else if(Character.isAlphabetic(c))
            {
                result.append(c);
            }
            else
            {
                count = count * 10 + c - '0';
            }
        }
        return result.toString();
    }
}