package com.testconsole;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/20/12
 * Time: 11:38 PM
 * The sum of the squares of the first ten natural numbers is,
 * 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is
 * (1 + 2 + ... + 10)2 = 552 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 implements ProblemSolver {
    @Override
    public String solveProblem() {

        int max = 100;
        int total = 0;

        for(int i = 1; i <= max; i++) {
            for(int j = i + 1; j <= max; j++) {
                total = total + 2*i*j;
            }
        }

        return String.valueOf(total);
    }
}
