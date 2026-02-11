import java.util.*;
public class sumOfOddnums {
    //print the sum of all odd number from 1 to n.
    public static int sumOddNums(int n ){
        int sum =0 ;
        for (int i = 1 ; i <= n ; i++){
            if(i%2 != 0){
                sum+=i;
            }
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println(sumOddNums(n));
        }
    
}
