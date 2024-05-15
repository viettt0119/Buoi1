import java.util.Scanner;
public class Ngay_24_1_bth_page_93_bai_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nhap nam sinh : ");
        int namsinh = scanner.nextInt();

        int tuoi = 2024 - namsinh;

        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o độ tuoi vi thanh nien.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " o đo tuoi truong thanh.");
        } else {
            System.out.println("Ban " + ten + " đa gia.");
        }

        scanner.close();
    }
}

