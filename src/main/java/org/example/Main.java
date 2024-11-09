package org.example;

/**
 * <h2>
 * Determines to which grade the given score belongs to.
 * </h2>
 * <p>
 * Consists of two methods where one method is used to add internals and externals and the other one is used to determine the grade.
 * </p>
 */
public class Main {
    int score=0;
    /**
     * Adds two integers.
     * @param internals The first integer.
     * @param externals The second integer.
     * @return score The sum of two integers.
     */
    public int addition(int internals, int externals){
       score = internals + externals;
       return score;
    }

    /**
     * Determines the grade of the score.
     * @param score The only integer input.
     * @return result The character that specifies the garde.
     * @throws IllegalArgumentException if the score is lesser than 0 or greater than 100.
     */
    public char gradeDeterminer(int score){
        char result;
        if(score>100 || score<0){
            throw new IllegalArgumentException("Invalid score");
        }
            if(score>=90){
                result='A';
            }
            else if(score>=80){
                result='B';
            }
            else if(score>=70){
                result='C';
            }
            else if(score>=60){
                result='D';
            }
            else if(score>=50){
                result='E';
            }
            else{
               result='F';
            }
            return(result);
    }
}

