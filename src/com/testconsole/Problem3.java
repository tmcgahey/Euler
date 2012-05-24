package com.testconsole;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/18/12
 * Time: 10:16 PM
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 implements ProblemSolver {
    @Override
    public String solveProblem() {
        //775147
        //115

        Integer highestPrime = 5;
        Integer root = 775147;
        BigInteger bigNum = new BigInteger("600851475143");
        List<Integer> primeList = new ArrayList<Integer>();

        for(Integer i = 5; i < root; i++) {
            boolean isAPrime = true;

            for(Integer j = 2; j < i; j++) {
                if(i % j == 0) {
                    isAPrime = false;
                    break;
                }
            }

            if(isAPrime){
                primeList.add(i);
            }
        }

        for(Integer prime : primeList){
            Integer tempPrime = prime;
            if(bigNum.mod(new BigInteger(tempPrime.toString())).equals(new BigInteger("0")) && tempPrime > highestPrime){
                highestPrime = tempPrime;
            }
        }

        return highestPrime.toString();
    }
}
