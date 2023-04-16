package com.greenfoxacademy.reddit.useful_methods;

import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class ReversedSith {

    public static void main(String[] args) {

        String input = "This is my example sentence. Just for fun.";

        String expected = "Is this example my sentence. Arrgh. Uhmm. For just fun. Err..err.err.";

        System.out.println(" original: " + input + "\n new sentence: " + yoda(input));
    }


    public static String yoda(String input) {
        String[] splitedWords = input.split(" ");

        String wordNext; // current utáni szó (ez az i edik elem)
        String wordCurrent; // ez amit be akarok irni egyböl(ez nyilván a i+1-edik)
        boolean mondateleje = true;
        String returnString = "";


        for (int i = 0; i < splitedWords.length; i++) {

            // a szó mondat végi, ugyhogy nem nyulunk hozzá
            if (splitedWords[i].contains(".")) {
                returnString = returnString + splitedWords[i] + " ";
                mondateleje = true;
                continue; //  i + 1 > ciklus ujra (nyilván megint a mondat elején vagyunk)
            }

            // Elsőszó másodikszó harmadikszó negyedikszó


            // formázgatás a mondat elején
            else if (mondateleje) {
                wordNext = splitedWords[i].toLowerCase(); // elsőszó
                wordCurrent = splitedWords[i + 1].substring(0, 1).toUpperCase().charAt(0)  // Másodikszó
                        + splitedWords[i + 1].substring(1);
                mondateleje = false;
                i++;
            }
            // szimpla csere
            else {
                wordNext = splitedWords[i]; // harmadik
                wordCurrent = splitedWords[i + 1]; // negyed
                i++;
            }
            // mentés


            returnString = returnString + wordCurrent + " " + wordNext + " ";
        }

        return returnString;

    }

}
