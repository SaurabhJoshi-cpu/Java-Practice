
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String gugu=greetings();
        System.out.println(gugu);
    }
    //return a string or print a message
    static String greetings(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your greetings");
        String gree=sc.nextLine();
        return gree;

    }
}
