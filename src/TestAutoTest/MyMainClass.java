package TestAutoTest;

import java.util.Scanner;

public class MyMainClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        MyLogicClass lc = new MyLogicClass();
        String englishInput;
        String morseInput;

        System.out.println("SYSTEM COMMENCING...");
        System.out.println("This program will let your translate MORSE CODE to ENGLISH and vice versa");

        boolean error = false;
        do {
            try {
                System.out.println("INSTRUCTIONS: Please type 'E' for English and 'M' for Morse Code.");
                String userWord = scan.nextLine();

                switch (userWord) {
                    case "E", "e" -> {
                        userWord = null;
                        System.out.println("You have chosen English, please write your word.");
                        englishInput = scan.nextLine();
                        lc.setToMorse(englishInput);
                        System.out.println("Your ENGLISH WORD is: " + englishInput + " and the MORSE CODE translation is: " + lc.getEnglish());
                        error = false;
                    }
                }
                switch (userWord) {
                    case "M", "m" -> {
                        userWord = null;
                        System.out.println("You have chosen Morse Code, please write your code and separate each code with space.");
                        morseInput = scan.nextLine();
                        lc.setToEnglish(morseInput);
                        System.out.println("Your MORSE CODE is: " + morseInput + " and the ENGLISH translation is: " + lc.getMorseCode());
                        error = false;

                    }
                }

                if (!userWord.matches("E") || !userWord.matches("e") || !userWord.matches("M") || !userWord.matches("m")) {
                    error = true;
                    throw new Exception("Ops! Invalid input, try again!");
                }


            } catch (NullPointerException ignore) {

            } catch (Exception e) {
                System.out.println(e);
            }

        } while (error == true);
    }
}





