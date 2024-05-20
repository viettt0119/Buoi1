import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    private String hoTen;
    private double diem;

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    @Override
    public String toString() {
        return "Ho ten: " + hoTen + ", Diem: " + diem;
    }
}

public class Bai_3_Page113 {
    public static void main(String[] args) {
        List<SinhVien> danhSachSinhVien = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap ten sinh vien :");
            String hoTen = scanner.nextLine();
            if (hoTen.isEmpty()) {
                break;
            }
            System.out.println("Nhap diem sinh vien:");
            double diem = Double.parseDouble(scanner.nextLine());

            SinhVien sinhVien = new SinhVien(hoTen, diem);
            danhSachSinhVien.add(sinhVien);
        }

        System.out.println("Danh sach sinh vien phai thi lai (diem <= 5):");
        int countThiLai = 0;
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiem() <= 5) {
                System.out.println(sinhVien);
                countThiLai++;
            }
        }
        System.out.println("So sinh vien phai thi lai: " + countThiLai);

        System.out.println("Danh sach sinh vien co diem cao nhat:");
        double maxDiem = 0;
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiem() > maxDiem) {
                maxDiem = sinhVien.getDiem();
            }
        }
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiem() == maxDiem) {
                System.out.println(sinhVien);
            }
        }

        System.out.println("Nhap ten sinh vien de tim kiem:");
        String tenTimKiem = scanner.nextLine();
        boolean found = false;
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getHoTen().equalsIgnoreCase(tenTimKiem)) {
                System.out.println("Thong tin sinh vien tim thay:");
                System.out.println(sinhVien);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay sinh vien voi ten: " + tenTimKiem);
        }
        scanner.close();
    }
}
