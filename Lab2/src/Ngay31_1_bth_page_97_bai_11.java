import java.util.Arrays;
import java.util.Scanner;
public class Ngay31_1_bth_page_97_bai_11 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int[] mangA = new int[n];
        System.out.println("Nhap gia tri cho tung phan tu cua mang A:");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            mangA[i] = scanner.nextInt();
        }
        System.out.println("Mang A ban dau:");
        inMang(mangA);
        Arrays.sort(mangA);
        System.out.println("Mang A da sap xep tang dan:");
        inMang(mangA);
        scanner.close();
    }
    public static void inMang(int[] mang) {
        for (int phanTu : mang) {
            System.out.print(phanTu + " ");
        }
        System.out.println(); 
    }
}