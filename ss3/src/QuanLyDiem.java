import java.util.Scanner;

public class QuanLyDiem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chon;


        int count = 0;
        double tong = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        do {

            System.out.println("\n************** MENU NHẬP ĐIỂM **************");
            System.out.println("1. Nhập điểm học viên");
            System.out.println("2. Hiển thị thống kê");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1:

                    while (true) {
                        System.out.print("Nhập điểm (-1 để kết thúc): ");
                        double diem = sc.nextDouble();


                        if (diem == -1) {
                            break;
                        }


                        if (diem < 0 || diem > 10) {
                            System.out.println(" Điểm không hợp lệ! Nhập lại.");
                            continue;
                        }


                        String xepLoai;
                        if (diem < 5) {
                            xepLoai = "Yếu";
                        } else if (diem < 7) {
                            xepLoai = "Trung Bình";
                        } else if (diem < 8) {
                            xepLoai = "Khá";
                        } else if (diem < 9) {
                            xepLoai = "Giỏi";
                        } else {
                            xepLoai = "Xuất sắc";
                        }

                        System.out.println("=> Xếp loại: " + xepLoai);


                        count++;
                        tong += diem;

                        if (diem > max) {
                            max = diem;
                        }

                        if (diem < min) {
                            min = diem;
                        }
                    }
                    break;

                case 2:

                    if (count == 0) {
                        System.out.println("Chưa có dữ liệu");
                    } else {
                        double trungBinh = tong / count;

                        System.out.println("\n===== THỐNG KÊ =====");
                        System.out.println("Số học viên: " + count);
                        System.out.println("Điểm trung bình: " + trungBinh);
                        System.out.println("Điểm cao nhất: " + max);
                        System.out.println("Điểm thấp nhất: " + min);
                    }
                    break;

                case 3:
                    System.out.println(" Kết thúc chương trình!");
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Lựa chọn không hợp lệ!");
            }

        } while (true);
    }
}
