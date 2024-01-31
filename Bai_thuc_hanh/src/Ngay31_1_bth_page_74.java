import java.util.Scanner;
public class Ngay31_1_bth_page_74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong mang: ");
        int kichThuoc = scanner.nextInt();
        int[] mangSo = new int[kichThuoc];
        System.out.println("Nhap gia tri phan tu trong mang:");
        for (int i = 0; i < kichThuoc; i++) {
            System.out.print("Phan tu thu  " + (i + 1) + ": ");
            mangSo[i] = scanner.nextInt();
        }
        int tongSoChan = tinhTongSoChan(mangSo);
        System.out.println("Tong cac so chan trong mang la: " + tongSoChan);
        scanner.close();
    }
    public static int tinhTongSoChan(int[] mang) {
        int tong = 0;
        for (int so : mang) {
            if (so % 2 == 0) {
                tong += so;
            }
        }
        return tong;
    }
}
    
    
      
  
  