package learn.BtLab6;
import java.util.Scanner ;

public class Lab6B2 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        int tong = 0 , cnt = 0 ;
        System.out.print("Nhap so luong mang : ");
        int n = input.nextInt() ;
        int [] a = new int[n] ;
        for(int i= 0 ; i < n ;i++) {
            a[i] = input.nextInt() ;
        }
        for(int i = 0 ; i < n ;i++) {
            tong += a[i] ;
            ++cnt ;
        }
        float tb = (float) tong / cnt ;
        System.out.println("tong cac phan tu trong mang la : " + tong );
        System.out.println("tong trung binh trong mang la : " + tb );
    }
}
