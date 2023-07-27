
class Solution {
    public int countPrimes(int n) {
        if (n <= 2) {
            return 0; // as 1 and 0 are not prime
        }

        boolean[] comp = new boolean[n];

        int prime = (int) Math.sqrt(n);
        for (int i = 2; i <= prime; i++) {
            if (comp[i] == false) {
                // if the composites are false

                for (int k = i * i; k < n; k += i) {
                    comp[k] = true;
                    // if the composites are true
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (comp[i] == false)
                count++;
        }
        return count;
    }
}