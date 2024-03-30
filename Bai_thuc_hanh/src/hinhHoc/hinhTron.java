package hinhHoc;

import java.util.Scanner;

public class hinhTron extends hinhHoc{
    public float banKinh;
    hinhTron()
    {
        ten="Hinh Tron";
    }
    public void nhapBanKinh()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Ban kinh la: ");
        banKinh=sc.nextInt();
        sc.close();



        
    }
    public void tinhChuVi()
    {
        chuVi=2*banKinh*pi;
    }
    public void tinhDienTich()
    {
        dienTich=pi*banKinh*banKinh;
    }
}
