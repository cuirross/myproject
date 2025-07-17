package lesson8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindWordGame {
    private String[] fruits = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
            "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public void startGame (){
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String randomWord = fruits[rand.nextInt(fruits.length)];
        String playerWord;
        char[] hintArr = new char[15];
        Arrays.fill(hintArr, '#');
        while (true){
            System.out.println("Введите слово: ");
            playerWord = scanner.nextLine();
            if (playerWord.equals(randomWord)){
                break;
            }else{
                int minLength;

                if (randomWord.length()<playerWord.length()) {
                    minLength = randomWord.length();
                }else {
                    minLength = playerWord.length();
                }
                for (int i = 0; i <minLength; i++) {
                    if (randomWord.charAt(i) == playerWord.charAt(i)){
                        hintArr[i] = randomWord.charAt(i);
                    }
                }
                String hint = new String(hintArr);
                System.out.println("Подсказка: " + hint);
            }
        }
        scanner.close();


    }
}
