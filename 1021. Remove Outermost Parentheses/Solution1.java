class Solution1 {
    public String removeOuterParentheses(String s) {
        StringBuffer result = new StringBuffer();
        int opened = 0;
        for (char c : s.toCharArray()) {
            if (c == '(' && opened++ > 0) result.append(c);
            if (c == ')' && opened-- > 1) result.append(c);
        }
        return result.toString();
    }
}