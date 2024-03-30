import java.util.Scanner;
public class Ngay31_1_bth_page_90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        hienThiKyTu(chuoi);
        scanner.close();
    }
    public static void hienThiKyTu(String chuoi) {
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
        }
    }
}


