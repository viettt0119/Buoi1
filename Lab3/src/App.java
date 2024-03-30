import Employee_Full_and_Part_time.Nhan_Vien_Full_Time;

public class App {
    public static void main(String[] args) throws Exception {
             System.out.println("nhan vien parttime");
            Nhan_Vien_Full_Time Ept = new Nhan_Vien_Full_Time();
            Ept.nhapCong();
            Ept.tinhLuong();
            Ept.xuatthongin();
            
        
            System.out.println("nhan vien fulltime");
            Nhan_Vien_Full_Time Eft = new Nhan_Vien_Full_Time();
            Eft.nhapSoNgay();
            Eft.tinhLuong();
            Eft.xuatthongin();
           }
        
    }

