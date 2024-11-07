package learn.BtLab6;
import java.util.Scanner ;
public class Lab6B4 {
    public static void main (String[] args ) {
        Scanner input = new Scanner (System.in) ;
        System.out.print("Nhap so luong mang : ");
        int n = input.nextInt() ;
        int [] a= new int[n] ;
        for(int i = 0 ; i < n ;i++) {
            a[i] = input.nextInt() ;
        }
        Sort(a,n) ;
        for(int i = 0 ; i < n ;i++) {
            System.out.print(a[i] + " ") ;
        }
    }
    public static void Sort (int []a, int n ) {
        for(int i = 0 ; i < n -1  ;i++) {
            for(int j = i + 1 ; j < n ; j++) {
                if (a[i] > a[j]) {
                    int tmp = a[i] ;
                    a[i] = a[j] ;
                    a[j] = tmp ;
                }
            }
        }
    }
}
