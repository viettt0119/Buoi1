package Employee_Full_and_Part_time;

import java.util.Scanner;

public class Nhan_Vien_Part_Time extends NhanVien {
    public long soGioLamViec;
    public Nhan_Vien_Part_Time(){
        chucVu = "Nhan vien parttime!!";
        luong = 30000;
    }
    public void nhapCong(){
        super.nhapthongtin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("So gio lam viec: ");
        soGioLamViec = scanner.nextLong();
        scanner.close();
    }
    public void tinhLuong(){
        luong = luong*soGioLamViec;
    }
}