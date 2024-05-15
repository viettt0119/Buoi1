package Getter_setter;

public class HinhTron {
    private final float PI=3.14f;
    private float Bankinh;
    public float getBankinh(){
        return Bankinh;

    }
  public void setBankinh(float Bankinh){
    this.Bankinh= Bankinh;

  }
  public float tinhChuvi(){
    return 2*PI*Bankinh;
  }
  public float tinhDienTich(){
    return PI*Bankinh*Bankinh;
  }
}
