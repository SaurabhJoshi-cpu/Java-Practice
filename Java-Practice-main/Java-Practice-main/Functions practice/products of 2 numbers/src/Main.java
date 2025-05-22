import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ans= product();
        System.out.println(ans);

    }
    static int product(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number");
        int num1= sc.nextInt();
        System.out.println("enter your second number");
        int num2=sc.nextInt();
        int product =num1*num2;
        return(product);
    }
}