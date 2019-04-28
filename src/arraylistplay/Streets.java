package arraylistplay;

import java.util.ArrayList;

public class Streets {
    public static void main(String[] args) {

        ArrayList<String> primes = new ArrayList<>();

        primes.add("Iberville");
        primes.add("Decatur");
        primes.add("Toulouse");
        primes.add("Bourbon");
        primes.add("Dauphine");
        primes.add("Royal");
        primes.add("St Ann");
        primes.add("St Peter");
        primes.add("Conti");
        primes.add("Exchange");
        primes.add("Bienville");
        primes.add("Dumaine");

        System.out.println("size of primes list = " + primes.size());
        System.out.println("first prime = " + primes.get(0));
        System.out.println("last prime = " + primes.get(11));
        System.out.println("last prime = " + primes.get(primes.size() - 1));

        System.out.println("\nThe initial list ...");
        for (String prime : primes) {
            System.out.println(prime);
        }

        String temp = primes.get(0);
        primes.set(0, primes.get(primes.size() - 1));
        primes.set(primes.size() - 1, temp);
        System.out.println("\nThe final list ...");
        for (String prime : primes) {
            System.out.println(prime);
        }
    }

}