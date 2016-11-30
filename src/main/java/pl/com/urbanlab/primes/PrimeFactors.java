package pl.com.urbanlab.primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 22.11.16.
 */
public class PrimeFactors {

 public static List<Integer> generate(Integer n) {
     List<Integer> result = new ArrayList<Integer>();
     if (n > 1) {
         int candidate = 2;
         while (n % candidate == 0) {
             result.add(candidate);
             n /= candidate;
         }
         while (n%3 == 0) {
             result.add(3);
             n /= 3;
         }
         while (n%5 == 0) {
             result.add((5));
             n /= 5;
         }
         if (n>1) {
            result.add(n);
         }
     }
     return result;
 }
}
