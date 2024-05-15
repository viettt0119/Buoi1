package Chuong_4;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
public class Ngay_15_05_page60 {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("Java");
        linkedHashSet.add("C++");
        linkedHashSet.add("Java");
        linkedHashSet.add("PHP");
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("cac phan tu trong linkedHashSet");
        System.out.println(linkedHashSet);
        System.out.println("Nhap phan tu can xoa  ");
        str =sc.nextLine();
        if(linkedHashSet.contains(str)){
            linkedHashSet.remove(str);
            System.out.println("xoa thanh cong ");
            System.out.println("cac phan tu con lai trong hashSetString");
            System.out.println(linkedHashSet);

        }else{
            System.out.println("Xoa khong thanh cong ");
            for (String s : linkedHashSet){
                System.out.println(str);
            }

        }sc.close();
    }
}

