import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Guest on 8/1/17.
 */
public class ScrabbleTest {

    @Test
    public void getValues_returnScoreSingleLetter_ArrayList() {
        Scrabble testScrabble = new Scrabble ();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        assertEquals(expectedOutput, testScrabble.getValues("a"));

    }
    @Test
    public void getValues_returnScoresTwoLetters_ArrayList() {
        Scrabble testScrabble = new Scrabble ();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(1);
        assertEquals(expectedOutput, testScrabble.getValues("aa"));
    }

    @Test
    public void calculateScore_returnTotalScoresTwoLetters_Integer() {
        Scrabble testScrabble = new Scrabble ();
        Integer expectedOutput;
        expectedOutput = 2;
        assertEquals(expectedOutput, testScrabble.calculateScore("aa"));
    }

    @Test
    public void getValues_returnScoresThreeLetters_ArrayList() {
        Scrabble testScrabble = new Scrabble ();
        List<Object> expectedOutput = new ArrayList<Object>();
        expectedOutput.add(1);
        expectedOutput.add(1);
        expectedOutput.add(2);
        assertEquals(expectedOutput, testScrabble.getValues("aed"));
    }
    @Test
    public void calculateScore_returnTotalScoresThreeLetters_Integer() {
        Scrabble testScrabble = new Scrabble ();
        Integer expectedOutput;
        expectedOutput = 4;
        assertEquals(expectedOutput, testScrabble.calculateScore("aed"));
    }

    @Test
    public void calculateScore_returnTotalScoresRandomLetters_Integer() {
        Scrabble testScrabble = new Scrabble ();
        Integer expectedOutput;
        expectedOutput = 33;
        assertEquals(expectedOutput, testScrabble.calculateScore("adbfkjq"));
    }



}