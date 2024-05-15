package Chuong_4;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Ngay_15_05_page86 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("CSLT","Co so lap trinh");
        hashMap.put("C++","C++");
        hashMap.put("C#","C sharp");
        hashMap.put("PHP","PHP");
        hashMap.put("Java","Java");
        Set<Map.Entry<String , String>> setHashMap = hashMap.entrySet();
        System.out.println("Cac entry co trong hashmap");
        System.out.println(setHashMap);

    }
}
