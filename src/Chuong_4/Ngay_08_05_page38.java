package Chuong_4;
import java.util.LinkedList;
public class Ngay_08_05_page38 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Java");
        list.add("C#");
        list.add("C++");
        System.out.println("vi du su dung phuong thuc ");
        System.out.println("--------------------------");
        // them cac phan tu vao listA
        LinkedList<String> listA= new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:");
        showList(listA);
        // retainAll()
        System.out.println("/n vi du khoi tao rentainAll()");
        System.out.println("------------------------------");
        //List B
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("java");
        listA.retainAll(listB);
        System.out.println(listA);
        showList(listA);
        // removeAll()
        System.out.println("vi du ve phuong thuc removeAll()");
        System.out.println("-----------------------------------");
        // xoa phan tu bang removeAll()
        list.removeAll(listB);
        System.out.println(list);
        showList(list);
    }

    public static void showList(LinkedList<String> list) {
        for(String obj :list){
            System.out.println("/t"+obj +",");
        }
        System.out.println();
    }
}
