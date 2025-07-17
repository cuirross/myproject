package lesson8;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Heellllpp Meee1111", '1'));
    }

    static int findSymbolOccurance(String text, char symbol) {
        var counter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                counter++;
            }
        }
        return counter;
    }
}
