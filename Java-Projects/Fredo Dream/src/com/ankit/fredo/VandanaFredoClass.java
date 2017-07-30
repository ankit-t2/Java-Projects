package com.ankit.fredo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
 
public class VandanaFredoClass {
 
       public static void main(String[] args) throws IOException {
              BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
              String[] meta = reader.readLine().split(" ");
              List<String> input = Arrays.asList(reader.readLine().split(" "));
 
              int array_length = input.size();
              int gcdValue = Integer.parseInt(meta[1]);

              BigInteger valid = BigInteger.valueOf(-1);
              
              for (int count =0; count < array_length; count++) 
              {
                     if (input.get(count) != "0") 
                     {
                           for (int d = count + 1; d < array_length ; d++) 
                           {
                                  if (input.get(d) != "0") 
                                  {
                                         BigInteger s = (new BigInteger(input.get(count)).multiply(new BigInteger(input.get(d))));
                            
                                         if (valid.longValue() != -1) {
                                                valid = s.longValue() < valid.longValue() && !input.contains(String.valueOf(s)) && gcdThing(s.longValue(), gcdValue) == 1 ? s : valid;
                                         } else {
                                                valid = !input.contains(String.valueOf(s)) && gcdThing(s.longValue(), gcdValue) == 1  ? s : valid;
                                         }
 
                                  }
                                  d++;
                           }
                     }
 
              }
              System.out.println(valid.longValue());
 
              // }
 
       }
 
       private static int gcdThing(long a, long b) {
              return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
       }
}

