public class fibonacci {
public static int fiboseries(int n){
    if(n==0 || n==1){
        return 1;
    }
return fiboseries(n-1) + fiboseries(n-2);


}
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(fiboseries(n));
    }
}