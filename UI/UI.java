package UI;

import java.util.Scanner;

import realization.UserNumber;
import realization.UserWriter;

public class UI {

  public UI() {
  };

  static private String input() {
    boolean flag = true;
    while (flag) {
      try {
        System.out.println("Введите данные типа double для заполнения вектора");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        flag = false;
        return phoneNumber;
      } catch (Exception ex) {
        System.out.println("Введите данные типа DOUBLE ЧЕРЕЗ ПРОБЕЛ!!!");
      }
    }
    return null;

  }

  static private void printVector() {
    System.out.println(UserNumber.getStringValue());
    System.out.println("");
  }

  public void run() {
    String[] arrayData = new String[4];
    UserNumber.splitLine(input());
    System.out.print("Начальный вектор: ");
    printVector();
    arrayData[0] = UserNumber.getStringValue();
    System.out.print("Сортированный вектор: ");
    UserNumber.vectorSort();
    arrayData[1] = UserNumber.getStringValue();
    printVector();
    System.out.print("Среднее значение вектора: ");
    System.out.println(UserNumber.getAverageValue());
    arrayData[2] = UserNumber.getAverageValue();
    System.out.print("Медианное значение вектора: ");
    arrayData[3] = UserNumber.getMedianValue();
    System.out.println(UserNumber.getMedianValue());
    UserWriter.WriteIntoFile(arrayData);
  }
}
