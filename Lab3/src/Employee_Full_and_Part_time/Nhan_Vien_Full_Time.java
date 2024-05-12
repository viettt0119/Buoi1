package Employee_Full_and_Part_time;

import java.util.Scanner;

public class Nhan_Vien_Full_Time extends NhanVien {
    public long soNgayLamViec;
    public Nhan_Vien_Full_Time(){
        chucVu = "Nhan Vien Fulltime!!";
        luong = 50000;
    }
    public void nhapSoNgay(){
        super.nhapthongtin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("So ngay lam viec: ");
        soNgayLamViec = scanner.nextLong();
        scanner.close();
    }
    public void tinhLuong(){
        luong = soNgayLamViec*luong;
    }
}