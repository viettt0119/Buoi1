package Chuong_4;
import java.util.LinkedList;
import java.util.Scanner;
public class Ngay_08_05_page41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Thang 1");
        linkedList.add("Thang 2");
        linkedList.add("Thang 3");
        linkedList.add("Thang 4");
        linkedList.add("Thang 5");
        linkedList.add("Thang 6");
        linkedList.add("Thang 7");
        linkedList.add("Thang 8");
        linkedList.add("Thang 9");
        linkedList.add("Thang 10");
        linkedList.add("Thang 11");
        linkedList.add("Thang 12");
        System.out.println("Nhap vao chi so cua phan tu can lay ");
        int index = sc.nextInt();
        if ((index<0)||(index>(linkedList.size()-1))){
            System.out.println(" Chi so nay can lay nho hon 0 vaf nho hon"+(linkedList.size()-1));

        }else
        {
            String node = linkedList.get(index);
            System.out.println("phan tu co chi so "+ index + " trong linkedlist la"+ node);
        }
        String fistNode = linkedList.getFirst();
        String lastNode = linkedList.getLast();
        System.out.println("\n Phan tu dau tien trong danh sach la "+ fistNode+"; Phan tu cuoi trong danh sach la "+ lastNode);
    }
}
