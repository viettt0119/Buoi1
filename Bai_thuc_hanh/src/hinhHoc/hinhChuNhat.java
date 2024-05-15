package hinhHoc;

import java.util.Scanner;

public class hinhChuNhat extends hinhHoc {
    public float cdai;
    public float crong;
    public hinhChuNhat()
    {
        ten ="Hinh Chu Nhat";
    }
    public void nhapChieuDai()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Chieu dai la: ");
        cdai=sc.nextFloat();
        sc.close();
    }
    public void nhapChieuRong()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Chieu rong la: ");
        crong=sc.nextFloat();
        sc.close();
    }
    public void tinhChuVi()
    {
        chuVi=2*(cdai+crong);
    }
    public void tinhDienTich()
    {
        dienTich=cdai*crong;
    }
}
