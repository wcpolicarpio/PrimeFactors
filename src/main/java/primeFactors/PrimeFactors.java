package primeFactors;

import java.util.*;

public class PrimeFactors {
    public static List<Integer> generate(int n){
        List<Integer> primes = new ArrayList<>();

        for (int candidate = 2; n > 1; candidate++ )
            for ( ;n%candidate == 0; n /= candidate)
                primes.add(candidate);
        return primes;
    }
}
