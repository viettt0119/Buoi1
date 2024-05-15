package Chuong_4;
import java.util.Map;
import java.util.TreeMap;
public class Ngay_15_05_page106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();
        treeMap.put(1, 'C');
        treeMap.put(2, 'D');
        treeMap.put(5, 'B');
        treeMap.put(6, 'A');
        treeMap.put(8, 'E');

        for (Map.Entry<Integer, Character> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

