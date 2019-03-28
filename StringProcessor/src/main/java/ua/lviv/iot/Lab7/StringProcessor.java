package ua.lviv.iot.Lab7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringProcessor {

    public String makeAllLastLettersUpper(String textWords) {
        String result = "";
        String[] words = textWords.split(" ");
        for (String word : words) {
            int lenght = word.length();
            for (int index = 0; index < lenght - 1; index++) {
                if (Pattern.matches("[^A-Za-zА-Яа-я]+", word.substring(index + 1))) {
                    result += word.substring(index, index + 1).toUpperCase();
                } else {
                    result += word.substring(index, index + 1);
                }
            }
            if (Pattern.matches("[A-Za-zА-Яа-я]", word.substring(lenght - 1))) {
                result += word.substring(lenght - 1).toUpperCase();
            } else {
                result += word.substring(lenght - 1);
            }
            result += " ";
        }
        return result;
    }

    public static String readInputText() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void showResults(String textResult) {
        System.out.print(textResult);
    }
}