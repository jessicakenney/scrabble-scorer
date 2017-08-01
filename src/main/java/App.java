import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Guest on 8/1/17.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String inputWord = bufferedReader.readLine();
            Scrabble myScrabble = new Scrabble ();
            System.out.println("Your Score is: "+ myScrabble.calculateScore(inputWord));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
