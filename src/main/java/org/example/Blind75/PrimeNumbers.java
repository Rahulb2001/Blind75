package org.example.Blind75;

public class PrimeNumbers {
    int factor = 0;

    public void isPrime(int n) {

        for (int i = 0; i * i < n; i++) {

            if (i / n == i) {
                factor = +2;
            } else {
                factor++;
            }


            if(factor==2){
                System.out.println(i);
            }

        }
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers=new PrimeNumbers();

        primeNumbers.isPrime(3);
    }
}
