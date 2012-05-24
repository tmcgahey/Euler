package com.testconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/19/12
 * Time: 10:12 PM
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 implements ProblemSolver {
    @Override
    public String solveProblem() {

        int max = 20;
        List<Integer> primeList = new ArrayList<Integer>();
        primeList.add(2);

        for(Integer i = 3; i <= max; i++) {
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

        int multiple = 1;
        for(int prime: primeList) {
            multiple = multiple * prime;
        }

        //System.out.println(String.valueOf(multiple));

        int foundLowest = 1;

        for(int i = 1; i < 100; i++) {
            int newMultiple = multiple * i;

            boolean lowestNum = true;
            for(int j = 2; j <= max; j++){
                if(newMultiple % j != 0) {
                    lowestNum = false;
                    j = max + 1;
                }
            }

            if(lowestNum){
                foundLowest = newMultiple;
                break;
            }

        }

        return String.valueOf(foundLowest);
    }
}
