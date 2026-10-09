class Solution {
    public int fib(int n) {
        if (n == 0) {
             int fi = 0;
             return fi;
        }
        int a = 0, b = 1;
        int i = 2;

        while (i <= n) {
            int fi = a + b;
            a = b;
            b = fi;
            i++;
        }

        return b;
    }
}