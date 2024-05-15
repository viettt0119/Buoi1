package Chuong_4;
import java.util.Scanner;
import java.util.HashSet;  
public class Ngay_15_05_page56 {
    public static void main(String[] args) {
        String name;
        HashSet<String> hashSetString = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSetString.add("Willson");
        hashSetString.add("Nike");
        hashSetString.add("Volvo");
        hashSetString.add("Kia");
        hashSetString.add("Lenovo");
        hashSetString.add("Lenovo");
        System.out.println("cac phan tu trong hashSetString");
        System.out.println(hashSetString);
        System.out.println("Nhap phan tu can xoa  ");
        name =sc.nextLine();
        if(hashSetString.contains(name)){
            hashSetString.remove(name );
            System.out.println("xoa thanh cong ");
            System.out.println("cac phan tu con lai trong hashSetString");
            System.out.println(hashSetString);

        }else{
            System.out.println("Xoa khong thanh cong ");
        }sc.close();
    }
}
