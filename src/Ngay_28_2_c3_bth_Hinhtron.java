import java.util.Scanner;

public class Ngay_28_2_c3_bth_Hinhtron {
    //cac thuoc tinh
    float r;
    final float PI=3.14f;
    float chuVi;
    float dienTich;

//cac phuong thuc 
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
public static void main(String[] args) {
    Ngay_28_2_c3_bth_Hinhtron ht = new Ngay_28_2_c3_bth_Hinhtron();
    ht.nhapBanKinh();
    ht.tinhChuVivaDienTich();
    ht.inThongTin();
}
}