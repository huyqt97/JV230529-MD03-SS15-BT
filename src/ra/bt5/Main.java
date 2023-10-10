package ra.bt5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        try {
            System.out.print("Nhập số nguyên thứ nhất: ");
            num1 = scanner.nextInt();
            System.out.print("Nhập số nguyên thứ hai: ");
            num2 = scanner.nextInt();
            System.out.println("Tổng: " + (num1 + num2));
            System.out.println("Hiệu: " + (num1 - num2));
            System.out.println("Tích: " + (num1 * num2));

            try {
                System.out.println("Thương: " + num1 / num2);
            } catch (ArithmeticException e) {
                System.out.println("không chia được cho 0");
                main(args);
            }
        } catch (InputMismatchException e) {
            System.out.println("Đây không phải là số nguyên. Vui lòng nhập lại.");
            main(args);
        }


    }
}
