package realization;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;

public class UserIterator<T> implements Iterator<T> {

  /**
   * Вектор с которым работает итератор
   */
  private Vector<T> _vector;

  /**
   * Текущий индекс элемента в вкеторе
   */
  private int _currentIndex = 0;

  /**
   * Конструктор с параметрами для класса UserIterator
   * 
   * @param vector вектоор для итерации
   */
  public UserIterator(Vector<T> vector) {
    _vector = vector;
  }

  /**
   * Проверка на наличие следующего элемента
   * 
   * @return true если есть | false если нет
   */
  @Override
  public boolean hasNext() {
    if (_currentIndex < _vector.size()) {
      return true;
    } else {
      _currentIndex = 0;
      return false;
    }
  }

  /**
   * Получение следующего элемента
   * 
   * @return следующий элемент
   */
  @Override
  public T next() {
    if (!hasNext()) {
      throw new NoSuchElementException();
    }
    return _vector.get(_currentIndex++);
  }

  @Override
  public void remove() {
    throw new UnsupportedOperationException("Remove operation is not supported.");
  }
}
