package TestAutoTest;

import java.util.HashMap;


public class MyLogicClass {


    String toEnglishResult = "";
    String toMorseResult = "";


    public String getEnglish() {
        return toEnglishResult;
    }
    public String getMorseCode() {
        return toMorseResult;
    }
    public HashMap<String, String> storage = new HashMap<>();

    public MyLogicClass() {
        storage.put("A", "*-");
        storage.put("B", "-***");
        storage.put("C", "-*-*");
        storage.put("D", "-**");
        storage.put("E", "*");
        storage.put("F", "**-*");
        storage.put("G", "--*");
        storage.put("H", "****");
        storage.put("I", "**");
        storage.put("J", "*---");
        storage.put("K", "-*-");
        storage.put("L", "*-**");
        storage.put("M", "--");
        storage.put("N", "-*");
        storage.put("O", "---");
        storage.put("P", "*--*");
        storage.put("Q", "--*-");
        storage.put("R", "*-*");
        storage.put("S", "***");
        storage.put("T", "-");
        storage.put("U", "**-");
        storage.put("V", "***-");
        storage.put("W", "*--");
        storage.put("X", "-**-");
        storage.put("Y", "-*--");
        storage.put("Z", "--**");
        storage.put("1", "*----");
        storage.put("2", "**---");
        storage.put("3", "***--");
        storage.put("4", "****-");
        storage.put("5", "*****");
        storage.put("6", "-****");
        storage.put("7", "--***");
        storage.put("8", "---**");
        storage.put("9", "----*");
        storage.put("0", "-----");
        storage.put(".", "*-*-*-");
        storage.put(",", "--**--");
        storage.put("?", "**--**");
        storage.put(" ", " ");
    }

    public String setToMorse(String englishInput) {
        for (char ch : englishInput.toCharArray())
            toEnglishResult += storage.get((ch + "").toUpperCase()) + " ";
        return toMorseResult;
    }

    public String setToEnglish(String morseInput) {

        HashMap<String, String> reversedHashMap = new HashMap<>();
        for (String i : storage.keySet()) {
            reversedHashMap.put(storage.get(i), i);
        }

        for (String translate : morseInput.split(" "))
            toMorseResult += (reversedHashMap.get(translate) + " ");
        return toMorseResult;
    }
}














