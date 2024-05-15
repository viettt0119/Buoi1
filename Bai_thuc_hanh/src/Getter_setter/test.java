package Getter_setter;

public class test {
    public static void main(String[] args) {
        HinhTron hinhTron=new HinhTron();
        hinhTron.setBankinh(10);
        float Chuvi=hinhTron.tinhChuvi();
        float dienTich=hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron "+ Chuvi+"va dien tich "+dienTich);
    }
}
