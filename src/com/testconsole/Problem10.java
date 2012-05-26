package com.testconsole;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: travismcgahey
 * Date: 12-05-23
 * Time: 9:07 PM
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 */
public class Problem10 implements ProblemSolver
{
    @Override
    public String solveProblem() {

        int max = 2000000;
        double rootOfMax = Math.sqrt(max);

        boolean[] primeList = new boolean[max - 1];

        for(int i = 0; i < primeList.length; i++){
            primeList[i] = true;
        }

        for(int i = 0; i < primeList.length; i++){
            if((i+2) > rootOfMax){
                i = primeList.length;
                break;
            }

            if(primeList[i]) {
                for(int j = i + 1; j < primeList.length; j++){
                    if(primeList[j]) {
                        if(((j+2) % (i+2)) == 0) {
                            primeList[j] = false;
                        }
                    }
                }
            }
        }

        long total = 0;
        for(int i = 0; i < primeList.length; i++ ){
            if(primeList[i]) {
                //System.out.println(String.valueOf(i+2));
                total += (i + 2);
            }
        }

        return String.valueOf(total);
    }


}
