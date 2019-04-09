import java.io.IOException;

import java.util.Scanner;

public class Remove_words {

public static void main(String[] args) throws IOException {

    String[] s;
    String sentence, word;
    
    System.out.println("Enter the sentence");
    
    Scanner sc = new Scanner(System.in);

    sentence = sc.nextLine();

    System.out.println("Enter the word to be deleted");
    word = sc.nextLine();

    String finalSentence = "";

    s = sentence.split(" ");

    for (String item : s) {
        if (word.equals(item)) {
            
        }
         else {
            finalSentence += item + " ";
        }
    }

    System.out.println("final sentence is :: " + finalSentence);
    sc.close();

}
}