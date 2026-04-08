import java.util.Scanner;

public class TongTu1DenN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên dương N: ");
        int N = scanner.nextInt();


        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int tong = 0;


            for (int i = 1; i <= N; i++) {
                tong += i;
            }

            System.out.println("Tổng từ 1 đến " + N + " là: " + tong);
        }

        scanner.close();
    }
}
