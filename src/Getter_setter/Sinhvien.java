package Getter_setter;

public class Sinhvien {
    private String ten ;
    private String tuoi ;
    public String getTen(){
        return ten;
    
    }
    public void setTen(String ten){
        if(ten== null || ten.isEmpty()){
             this.ten= "khong biet";

        } else 
        {
            this.ten=ten;
        }
    }
    public String getTuoi(){
        if(Integer.valueOf(tuoi) !=-1){
            return tuoi;

        } else 
        {
            return "Tuoi khong hop le ";

        }
    }
    public void setTuoi(int tuoi){
        if(tuoi <18){
                this.tuoi = String.valueOf(tuoi);

        }else 
        {
            this.tuoi= String.valueOf(-1);
        }
    }

    public static void main(String[] args) {
        Sinhvien SV1= new Sinhvien();
        Sinhvien SV2=new Sinhvien();
        SV1.setTen("Tran Tuan Viet ");
        SV1.setTuoi(23);
        SV2.setTen("Tran Tuan Viet ");
        SV2.setTuoi(23);
        System.out.println("Sinh vien 1 co ten "+ SV1.getTen()+"tuoi "+SV1.getTuoi());
        System.out.println("Sinh vien 2 co ten "+ SV2.getTen()+"tuoi "+SV2.getTuoi());
    }
}

