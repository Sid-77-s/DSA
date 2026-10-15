class Solution {
    public double myPow(double x, long n) {
        double power = 1;

        if (n < 0) {
            return 1 / myPow(x, -n);
        }
        else if (n == 0) {
            power = 1;
        }
        else {
            power = myPow(x, n / 2);

            if (n % 2 == 0) {
                return power * power;
            }
            else {
                return power * power * x;
            }
        }

        return power;
    
    }
}