import java.util.Scanner;
public class Ngay31_1_bth_page_95_bai_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu day so: ");
        int n = scanner.nextInt();
        int[] daySo = new int[n];
        System.out.println("Nhap day so :");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu" + (i + 1) + ": ");
            daySo[i] = scanner.nextInt();
        }
        double trungBinhCong = tinhTrungBinhCong(daySo);
        System.out.println("Trung binh cong cua day so: " + trungBinhCong);
        scanner.close();
    }
    public static double tinhTrungBinhCong(int[] arr) {
        int tong = 0;
        for (int so : arr) {
            tong += so;
        }
        return (double) tong / arr.length;
    }
}
