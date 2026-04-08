import java.util.Scanner;

public class Tinhbankinhhinhtron {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập bán kính: ");
        double radius = scanner.nextDouble();


        double area = Math.PI * radius * radius;


        area = Math.round(area * 100.0) / 100.0;


        System.out.println("Diện tích: " + area);
    }
}
