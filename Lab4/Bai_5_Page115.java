import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class SinhVien {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    public SinhVien(String maSinhVien, String hoTen, String lop) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return "Ma sinh vien: " + maSinhVien + ", Ho ten: " + hoTen + ", Lop: " + lop;
    }
}

public class Bai_5_Page115 {
    public static void main(String[] args) {
        Map<String, SinhVien> danhSachSinhVien = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so luong sinh vien:");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sinh vien thu " + (i + 1) + ":");
            System.out.print("Ma sinh vien: ");
            String maSinhVien = scanner.nextLine();
            System.out.print("Ho va ten: ");
            String hoTen = scanner.nextLine();
            System.out.print("Lop: ");
            String lop = scanner.nextLine();

            SinhVien sinhVien = new SinhVien(maSinhVien, hoTen, lop);
            danhSachSinhVien.put(maSinhVien, sinhVien);
        }

        System.out.println("Nhap ten Lop de hien thi sinh vien:");
        String lopTimKiem = scanner.nextLine();
        System.out.println("Danh sach sinh vien thuoc lop " + lopTimKiem + ":");
        for (SinhVien sinhVien : danhSachSinhVien.values()) {
            if (sinhVien.getLop().equalsIgnoreCase(lopTimKiem)) {
                System.out.println(sinhVien);
            }
        }

        System.out.println("Nhap Ma sinh vien de hien thi thong tin:");
        String maSinhVienTimKiem = scanner.nextLine();
        SinhVien sv = danhSachSinhVien.get(maSinhVienTimKiem);
        if (sv != null) {
            System.out.println("Thong tin sinh vien:");
            System.out.println("Ho ten: " + sv.getHoTen());
            System.out.println("Lop: " + sv.getLop());
        } else {
            System.out.println("Khong tim thay sinh vien voi Ma sinh vien: " + maSinhVienTimKiem);
        }

        scanner.close();
    }
}
