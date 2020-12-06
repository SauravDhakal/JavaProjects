//Scanner class is used to input data from user
import java.util.Scanner;

//Public Class
public class First{
    
    //Main function
    public static void main(String[] args){
        //Initialize the Scanner and create an object for it(input) using Scanner constructor with "System.in" parameter 
        Scanner input = new Scanner(System.in);

        //Input and save
        System.out.println("Enter your name ");
        String name = input.nextLine();
    
        System.out.println("Enter your age ");
        int age = input.nextInt();

        //Convert "Second" class into object called "user" using Second() constructor
        Second user = new Second(age, name);

        //Access user_name function that return the username variable initialized during the formation of obj.
        System.out.println(user.user_name);
        
        //Boolean variable "vote"
        boolean vote = user.vote();

        //Printing if the user is eligible to vote or not
        if(vote){
            System.out.println("You are eligible to vote");
        }   else{
            System.out.println("You are not elibible to vote");
        }

        //Closing the input we created earlier
        input.close();
    }
}