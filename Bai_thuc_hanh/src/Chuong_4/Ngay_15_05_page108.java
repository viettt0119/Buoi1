package Chuong_4;
import java.util.Map;
import java.util.TreeMap;
public class Ngay_15_05_page108 {
    public static void main(String[] args) { 
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        treeMap.put(1, 9d);
        treeMap.put(4, 10.1d);
        treeMap.put(2, 7.2d);
        treeMap.put(8, 20.28d);
        for (Map.Entry<Integer, Double> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        treeMap.replace(4, 20.11d);

        treeMap.replace(2, 7.2d, 7.7d);

        for (Map.Entry<Integer, Double> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

