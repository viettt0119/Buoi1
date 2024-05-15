package Page79.Main;
import Page79.model.NhanVienFullTime;
import Page79.model.NhanVienPartTime;
import Page79.util.Configs;

public class mainclass_employee {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van Boss");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        sep.tinhLuong();
        sep.xuatThongTin();
        System.out.println();

        NhanVienFullTime linh = new NhanVienFullTime("Nguyen Van Toan Thoi Gian", 4);
        linh.setLoaiChucVu(Configs.NHAN_VIEN_LINH);
        linh.tinhLuong();
        linh.xuatThongTin();
        System.out.println();

        NhanVienPartTime partTime = new NhanVienPartTime("Le Thoi Vu", 180);
        partTime.tinhLuong();
        partTime.xuatThongTin();
    }
}
