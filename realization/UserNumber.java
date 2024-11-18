package realization;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class UserNumber {

  private double _value;
  private static Vector<UserNumber> _vector;

  public UserNumber(double value) {
    _value = value;
  };

  public UserNumber() {
    _value = 0;
  }

  static public void splitLine(String line) {
    String[] arrayLine = line.split(" ");
    _vector = new Vector<UserNumber>(arrayLine.length);

    for (int i = 0; i < arrayLine.length; i++) {
      _vector.add(new UserNumber(Double.parseDouble(arrayLine[i])));
    }

  }

  public static void vectorSort() {
    for (int left = 0; left < _vector.size(); left++) {
      int minInd = left;
      for (int i = left; i < _vector.size(); i++) {
        if (_vector.get(i)._value < _vector.get(minInd)._value) {
          minInd = i;
        }
      }

      UserNumber tmp = _vector.get(left);
      _vector.set(left, _vector.get(minInd));
      _vector.set(minInd, tmp);
    }

  }

  public static String getStringValue() {
    String vectorString = new String();
    for (int i = 0; i < _vector.size(); i++) {
      vectorString += _vector.get(i)._value + " ";
    }

    return vectorString;
  }

  public static String getMedianValue() {
    if (_vector.size() % 2 != 0) {
      // Если длина вектора нечетная, возвращаем центральный элемент
      Double result = _vector.get(_vector.size() / 2)._value;
      return result.toString();
    } else {
      // Если длина вектора четная, возвращаем среднее двух центральных элементов
      Double firstNumber = _vector.get(_vector.size() / 2 - 1)._value;
      Double secondNumber = _vector.get(_vector.size() / 2)._value;

      return firstNumber.toString() + " " + secondNumber.toString();
    }
  }

  public static String getAverageValue() {
    double sum = 0.0;
    for (UserNumber element : _vector) {
      sum += element._value;
    }
    Double result = sum / _vector.size();
    return result.toString();
  }
}
