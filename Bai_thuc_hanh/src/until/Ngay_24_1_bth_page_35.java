import java.util.Scanner;
public class Ngay_24_1_bth_page_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double soThuNhat = scanner.nextDouble();

        System.out.print("Nhap so thu 2: ");
        double soThuHai = scanner.nextDouble();

        double soNhoNhat = SoNhoNhat(soThuNhat, soThuHai);
        System.out.println("So nho nhat : " + soNhoNhat);
        scanner.close();
    }
    private static double SoNhoNhat(double a, double b) {
        return Math.min(a, b);
    }
}
