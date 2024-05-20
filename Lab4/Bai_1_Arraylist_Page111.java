import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Bai_1_Arraylist_Page111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Nhap cac so nguyen:");
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            numbers.add(number);
        }
        scanner.nextLine(); 
        if (!numbers.isEmpty()) {
            int max = Collections.max(numbers);
            System.out.println("So nguyen lon nhat: " + max);
        } else {
            System.out.println("DS rong.");
        }
        System.out.println("Nhap so de xoa :");
        int valueToRemove = scanner.nextInt();
        numbers.removeIf(num -> num == valueToRemove);
        System.out.println("Danh sach phan tu sau khi xoa " + valueToRemove + ": " + numbers);
        Collections.sort(numbers);
        System.out.println("Danh sach sau khi sap xep la: " + numbers);

        scanner.close();
    }
}