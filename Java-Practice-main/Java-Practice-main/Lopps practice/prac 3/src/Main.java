import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //aadhar card interface
        while(true){
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter your name");
            String name=sc.nextLine();
            Scanner kc= new Scanner(System.in);
            System.out.println("Enter your date of birth");
            String dob= kc.nextLine();
            Scanner zc= new Scanner(System.in);
            System.out.println("Enter your sex");
            String sex=zc.nextLine();
            System.out.println("Please recheck your info");
            System.out.print("Name: ");
            System.out.println(name);
            System.out.print("DOB: ");
            System.out.println(dob);
            System.out.print("Sex: ");
            System.out.println(sex);
            Scanner ff=new Scanner(System.in);
            System.out.println("Do you want to change anything?");
            String ans=ff.nextLine();
            if(ans.equals("no")){
                break;
            }



        }

    }
}