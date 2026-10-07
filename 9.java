class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;}
        int num = x;
        int Rnum = 0;
        while (x > 0) {
            int digit = x % 10;
            Rnum = Rnum * 10 + digit;
            x = x / 10;
        }
        return num == Rnum;
    }
}