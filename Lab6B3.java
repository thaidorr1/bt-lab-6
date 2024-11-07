package learn.BtLab6;
import java.util.Scanner ;
public class Lab6B3 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap so luong mang : ");
        int n = input.nextInt() ;
        int [] a = new int[n] ;
        System.out.print("Nhap so can tim trong mang :") ;
        int search = input.nextInt() ;
        int cnt = 0 ;
        for(int i =0  ; i < n ;i++) {
            a[i] = input.nextInt() ;
        }
        for(int i =0 ; i < n ;i++) {
            if (a[i] == search ) {
                ++cnt ;
            }
        }
        System.out.print("So lan phan tu xuat hien trong mang la : " + cnt );
    }
}