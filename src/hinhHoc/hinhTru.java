package hinhHoc;

import java.util.Scanner;

public class hinhTru extends hinhTron{
    public float cCao;
    public hinhTru()
    {
        ten="Hinh Tru";
    }
    public void nhapChieuCao()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Chieu cao la: ");
        cCao=sc.nextFloat();
        sc.close();
    }
    public void tinhTheTich()
    {
        theTich=cCao*super.dienTich;
    }
}
