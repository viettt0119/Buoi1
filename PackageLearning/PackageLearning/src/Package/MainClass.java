package Package;
import Shapes.HinhChuNhat;
import Shapes.HinhTron;
public class MainClass {
        public static void main(String[] args){
            HinhTron htron = new HinhTron();
            HinhChuNhat hcv = new HinhChuNhat();
            hcv.nhapChieudai();
            hcv.nhapChieurong();
            hcv.tinhChuVi();
            hcv.tinhDienTich();
            hcv.inChuvi();
            hcv.inDientich();

            System.err.println("\n\n");

            htron.nhapBanKinh();
            htron.tinhChuVivaDienTich();
            htron.inThongTin();
        }
}
