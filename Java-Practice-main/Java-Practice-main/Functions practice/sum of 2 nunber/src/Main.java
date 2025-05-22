import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int ans=sum();
        System.out.println(ans);
    }
    static int sum(){
        Scanner sc =new  Scanner(System.in);
        System.out.println("enter 1st number");
        int num1=sc.nextInt();
        System.out.println("enter 2nd number");
        int num2=sc.nextInt();
        int gg =num1+num2;
        return(gg);
    }
}