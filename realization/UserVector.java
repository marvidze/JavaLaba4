package realization;

public class UserVector {

    private Vector<Double> vector;

    public UserVector(Double[] arrayNumbers) {
        vector = new Vector<>(Arrays.asList(arrayNumbers));
    };

    static public Double[] splitLine(String line) {
        String[] arrayLine = line.split(" ");
        Double[] arrayNumbers = new Double[arrayLine.length];

        for (int i = 0; i < arrayLine.length; i++) {
            arrayNumbers[i] = Double.parseDouble(arrayLine[i]);
        }

        return arrayNumbers;
    }

    public void getStringVector() {
        System.out.println(vector.size());
    }
}
