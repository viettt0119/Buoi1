package Shapes;
import java.util.Scanner;
public class HinhTron {
    float r;
    final float PI=3.14f;
    float chuVi;
    float dienTich;

public void nhapBanKinh(){
    System.out.println("R=");
    Scanner scanner = new Scanner(System.in); 
        r= scanner.nextFloat();
        scanner.close();
    
}
public void tinhChuVivaDienTich(){
    chuVi=2*PI*r;
    dienTich=PI*r*r;
}
public void inThongTin(){
    System.out.println("Chu vi"+ chuVi);
    System.out.println("Dien tich"+ dienTich);
}
}