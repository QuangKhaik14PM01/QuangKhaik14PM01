package com.khaitq2004110035.thicuoiki;
import java.util.Scanner;
import com.khaitq2004110035.thicuoiki.sanphamsieuthi;
import com.khaitq2004110035.thicuoiki.quanlisanphamsieuthi;

public class quanlisieuthiTestDrive {
public static void main(String[] args) {
    Scanner kiemtra = new Scanner(System.in);
    
    quanlisanphamsieuthi qlst = new quanlisanphamsieuthi();
    int luachon=0;
    do{
       
        System.out.println("------Menu------");
        System.out.println("Vui lòng chọn chức năng");
        System.out.println(
			  "1.	Thêm san pham vao danh sach.\n"
			+ "2.	Xoa san pham khoi danh sach.\n"
			+ "3.	in san pham .\n"
			+ "4.	Tim kiem tat ca san pham daa trên loai, gia, ngay đuoc nhap tu ban phim.\n"
            + "5.	Sap xep danh sach san pham theo gia co gia tu cao đen thap và tu thap đen3 cao\n"
            + "0.     thoát\n");
			luachon = kiemtra.nextInt();
			kiemtra.nextLine(); 
            
            

            if(luachon==1){
                System.out.println("nhap loai "); String loai = kiemtra.nextLine();
                System.out.println("ma hàng"); Double mahang = kiemtra.nextDouble();
                System.out.println("ten hang hoa"); String tenhanghoa = kiemtra.nextLine();
                System.out.println("gia nhap"); Double gianhap = kiemtra.nextDouble();
                System.out.println("so luong ton kho"); Double soluongtonkho = kiemtra.nextDouble();
                System.out.println("ngay nhap kho");  String ngaynhapkho = kiemtra.nextLine();
                kiemtra.nextLine();

            }else if(luachon==2){
                System.out.println("nhap ten hang hoa"); String tenhanghoa = kiemtra.nextLine();
                sanphamsieuthi sp = new sanphamsieuthi();
                System.out.println("xoa hang hoa" + qlst.xoasanpham(sp));

        }//else if(luachon==3){
           // System.out.println("nhập tên hàng hóa"); String tenhanghoa = kiemtra.nextLine();
           
             //   sanphamsieuthi sp = new sanphamsieuthi();
            //System.out.println("sửa hàng hóa" + qlst.suasanphan(sp,vitri));}

            else if(luachon==3){
                qlst.indanhsachsanpham();
                kiemtra.nextLine();
            }
            
        else if(luachon==4){
            System.out.println("nhap loai"); String loai = kiemtra.nextLine();
            System.out.println("ket qua tim kiem la");
            qlst.timsanpham(loai);
            kiemtra.nextLine();
           
            System.out.println("nhap gia"); Double gianhap = kiemtra.nextDouble();
            System.out.println("ket qua tim kiem la");
            qlst.timsanphamgia(gianhap);
            kiemtra.nextLine();

            System.out.println("nhap ngay"); String ngaynhapkho = kiemtra.nextLine();
            System.out.println("ket qua tim kiem la");
            qlst.timsanphamngaynhap(ngaynhapkho);
            kiemtra.nextLine();
        }else if(luachon==5){
            System.out.println("xuat gia tu cao đen thap");
            qlst.sapxepdanhsach();
            qlst.indanhsachsanpham();
            kiemtra.nextLine();

            System.out.println("xuat tu thap đen cao");
            qlst.sapxepdanhsachsap();
            qlst.indanhsachsanpham();
            kiemtra.nextLine();
        }


    }while(luachon!=0); 
    
}
    
}
