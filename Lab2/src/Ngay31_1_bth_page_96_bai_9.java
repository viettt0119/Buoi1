import java.util.Scanner;
public class Ngay31_1_bth_page_96_bai_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String chuoi = scanner.nextLine();
        demVaInSoKyTu(chuoi);
        scanner.close();
    }
    public static void demVaInSoKyTu(String chuoi) {
        int soKyTuThuong = 0;
        int soKyTuHoa = 0;
        int soChuSo = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            char kyTu = chuoi.charAt(i);
            if (Character.isLowerCase(kyTu)) {
                soKyTuThuong++;
            } else if (Character.isUpperCase(kyTu)) {
                soKyTuHoa++;
            } else if (Character.isDigit(kyTu)) {
                soChuSo++;
            }
        }
        System.out.println("So ky tu thuong: " + soKyTuThuong);
        System.out.println("So ky tu hoa: " + soKyTuHoa);
        System.out.println("So chu so: " + soChuSo);
    }
}


