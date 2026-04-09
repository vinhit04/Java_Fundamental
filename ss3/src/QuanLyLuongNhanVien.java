import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyLuongNhanVien {

    static ArrayList<Double> dsLuong = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            hienThiMenu();
            System.out.print("Chọn chức năng: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:
                    nhapLuong(sc);
                    break;
                case 2:
                    hienThiThongKe();
                    break;
                case 3:
                    tinhThuong();
                    break;
                case 4:
                    System.out.println("Kết thúc chương trình!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (true);
    }


    public static void hienThiMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Nhập lương nhân viên");
        System.out.println("2. Hiển thị thống kê");
        System.out.println("3. Tính tổng tiền thưởng");
        System.out.println("4. Thoát");
    }


    public static void nhapLuong(Scanner sc) {
        double luong;

        while (true) {
            System.out.print("Nhập lương (-1 để kết thúc): ");
            luong = sc.nextDouble();

            if (luong == -1) {
                break;
            }

            if (luong < 0 || luong > 500_000_000) {
                System.out.println("Lương không hợp lệ! (0 - 500 triệu)");
                continue;
            }

            dsLuong.add(luong);


            if (luong < 5_000_000) {
                System.out.println("→ Thu nhập thấp");
            } else if (luong <= 15_000_000) {
                System.out.println("→ Thu nhập trung bình");
            } else if (luong <= 50_000_000) {
                System.out.println("→ Thu nhập khá");
            } else {
                System.out.println("→ Thu nhập cao");
            }
        }
    }


    public static void hienThiThongKe() {
        if (dsLuong.isEmpty()) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        double tong = 0;
        double max = dsLuong.get(0);
        double min = dsLuong.get(0);

        for (double luong : dsLuong) {
            tong += luong;

            if (luong > max) {
                max = luong;
            }

            if (luong < min) {
                min = luong;
            }
        }

        double trungBinh = tong / dsLuong.size();

        System.out.println("\n===== THỐNG KÊ =====");
        System.out.println("Số nhân viên: " + dsLuong.size());
        System.out.println("Lương trung bình: " + trungBinh);
        System.out.println("Lương cao nhất: " + max);
        System.out.println("Lương thấp nhất: " + min);
        System.out.println("Tổng lương: " + tong);
    }


    public static void tinhThuong() {
        if (dsLuong.isEmpty()) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        double tongThuong = 0;

        for (double luong : dsLuong) {
            double thuong = 0;

            if (luong <= 5_000_000) {
                thuong = luong * 0.05;
            } else if (luong <= 15_000_000) {
                thuong = luong * 0.10;
            } else if (luong <= 50_000_000) {
                thuong = luong * 0.15;
            } else if (luong <= 100_000_000) {
                thuong = luong * 0.20;
            } else {
                thuong = luong * 0.25;
            }

            tongThuong += thuong;
        }

        System.out.println("Tổng tiền thưởng: " + tongThuong);
    }
}