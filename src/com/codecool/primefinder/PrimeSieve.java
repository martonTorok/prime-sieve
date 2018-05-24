package com.codecool.primefinder;

public class PrimeSieve {


        public static void getPrimes ( int n){
            boolean[] isPrime = new boolean[n + 1];
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }

            for (int f = 2; f * f <= n; f++) {
                if (isPrime[f]) {
                    for (int j = f; f * j <= n; j++) {
                        isPrime[f * j] = false;
                    }
                }
            }

            System.out.println("Primes are:\n");
            for (int i = 0; i < isPrime.length; i++) {
                if (isPrime[i]) {
                    System.out.println(i);
                }
            }
        }
    public static void main(String[] args) {
            getPrimes(50);
    }
}

