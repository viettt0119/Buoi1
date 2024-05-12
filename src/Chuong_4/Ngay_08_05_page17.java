package Chuong_4;
import java.util.ArrayList;
public class Ngay_08_05_page17 {
    public static void main(String[] args) {
        ArrayList<String> arrayListStrings = new ArrayList<>();
        arrayListStrings.add("Java");
        arrayListStrings.add("C#");
        arrayListStrings.add("PHP");
        arrayListStrings.add("C++");
        System.out.println("Cac phan tu co trong arrListString la ");
        for(int i=0 ;i<arrayListStrings.size();i++ ){
            System.out.println(arrayListStrings.get(i) + "t");
        }
    }
}
