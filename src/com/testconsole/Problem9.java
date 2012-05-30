package com.testconsole;

/**
 * Created with IntelliJ IDEA.
 * User: travismcgahey
 * Date: 12-05-29
 * Time: 9:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Problem9 implements ProblemSolver {
    @Override
    public String solveProblem() {

        double finalProduct = 0;
        int maxValue = 1000;

        for(int i = 2; i < maxValue; i++){

            for(int j = i; j < maxValue; j++){

                int csqr = i*i + j*j;

                double c = Math.sqrt(csqr);

                if(Math.floor(c) == c && (i + j + c == 1000)) {

                    finalProduct = i*j*c;
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(c);
                    j = 1000;
                    i = 1000;
                }
            }

        }

        return String.valueOf((int)finalProduct);
    }

}
