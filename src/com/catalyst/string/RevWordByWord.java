package com.catalyst.string;
///ctrl+alt+l to format code in intellij idea
public class RevWordByWord {
    public static void main(String[] args) {
        String string = "my name is java";
        String rev = "";
        String rev1 = "";
        String[] words = string.split(" ");
        System.out.println(string);
       //revsere word by word
        for (String word : words) {

            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            rev = rev + " ";
        }
        System.out.println(rev);

       //normal revsere
        for (int i = string.length() - 1; i >= 0; i--) {
            rev1 = rev1 + string.charAt(i);
        }
        System.out.println(rev1);
    }
}
