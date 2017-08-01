import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Guest on 8/1/17.
 */
public class Scrabble {

    public Integer calculateScore (String userWord) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        result = getValues(userWord);

        int sum = 0;
        for (Integer value: result){
            sum += value;
        }
        return sum;
    }

    public  ArrayList<Integer> getValues (String word){
        char[] letters;
        ArrayList<Integer> values = new ArrayList<Integer>();
        Map<Character, Integer> letterValuesMap = new HashMap<Character, Integer>();
        letterValuesMap.put('a',1);
        letterValuesMap.put('e',1);
        letterValuesMap.put('i',1);
        letterValuesMap.put('o',1);
        letterValuesMap.put('u',1);
        letterValuesMap.put('l',1);
        letterValuesMap.put('n',1);
        letterValuesMap.put('r',1);
        letterValuesMap.put('s',1);
        letterValuesMap.put('t',1);
        letterValuesMap.put('d',2);
        letterValuesMap.put('g',2);
        letterValuesMap.put('b',3);
        letterValuesMap.put('c',3);
        letterValuesMap.put('m',3);
        letterValuesMap.put('f',4);
        letterValuesMap.put('f',4);
        letterValuesMap.put('v',4);
        letterValuesMap.put('w',4);
        letterValuesMap.put('y',4);
        letterValuesMap.put('k',5);
        letterValuesMap.put('j',8);
        letterValuesMap.put('x',8);
        letterValuesMap.put('q',10);
        letterValuesMap.put('z',10);


        letters = word.toCharArray();
        for (char letter: letters){
            Character wrapperLetter = letter;
            int value = letterValuesMap.get(wrapperLetter);
            values.add(value);
        }
        return values;
    }

}
