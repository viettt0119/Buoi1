import java.util.Scanner;
public class Ngay31_1_bth_page_95_bai_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soNguyenDuong;
        do {
            System.out.print("Nhap mot so nguyen duong: ");
            soNguyenDuong = scanner.nextInt();
        } while (soNguyenDuong <= 0);
        long giaiThua = tinhGiaiThua(soNguyenDuong);
        System.out.println("Giai thua cua " + soNguyenDuong + " la: " + giaiThua);

        scanner.close();
    }
    public static long tinhGiaiThua(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long giaiThua = 1;
            for (int i = 2; i <= n; i++) {
                giaiThua *= i;
            }
            return giaiThua;
        }
    }
}


