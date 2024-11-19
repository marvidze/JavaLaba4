package realization;

import java.util.Vector;

public class UserNumber {

  /**
   * Числовое значение элемента вектора
   */
  protected double _value;

  /**
   * Вектор для хранения элементов
   */
  private static Vector<UserNumber> _vector;

  /**
   * Итератор для статического вектора _vector
   */
  private static UserIterator<UserNumber> _iterator;

  /**
   * Конструктор с параметрами для класса UserNumber
   * 
   * @param value Значение элемента вектора
   */
  public UserNumber(double value) {
    _value = value;
  };

  /**
   * Конструктор по умолчанию для класса UserNumber
   */
  public UserNumber() {
    _value = 0;
  }

  /**
   * Метод разделяет строку на числа типа double и вносит их в статический вектор
   * 
   * @param line Строка с данными
   */
  static public void splitLine(String line) {
    String[] arrayLine = line.split(" ");
    _vector = new Vector<UserNumber>(arrayLine.length);

    for (int i = 0; i < arrayLine.length; i++) {
      _vector.add(new UserNumber(Double.parseDouble(arrayLine[i])));
    }

    _iterator = new UserIterator<UserNumber>(_vector);

  }

  /**
   * Метод сортирует вектор
   */
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

  /**
   * Метод создаёт строку значений элементов статического вектора
   * 
   * @return строка значений элементов статического вектора
   */
  public static String getStringValue() {
    String vectorString = new String();
    while (_iterator.hasNext()) {
      vectorString += _iterator.next()._value + " ";
    }

    return vectorString;
  }

  /**
   * Метод для получения медианного значения статического вектора
   * 
   * @return Если длина вектора нечетная - центральный элемент |
   *         Если длина вектора четная - 2 центральных элемента
   */
  public static String getMedianValue() {
    if (_vector.size() % 2 != 0) {

      Double result = _vector.get(_vector.size() / 2)._value;
      return result.toString();
    } else {

      Double firstNumber = _vector.get(_vector.size() / 2 - 1)._value;
      Double secondNumber = _vector.get(_vector.size() / 2)._value;

      return firstNumber.toString() + " " + secondNumber.toString();
    }
  }

  /**
   * Метод для получения среднего значения всех элементов статического вектора
   * 
   * @return Среднее значение всех эелементов статического вектора
   */
  public static String getAverageValue() {
    double sum = 0.0;
    for (UserNumber element : _vector) {
      sum += element._value;
    }
    Double result = sum / _vector.size();
    return result.toString();
  }
}
