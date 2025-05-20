import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num=great();
        System.out.println(num);

    }

    static int great() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first integer");
        int int1 = sc.nextInt();
        System.out.println("enter second integer");
        int int2=sc.nextInt();
        System.out.println("enter third integer");
        int int3=sc.nextInt();
        int max= int1;

        if (int2>int1)
            max=int2;
        if (int3>int2)
            max=int3;
        return max;
    }
}