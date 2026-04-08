import java.util.Scanner;

public class Tonghaiphanso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tu1, mau1;
        int tu2, mau2;


        System.out.print("Nhập tử số phân số 1: ");
        tu1 = scanner.nextInt();
        System.out.print("Nhập mẫu số phân số 1: ");
        mau1 = scanner.nextInt();


        System.out.print("Nhập tử số phân số 2: ");
        tu2 = scanner.nextInt();
        System.out.print("Nhập mẫu số phân số 2: ");
        mau2 = scanner.nextInt();


        int tuTong = tu1 * mau2 + tu2 * mau1;
        int mauTong = mau1 * mau2;


        System.out.println("\n--- Kết quả ---");
        System.out.println("Tổng hai phân số = " + tuTong + "/" + mauTong);

        scanner.close();
    }
}
