package realization;

import java.util.Arrays;
import java.util.Vector;

public class UserVector {

    private Vector<Boolean> vector;

    public UserVector() {

    };

    public

    static public void splitLine(String line) {
        String[] arrayLine = line.split(" ");
        Boolean[] arrayNumbers;

        for (int i = 0; i < arrayLine.length; i++) {
            arrayNumbers[i] = Boolean.parseBoolean(arrayLine[i]);
        }

        vector = new Vector<>(Arrays.asList(arrayNumbers));

    }
}
