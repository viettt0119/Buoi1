import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Bai_4_Page_114 {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten cac loai trai cay(exit de kt ) :");
        while (true) {
            String fruit = scanner.nextLine();
            if (fruit.equalsIgnoreCase("exit")) {
                break;
            }
            fruitSet.add(fruit);
        }
        System.out.println("So phan tu trong HashSet: " + fruitSet.size());
        System.out.println("Nhap ten mot loai trai cay de kiem tra:");
        String fruitToCheck = scanner.nextLine();
        if (fruitSet.contains(fruitToCheck)) {
            System.out.println("Co tim thay loai trai cay: " + fruitToCheck);
        } else {
            System.out.println("Khong tim thay loai trai cay: " + fruitToCheck);
        }
        if (!fruitSet.isEmpty()) {
            Iterator<String> iterator = fruitSet.iterator();
            if (iterator.hasNext()) {
                String fruitToRemove = iterator.next();
                fruitSet.remove(fruitToRemove);
                System.out.println("Da xoa loai trai cay: " + fruitToRemove);
            }
        }
        System.out.println("Cac phan tu con lai trong HashSet:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }
        List<String> fruitList = new ArrayList<>();
        System.out.println("Nhap ten cac loai trai cay cho List (go 'exit' de ket thuc):");
        while (true) {
            String fruit = scanner.nextLine();
            if (fruit.equalsIgnoreCase("exit")) {
                break;
            }
            fruitList.add(fruit);
        }
        fruitSet.addAll(fruitList);
        System.out.println("HashSet sau khi them cac phan tu tu List:");
        Iterator<String> it = fruitSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        fruitSet.removeAll(fruitList);
        System.out.println("HashSet sau khi xoa cac phan tu cua List:");
        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }
        scanner.close();
    }
}
