package org.devvictor;

import java.util.Scanner;

public class FindChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma frase: ");

        String text = scanner.nextLine();

        char letter = 'a';
        int occurrences = getLetterOccurrences(text, letter);

        System.out.format("A letra %c foi encontrada %d vezes na frase", letter, occurrences);
    }

    public static int getLetterOccurrences(String text, char letter) {
        String lowerCaseText = text.toLowerCase();

        int occurrences = 0;

        for (int i = 0; i < text.length(); i++) {
            if (lowerCaseText.charAt(i) == letter) {
                occurrences++;
            }
        }

        return occurrences;
    }
}
