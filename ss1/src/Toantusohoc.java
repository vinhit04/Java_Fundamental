import java.util.Scanner;

public class Toantusohoc {
    public static void main(String[] args) {

        int firstNumber;
        int secondNumber;


        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số thứ nhất (firstNumber): ");
        firstNumber = scanner.nextInt();

        System.out.print("Nhập số thứ hai (secondNumber): ");
        secondNumber = scanner.nextInt();


        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;
        int remainder = firstNumber % secondNumber;


        System.out.println("\n--- Kết quả ---");
        System.out.println("firstNumber = " + firstNumber);
        System.out.println("secondNumber = " + secondNumber);
        System.out.println("Tổng = " + sum);
        System.out.println("Hiệu = " + difference);
        System.out.println("Tích = " + product);
        System.out.println("Thương = " + quotient);
        System.out.println("Phần dư = " + remainder);

        scanner.close();
    }
}
