package UI;

import java.util.Scanner;

import realization.UserVector;
import realization.UserWriter;

public class UI {

    public UI() {
    };

    static private String input() {
        System.out.println("Введите данные типа double для заполнения вектора");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        return phoneNumber;
    }

    static private void printVector(UserVector vector) {
        System.out.println(vector.getStringVector());
        System.out.println("");
    }

    public void run() {
        UserVector vector = new UserVector(UserVector.splitLine(input()));
        System.out.println("Начальный вектор: ");
        printVector(vector);
        System.out.println("Сортированный вектор: ");
        vector.vectorSort();
        printVector(vector);
        System.out.println("Среднее значение вектора: ");

        System.out.println("Медианное значение вектора: ");

    }
}
