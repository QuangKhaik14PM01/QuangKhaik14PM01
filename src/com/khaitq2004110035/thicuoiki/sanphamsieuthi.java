package com.khaitq2004110035.thicuoiki;



import java.util.Objects;


public class sanphamsieuthi implements Comparable<sanphamsieuthi> {
    String loai;
    Double mahang;
    String tenhanghoa;
    Double gianhap;
    Double soluongtonkho;
    String ngaynhapkho;

    public sanphamsieuthi(){}
    public sanphamsieuthi(String l, Double mh, String thh, Double gn, Double sltk,  String nnk){
        loai = l;
        mahang = mh;
        tenhanghoa = thh;
        gianhap = gn;
        soluongtonkho = sltk;
        ngaynhapkho = nnk;
    }
    public String getloai() {
        return loai;
    }

    public void setloai(String loai) {
        this.loai = loai;
    }
    public Double getmahang(){
        return mahang;
    }
    public void setmahang(Double mahang){
        this.mahang = mahang;
    }
    public String gettenhanghoa(){
        return tenhanghoa;
    }
    public void settenhanghoa(String tenhanghoa){
        this.tenhanghoa = tenhanghoa;
    }
    public Double getgianhap(){
        return gianhap;
    }
    public void setgianhap(Double gianhap){
        this.gianhap = gianhap;
    }
    public Double getsoluongtonkho(){
        return soluongtonkho;
    }
    public void setsoluongtonkho(Double soluongtonkho){
        this.soluongtonkho = soluongtonkho;
    }
    public  String getngaynhapkho(){
        return ngaynhapkho;
    }
    public void setngaynhapkho( String ngaynhapkho){
        this.ngaynhapkho = ngaynhapkho;
    }
    
    @Override
    public String toString() {
        return "sản phẩm [loại = " + loai + ", mã hàng = " + mahang + ", tên hàng hóa = " + tenhanghoa
                + ", giá nhập " + gianhap + ", số lượng tồn kho" + soluongtonkho + ", ngày nhập kho" + ngaynhapkho + "]";
    }

    @Override
    public int compareTo(sanphamsieuthi o) {
        return this.loai.compareTo(o.loai);
    }
    @Override
        public int hashCode() {
            return Objects.hash(loai, mahang, tenhanghoa, gianhap, soluongtonkho,ngaynhapkho);
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
           sanphamsieuthi other = ( sanphamsieuthi) obj;
            return Objects.equals(loai, other.loai);
        }
      // @Override
    public void inthongtinsieuthi() {
        System.out.printf("│%11s│%19s│%11s│%8s$/Per│%8s piece│%18s│\n",getloai(),getmahang(),gettenhanghoa(),getgianhap(),getsoluongtonkho(),getngaynhapkho());

    }
        
    

    

    
}
