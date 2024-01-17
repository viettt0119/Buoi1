import java.util.Scanner;

public class phuongtrinhbac2 {
    public static void main(String[]args){
        double a,b,c,nghiem ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap a:");
        a=sc.nextDouble();
        System.out.println("Nhap b:");
        b=sc.nextDouble();
        System.out.println("Nhap c:");
        if(a==0){
            if(b==0){
                System.out.println("Phuong trinh vo nghiem");
            }
            else {
                System.out.println(x:"Phuong trinh co nghiem la : "+(-b/a));
            }
        }else {
            float delta=(b*b-4*b*c);
            float x1 ;
            float x2 ;
            if(delta>0){
                x1=(-b+Math.sqrt(detla))/2*a;
                x2=(-b-Math.sqrt(delta))/2*a;
                System.out.println(x:"Phuong trinh co 2 nghiem la :"+"x1"+x1+"x2"+x2);}
            else if(detla==0){
                x1=(-b/2*a);
                    System.out.println(x:"Phuong trinh co nghiem kep : x1=x2"+x1);
                }else (delta<0)
                {
                System.out.println(x:Phuong trinh vo nghiem );
                }
            }
        }
    }
}
