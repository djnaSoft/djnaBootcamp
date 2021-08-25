package org.djna.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int limit = 20;
        if ( args.length > 0){
            limit = new Integer(args[0]);
        }
        System.out.println("limit " + limit);

        for ( int i = 0; i < limit ; i++){
            List<String> textItems = new ArrayList<String>();

            if ( divisibleBy(i, 3)){
                textItems.add("Fizz");
            }

            if ( divisibleBy(i, 5)){
                textItems.add("Buzz");
            }

            String text = "";
            if ( textItems.size() == 0){
                text = Integer.toString(i);
            } else {

                for (String textItem: textItems ){
                    text = text + textItem;
                }
            }
            System.out.printf("%s\n", text);
        }
    }

    static boolean divisibleBy(int value, int divisor ){
        return ( value % divisor == 0);
    }
}

