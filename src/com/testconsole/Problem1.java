package com.testconsole;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/18/12
 * Time: 9:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem1 implements ProblemSolver {

    public String solveProblem() {

        Integer multipleSum = 0;

        for (int i = 3; i < 1000; i++) {
            if(i % 3 == 0 || i % 5 == 0)  {
                multipleSum += i;
            }
        }

        return multipleSum.toString();
    }

}
