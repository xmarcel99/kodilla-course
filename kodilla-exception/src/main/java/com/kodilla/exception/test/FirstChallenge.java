package com.kodilla.exception.test;

public class FirstChallenge {

    double result;

    public double divide(double a, double b) throws ArithmeticException {


        try {

            if(b == 0){
                throw new ArithmeticException();
            } else {
                result = a / b;
            }

        } catch (ArithmeticException e) {

            System.out.println("You can't devide by 0 !  " + e);
        } finally {
            System.out.println("Remember maths is the most important thing in the word !");
        }
        return result;
    }



    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
