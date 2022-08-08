package codewars;

//kata https://www.codewars.com/kata/55e785dfcb59864f200000d9
/*
Description:

Some numbers have the property to be divisible by 2 and 3. Other smaller subset of numbers has the property to be divisible by 2, 3 and 5. Another subset with less abundant numbers may be divisible by 2, 3, 5 and 7. These numbers have something in common: their prime factors are contiguous primes.

Implement a function that finds the amount of numbers that have the first N primes as factors below a given limit.

Let's see some cases:

count_specMult(3, 200)  =>  6

The first 3 primes are: 2, 3 and 5.

And the found numbers below 200 are: 30, 60, 90, 120, 150, 180.

SD: Math solution is multiply the n number of primes together, divide mxval by this product (truncated)

*/


public class CountMultiples {

    public static void main(String[] args) {
        System.out.println(countSpecMulti(10, 2098466732));
    }

    public static long countSpecMulti(long n, long mxval) {

        long primesCount = 0;
        long factor = 1;

        for (int j = 2; primesCount < n; j++) {
            if (isPrime(j)) {

                factor = factor * j;
                primesCount +=1;
            }
        }
        return mxval / factor;
    }

    public static boolean isPrime(int num){
        int m = num / 2;
        if(num == 0 || num == 1){
            return false;
        }
        for(int i = 2; i <= m; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
