import java.util.Scanner;
public class Ngay31_1_bth_page_96_bai_10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi khong qua 80 ki tu: ");
        String chuoi = scanner.nextLine();
        if (chuoi.length() > 80) {
            System.out.println("Chuoi co chieu dai vuot qua quy dinh. Hay nhap lai chuoi khong qua 80 ki tu.");
            return;
        }
        System.out.print("Nhap mot ki tu: ");
        char kyTu = scanner.next().charAt(0);
        int soLanXuatHien = demSoLanXuatHien(chuoi, kyTu);
        System.out.println("So lan xuat hien cua ki tu '" + kyTu + "' trong chuoi la : " + soLanXuatHien);
        scanner.close();
    }
    public static int demSoLanXuatHien(String chuoi, char kyTu) {
        int soLanXuatHien = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                soLanXuatHien++;
            }
        }
        return soLanXuatHien;
    }
}

