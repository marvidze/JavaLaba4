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

    static private void printVector(UserNumber vector) {
        System.out.println(vector.getStringValue());
        System.out.println("");
    }

    public void run() {
        String[] arrayData = new String[4];
        UserNumber vector = new UserNumber(UserNumber.splitLine(input()));
        System.out.print("Начальный вектор: ");
        printVector(vector);
        arrayData[0] = vector.getStringValue();
        System.out.print("Сортированный вектор: ");
        vector.vectorSort();
        arrayData[1] = vector.getStringValue();
        printVector(vector);
        System.out.print("Среднее значение вектора: ");
        System.out.println(vector.getAverageValue());
        arrayData[2] = vector.getAverageValue();
        System.out.print("Медианное значение вектора: ");
        arrayData[3] = vector.getMedianValue();
        System.out.println(vector.getMedianValue());
        UserWriter.WriteIntoFile(arrayData);
    }
}
