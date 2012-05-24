package com.testconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/21/12
 * Time: 12:10 AM
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
public class Problem7 implements ProblemSolver {
    @Override
    public String solveProblem() {

        int max = 200000;
        List<Integer> searchList = new ArrayList<Integer>();
        searchList.add(2);

        for(int i = 3; i < max; i+=2){
            searchList.add(i);
        }

        int currPos = 0;
        while(currPos < searchList.size() && currPos < 10001) {
            //List<Integer> tempList = new ArrayList<Integer>(searchList);
            int currPrime = searchList.get(currPos);
            for(int i = currPos + 1; i < searchList.size(); i++){
                if(searchList.get(i) % currPrime == 0) {
                    searchList.remove(new Integer(searchList.get(i)));
                }
            }
            currPos += 1;
        }

        return String.format("Number of primes found: %s, 10001 prime: %s",searchList.size(),searchList.get(10000));
    }
}
