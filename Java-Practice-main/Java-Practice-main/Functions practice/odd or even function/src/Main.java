import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String ans=oddoreven();
        System.out.println(ans);

    }
    static String oddoreven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();
        String output ="Even";
        if(num%2!=0)
            output="odd";
        return (output);


    }
}