package com.company;

public class Main {

    public static void main(String[] args) {
        int primeCount = 0;
        for (int i = 2; i <= 50; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                primeCount += 1;
                if (primeCount == 3)
                    break;
            }
        }
    }

    public static boolean isPrime(int n){
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                return false;

        }
    return true;
    }
}
