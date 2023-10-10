package ra.bt3;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = calculateSum(arr);
        System.out.println("Tổng của mảng là :" + sum);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            try {
                sum = sum + num;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi : phần tử ko phải số nguyên " + num);
            }
        }
        return sum;
    }
}
