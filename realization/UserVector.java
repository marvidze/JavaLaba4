package realization;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class UserVector {

    private Vector<Double> vector;
    private String medianValue;
    private String averageValue;

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

    public String getStringValue() {
        String vectorString = new String();
        for (int i = 0; i < vector.size(); i++) {
            vectorString += vector.get(i) + " ";
        }

        return vectorString;
    }

    public String getMedianValue() {
        if (vector.size() % 2 != 0) {
            // Если длина вектора нечетная, возвращаем центральный элемент
            return (vector.get(vector.size() / 2)).toString();
        } else {
            // Если длина вектора четная, возвращаем среднее двух центральных элементов
            Double a = vector.get(vector.size() / 2 - 1);
            Double b = vector.get(vector.size() / 2);
            Double c = a + b;
            return c.toString();
        }
    }

    public String getAverageValue() {
        double sum = 0.0;
        for (Double value : vector) {
            sum += value;
        }
        Double result = sum / vector.size();
        return result.toString();
    }
}
