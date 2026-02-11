
// Enter 3 numbers from the user and print the average of the numbers 
import java.util.*;

public class ques1 {
    public  static int averageOfNums(int a, int b, int c) {
        int avg = (a+b+c)/3;
        return avg;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int z = sc.nextInt();
    int result = averageOfNums(x,y,z);
    System.out.println(result);
    }
}