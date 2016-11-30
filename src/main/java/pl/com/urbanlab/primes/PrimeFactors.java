package pl.com.urbanlab.primes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 22.11.16.
 */
public class PrimeFactors {

 public static List<Integer> generate(Integer n) {
     List<Integer> result = new ArrayList<Integer>();
     for (int candidate = 2; n > 1; candidate++) {
         for (; n % candidate == 0; n/=candidate) {
             result.add(candidate);
         }
     }
     return result;
 }
}
