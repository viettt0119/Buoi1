package Package;


import java.util.Scanner;

public class Person {
    String Ten;
    int Tuoi;
    
    public void nhapthongtin(){
        System.out.println("Nhap thong tin :");
        Scanner sc = new Scanner(System.in);
        Ten = sc.nextLine();
        Tuoi= sc.nextInt();
        sc.close();

    }
    public void Inthongtin(){
        System.out.println(Ten);
        System.out.println(Tuoi);
    }
    public void Inthongtin(String Ten ,int Tuoi){
        System.out.println(Ten);
        System.out.println(Tuoi);
    
    }
    public Person(){
        Ten = "tran tuan viet ";
        Tuoi= 19;
    }
}



