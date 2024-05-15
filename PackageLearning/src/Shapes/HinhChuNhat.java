package Shapes;

import java.util.Scanner;

public class HinhChuNhat {
    float Dai;
    float Rong;
    Float Chuvi;
    Float Dientich;
public void nhapChieudai(){
    System.out.println("Nhap chieu dai ");
    Scanner sc= new Scanner(System.in);
    Dai = sc.nextFloat();
    sc.close();
}
public void nhapChieurong(){
    System.out.println("Nhap chieu rong");
    Scanner sc= new Scanner(System.in);
    Rong = sc.nextFloat();
    sc.close();
}
public void tinhChuVi(){
   Chuvi= 2*(Dai + Rong );

}
public void tinhDienTich(){
    Dientich= Dai * Rong;
}
public void inChuvi(){
    System.out.println("Chu vi ="+Chuvi);
}
public void inDientich(){
    System.out.println("Dien tich ="+Dientich);
}
}
