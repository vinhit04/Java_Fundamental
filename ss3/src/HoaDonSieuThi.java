import java.util.Scanner;

public class HoaDonSieuThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Nhập tên khách hàng: ");
        String tenKH = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String tenSP = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double gia = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int soLuong = sc.nextInt();

        System.out.print("Có thẻ thành viên không (true/false): ");
        boolean thanhVien = sc.nextBoolean();


        double thanhTien = gia * soLuong;

        double giamGia = 0;
        if (thanhVien) {
            giamGia = thanhTien * 0.10;
        }

        double tienSauGiam = thanhTien - giamGia;
        double vat = tienSauGiam * 0.08;

        double tongTien = tienSauGiam + vat;


        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.println("Khách hàng: " + tenKH);
        System.out.println("Sản phẩm: " + tenSP);
        System.out.println("Số lượng: " + soLuong);
        System.out.println("Đơn giá: " + gia);
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("VAT (8%): " + vat);
        System.out.println("Tổng thanh toán: " + tongTien);
    }
}
