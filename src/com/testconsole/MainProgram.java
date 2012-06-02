package com.testconsole;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/18/12
 * Time: 9:01 PM
 * To change this template use File | Settings | File Templates.
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class MainProgram {

    public static void main(String args[]) {

        ProblemSolver p;

        switch (Integer.parseInt(args[0])) {
            case 1:
                p = new Problem1();
                break;
            case 2:
                p = new Problem2();
                break;
            case 3:
                p = new Problem3();
                break;
            case 4:
                p = new Problem4();
                break;
            case 5:
                p = new Problem5();
                break;
            case 6:
                p = new Problem6();
                break;
            case 7:
                p = new Problem7();
                break;
            case 8:
                p = new Problem8();
                break;
            case 9:
                p = new Problem9();
                break;
            case 10:
                p = new Problem10();
                break;
            case 11:
                p = new Problem11();
                break;
            default:
                p = new Problem1();
        }

        System.out.println(p.solveProblem());

    }
}

