//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
        System.out.println("enter how many drinks you want");
        int num=sc.nextInt();
        for (int i=1;i<=num;i++){
            Scanner dm=new Scanner(System.in);
            System.out.println("which drink do you want?");
            String name= dm.nextLine();
            System.out.print(name);
            System.out.println(" here is your drink");
            System.out.println(" here is your drink");
        }

    }
}