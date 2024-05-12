package Employee_Full_and_Part_time;

import java.util.Scanner;

public class NhanVien extends Person{
    public String chucVu;
    public String maNhanVien;
    public long luong;
public void nhapthongtin(){
    super.nhapthongtin();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ma nhan vien: ");
    maNhanVien = scanner.nextLine();
    scanner.close( );
}
public void xuatthongin(){
    super.xuatthongin();
    System.out.println("Chuc vu: " + chucVu);
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Luong: " + luong);
}
}