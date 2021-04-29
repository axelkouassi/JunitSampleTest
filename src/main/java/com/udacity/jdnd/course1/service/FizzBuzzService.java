package com.udacity.jdnd.course1.service;

public class FizzBuzzService {

    /**
     * If number is divisible by 3, return "Fizz". If divisible by 5,
     * return "Buzz", and if divisible by both, return "FizzBuzz". Otherwise,
     * return the number itself.
     *
     * @Throws IllegalArgumentException for values < 1
     */
    public String fizzBuzz(Integer number) {

       // try {
            if (number < 1){
                throw new IllegalArgumentException("Number must be greater than zero(0)");
            }
       /*}*//*catch (IllegalArgumentException e){
            System.out.println("Number must be greater than zero(0)");
        }*/

        if( (number % 3 == 0) && (number % 5 == 0)){
            return "FizzBuzz";
        }
        if(number % 3 == 0){
            return "Fizz";
        }
        if(number % 5 == 0){
            return "Buzz";
        }

        return number.toString();
    }
}
