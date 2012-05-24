package com.testconsole;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/18/12
 * Time: 9:46 PM
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 implements ProblemSolver {

    @Override
    public String solveProblem() {

        Integer sum = 0;

        Integer firstTerm = 1;
        Integer secondTerm = 2;

        while(secondTerm < 4000000) {
            if(secondTerm % 2 == 0){
                sum += secondTerm;
            }

            Integer thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

        return sum.toString();
    }
}