import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String ans=voteyesorno();
        System.out.println(ans);

    }
    static String voteyesorno(){
        Scanner sc =new Scanner (System.in);
        System.out.println("enter your age");
        int age=sc.nextInt();
        String gg="Yes you can vote";
        if(age<=18)
            gg="NO you cant vote";
        return(gg);
    }
}