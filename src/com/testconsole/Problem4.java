package com.testconsole;

/**
 * Created with IntelliJ IDEA.
 * User: Travis
 * Date: 5/19/12
 * Time: 9:20 PM
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 implements ProblemSolver {
    @Override
    public String solveProblem() {

        int result = 0;
        int j = 999;
        int highestVal = 0;

        while(j > 900)
        {
            for(int i = 999; i > 900; i--)
            {
                result = i * j;
                int tempResult = result;
                int reversed = 0;

                while(tempResult > 0){
                    int digit = tempResult % 10;
                    reversed = reversed * 10 + digit;
                    tempResult = tempResult / 10;
                }

                if(reversed == result) {
                    System.out.println(String.format("i=%s j=%s result=%s",i,j,result));
                    if(result > highestVal){
                        highestVal = result;
                    }
                }
            }
            j--;
        }

        return String.valueOf(highestVal);
    }
}
