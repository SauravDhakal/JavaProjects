public class Second{
    //Variables we are gonna use
    String user_name;
    int age;

    //Constructor used to create Class
    public Second(int _age, String _user_name){
        user_name = _user_name;
        age = _age;
    }

    //Returns the username 
    public String userName(){
        return user_name;
    }

    //Checks if the user can vote or not
    public boolean vote(){
        if(age >= 18){
            return true;
        } else{
            return false;
        }
    }
}