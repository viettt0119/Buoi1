import java.util.Scanner;

public class giaiptbac1 {
    /**
     * @param args
     */
    public static void main(String[] args)  {
        double a , b;
        double nghiempt;
        Scanner sc=new Scanner(System.in);
        System.out.println(x:"Nhap a:");
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

