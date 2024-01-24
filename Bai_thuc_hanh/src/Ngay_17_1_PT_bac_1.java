import java.util.Scanner;

public class Ngay_17_1_PT_bac_1 {
        public static void main(String[] args)  {
        double a , b;
        double nghiempt;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a = sc.nextDouble();
        System.out.println("Nhap b:");
        b=sc.nextDouble();
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh co vo so nghiem ");
            }
            else {
            System.out.println("Phuong trinh vo nghiem ");
            }
        }else {
            nghiempt= (double) -b/a; 
        System.out.println("Phuong trinh co mot nghiem duy nhat :" +(nghiempt) ++ );
        }
    }
}

