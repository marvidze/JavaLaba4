package realization;

import java.util.Arrays;
import java.util.Vector;

public class UserVector {

    private Vector<Boolean> vector;

    public UserVector(boolean arrayNumbers) {
        vector = new Vector<>(Arrays.asList(arrayNumbers));
    };

    static public boolean[] splitLine(String line) {
        String[] arrayLine = line.split(" ");
        boolean[] arrayNumbers = new boolean[arrayLine.length];

        for (int i = 0; i < arrayLine.length; i++) {
            arrayNumbers[i] = Boolean.parseBoolean(arrayLine[i]);
        }

        return arrayNumbers;

    }
}
