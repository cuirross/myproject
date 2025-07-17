package lesson8;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Heellllpp Meee1111", '1'));
        String first = "hello";
        String reversed = stringReverse(first);
        System.out.println(reversed);
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
    static String stringReverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
