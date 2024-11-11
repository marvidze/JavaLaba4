package realization;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class UserVector {

    private Vector<Double> vector;

    public UserVector(Double[] arrayNumbers) {
        vector = new Vector<>(Arrays.asList(arrayNumbers));
    };

    public UserVector() {
        vector = new Vector<>();
    }

    static public Double[] splitLine(String line) {
        String[] arrayLine = line.split(" ");
        Double[] arrayNumbers = new Double[arrayLine.length];

        for (int i = 0; i < arrayLine.length; i++) {
            arrayNumbers[i] = Double.parseDouble(arrayLine[i]);
        }

        return arrayNumbers;
    }

    public void vectorSort() {
        Collections.sort(vector);
    }

    public String getStringVector() {
        String vectorString = new String();
        for (int i = 0; i < vector.size(); i++) {
            vectorString += vector.get(i) + " ";
        }

        return vectorString;
    }
}
