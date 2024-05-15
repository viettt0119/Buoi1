package hinhHoc;

import java.util.Scanner;

public class hinhVuong extends hinhChuNhat{
    public hinhVuong()
    {
        ten="Hinh Vuong";
    }
    public void nhapCanh()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Canh la: ");
        cdai=crong=sc.nextFloat();
        sc.close();
    }
}
