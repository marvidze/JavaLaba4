package UI;

import java.util.Scanner;

public class UI {

    public UI() {
    };

    static public String input() {
        System.out.println("Введите данные типа double для заполнения вектора");
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        String phoneNumber = scan.nextLine();
        return phoneNumber;
    }

    public void run() {

    }
}
