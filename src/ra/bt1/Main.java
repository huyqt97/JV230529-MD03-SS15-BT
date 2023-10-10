package ra.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soThuNhat, soThuHai;
        try {
            System.out.println("nhập số thứ 1 :");
            soThuNhat = Integer.parseInt(sc.nextLine());

            System.out.println("nhập số thứ 2 :");
            soThuHai = Integer.parseInt(sc.nextLine());

            System.out.println("số 1 + số 2 = " + (soThuNhat + soThuHai));
        } catch (Exception e) {
            System.out.println("lỗi");
            main(args);
        }
    }
}
