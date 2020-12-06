import java.util.Scanner;

public class First{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name ");
        String name = input.nextLine();
    
        System.out.println("Enter your age ");
        int age = input.nextInt();

        Second user = new Second(age, name);

        System.out.println(user.user_name);
        
        boolean vote = user.vote();

        if(vote){
            System.out.println("You are eligible to vote");
        }   else{
            System.out.println("You are not elibible to vote");
        }

        input.close();
    }
}