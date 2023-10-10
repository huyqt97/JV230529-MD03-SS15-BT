package ra.bt2;

public class Main {
    public static void main(String[] args) {
        int[] arr = {};
        try {
            int maxNumber = findMaxNumber(arr);
            System.out.println("số lớn nhất :" + maxNumber);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static int findMaxNumber(int[] arr) throws Exception {
        if (arr.length == 0) {
            throw new Exception("Mảng rỗng");
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
