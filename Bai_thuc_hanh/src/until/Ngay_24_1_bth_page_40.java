import java.util.Scanner;
public class Ngay_24_1_bth_page_40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao so nguyen tu 1-7: ");
        int soNgay = scanner.nextInt();
        hienthi(soNgay);

        scanner.close();
    }
    private static void hienthi(int soNgay) {
        switch (soNgay) {
            case 1:
                System.out.println("Ngay " + soNgay + " la Chu nhat.");
                break;
            case 2:
                System.out.println("Ngay " + soNgay + " là Thu Hai.");
                break;
            case 3:
                System.out.println("Ngay " + soNgay + " là Thu Ba.");
                break;
            case 4:
                System.out.println("Ngay " + soNgay + " là Thu Tu.");
                break;
            case 5:
                System.out.println("Ngay " + soNgay + " là Thu Nam.");
                break;
            case 6:
                System.out.println("Ngay " + soNgay + " là Thu Sau.");
                break;
            case 7:
                System.out.println("Ngay " + soNgay + " là Thu Bay.");
                break;
            default:
                System.out.println("So ngay khong hop le. Vui long nhap so tu 1 đen 7.");
        }
    }
}
