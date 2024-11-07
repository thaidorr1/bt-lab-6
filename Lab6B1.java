
package learn.BtLab6;
import java.util.Scanner ;
public class Lab6B1 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap so luong mang : ");
        int n = input.nextInt() ;
        int [] a =new int[n] ;
        for(int i = 0 ; i < n ;i++) {
            a[i] = input.nextInt() ;
        }
        int max = a[0] ;
        int min = a[0] ;
        for(int i = 0 ; i < n ;i++) {
            if (a[i] > max) {
                max = a[i] ;
            }
            if (a[i] < min) {
                min = a[i] ;
            }
        }
        System.out.println("So lon nhat trong mang la : " + max );
       System.out.println("So lon nhat trong mang la : " + min );
    }
}
