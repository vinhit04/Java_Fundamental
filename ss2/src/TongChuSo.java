import java.util.Scanner;

public class TongChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int N = scanner.nextInt();

        N = Math.abs(N);

        int tong = 0;


        while (N > 0) {
            int chuSo = N % 10;
            tong += chuSo;
            N = N / 10;
        }

        System.out.println("Tổng các chữ số là: " + tong);

        scanner.close();
    }
}
