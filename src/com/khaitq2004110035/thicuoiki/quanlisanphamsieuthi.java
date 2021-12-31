package com.khaitq2004110035.thicuoiki;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



public class quanlisanphamsieuthi {

    private ArrayList<sanphamsieuthi> danhsach;
    
    public quanlisanphamsieuthi(){
        this.danhsach = new  ArrayList<sanphamsieuthi>();
    }
    public quanlisanphamsieuthi(ArrayList<sanphamsieuthi> danhsach){
        this.danhsach = danhsach;

    }
    //1 thêm vào
    public void themsanpham(sanphamsieuthi sp){
        this.danhsach.add(sp);
        danhsach.add( new sanphamsieuthi("thực phẩm",21042.135,"thịt bò",60000.0,3500.0,"29/09/2020"));
  danhsach.add (new sanphamsieuthi("thực phẩm",20341.135,"thịt gà",40000.0,3500.0,"15/12/2020"));
    danhsach.add ( new sanphamsieuthi("thực phẩm",20651.155,"thịt cừu",11000.0,3500.0,"15/12/202)0"));
    danhsach.add ( new sanphamsieuthi("thực phẩm",22041.135,"thịt lợn",33000.0,3500.0,"30/1/2020"));
   danhsach.add (new sanphamsieuthi("thực phẩm",20041.567,"cá",25000.0,20000.0,"27/5/2020"));
   danhsach.add (new sanphamsieuthi("thực phẩm",20011.431,"trái cây",41000.0,4500.0,"05/04/2020"));
    danhsach.add ( new sanphamsieuthi("sành sứ",20041.135,"bát",123000.0,25100.0,"11/12/2020"));
    danhsach.add (new sanphamsieuthi("sành sứ",20041.135,"chén",343000.0,25200.0,"11/11/2020"));
    danhsach.add (new sanphamsieuthi("sành sứ",20041.135,"đĩa",123000.0,25300.0,"11/01/2020"));
    danhsach.add (new sanphamsieuthi("sành sứ",20041.135,"gốm",233000.0,5500.0,"30/04/2020"));
   danhsach.add (new sanphamsieuthi("sành sứ",20041.135,"gốm",323000.0,5500.0,"31/12/2020"));
    danhsach.add ( new sanphamsieuthi("sành sứ",20041.135,"gốm",323000.0,1500.0,"31/12/2020"));
   danhsach.add ( new sanphamsieuthi("sành sứ",20041.135,"gốm",453000.0,4300.0,"05/04/2020"));
    danhsach.add (new sanphamsieuthi("điện máy",20041.135,"nồi cơm",73000.0,25000.0,"06/06/2020"));
    danhsach.add (new sanphamsieuthi("điện máy",20041.135,"máy lạnh",305500.0,12500.0,"11/12/2020"));
   danhsach.add (new sanphamsieuthi("điện máy",20041.135,"tủ giặt",35000.0,54500.0,"11/12/2020"));
   danhsach.add  ( new sanphamsieuthi("điện máy",20041.135,"tivi",350000.0,65500.0,"11/12/2020"));
   danhsach.add (new sanphamsieuthi("điện máy",20041.135,"quạt",350000.0,23400.0,"08/07/2020"));
   danhsach.add (new sanphamsieuthi("điện máy",20041.135,"vi tính",1113000.0,2500.0,"09/09/2020"));
   danhsach.add (new sanphamsieuthi("điện máy",20041.135,"vi tính",1113000.0,45500.0,"10/10/2020"));
   
    }
    //2 xóa
    public boolean xoasanpham(sanphamsieuthi sp) {
        return this.danhsach.remove(sp);
    }
    //3 sửa thông tin
    public void suasanphan(sanphamsieuthi sp,int vitri){
        
        this.danhsach.set(vitri,sp );
    }

    //4  	Tìm kiếm tất cả sản phẩm dựa trên loai được nhập từ bàn phím.
		public void timsanpham(String loai) {
			for (sanphamsieuthi sanpham : danhsach) {
				if(sanpham.getloai().indexOf(loai)>=0) {
					System.out.println(sanpham);
				}
			}
		}
       // 5 Tìm kiếm tất cả sản phẩm dựa trên giá được nhập từ bàn phím.
		public void timsanphamgia(Double gianhap) {
			for (sanphamsieuthi sanpham : danhsach) {
				if(sanpham.getgianhap()==gianhap) {
					System.out.println(sanpham);
				}
			}
		}
        // 6	Tìm kiếm tất cả sản phẩm dựa trên ngày được nhập từ bàn phím.
		public void timsanphamngaynhap( String ngaynhapkho) {
			for (sanphamsieuthi sanpham : danhsach) {
				if(sanpham.getngaynhapkho()==ngaynhapkho) {
					System.out.println(sanpham);
				}
			}
		}
 //7	sắp xếp danh sách sản phẩm theo giá có giá từ cao đến thấp.
 public void sapxepdanhsach() {
    Collections.sort(this.danhsach, new Comparator<sanphamsieuthi>() {
        @Override
        public int compare(sanphamsieuthi sp1, sanphamsieuthi sp2) {
            if(sp1.getgianhap()<sp2.getgianhap()) {
                return 1;
            }else if(sp1.getgianhap()>sp2.getgianhap()) {
                return -1;
            }else {
                return 0;
            }
        }	
    });
}
    //8	sắp xếp danh sách sản phẩm theo giá có giá từ thấp đến cao.
 public void sapxepdanhsachsap() {
    Collections.sort(this.danhsach, new Comparator<sanphamsieuthi>() {
        @Override
        public int compare(sanphamsieuthi sp1, sanphamsieuthi sp2) {
            if(sp1.getgianhap()>sp2.getgianhap()) {
                return 1;
            }else if(sp1.getgianhap()<sp2.getgianhap()) {
                return -1;
            }else {
                return 0;
            }
        }	
    });
}
// 9 In danh sách sản phẩm ra màn hình.
public void indanhsachsanpham() {
    for (sanphamsieuthi sanpham : danhsach) {
        System.out.println(sanpham);
    }
}

}


