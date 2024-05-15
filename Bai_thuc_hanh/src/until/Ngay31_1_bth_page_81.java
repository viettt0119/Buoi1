import java.util.Scanner;
public class Ngay31_1_bth_page_81 {
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so hang ma tran : ");
        int soHang = scanner.nextInt();
        System.out.print("Nhap so cot ma tran: ");
        int soCot = scanner.nextInt();
        int[][] maTran = new int[soHang][soCot];
        System.out.println("Nhap gia tri :");
        for (int i = 0; i < soHang; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Phan tu  [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextInt();
                }
            }
        int maxPhanTu = timMaxPhanTu(maTran);
        System.out.println("Phan tu lon nhat trong ma tran la: " + maxPhanTu);
        scanner.close();
        }
        public static int timMaxPhanTu(int[][] maTran) {
            int maxPhanTu = maTran[0][0];
            for (int i = 0; i < maTran.length; i++) {
                for (int j = 0; j < maTran[i].length; j++) {
                    if (maTran[i][j] > maxPhanTu) {
                        maxPhanTu = maTran[i][j];
                    }
                }
            }
            return maxPhanTu;
        }
}
     
