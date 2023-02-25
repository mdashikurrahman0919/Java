import java.util.*;

public class CheckPassword {
    public static final int PASSWORD_LENGTH=8; //declaring constant password length

    //Function to check password validation or not
    public static boolean CheckPassword(String password)
    {
        if(password.length()<PASSWORD_LENGTH)
            return false;
        int i, CharCount, NumCount;
        CharCount=NumCount=0;
        for(i=0;i<password.length();i++)

        {
            char ch=password.charAt(i); //storing ith character of string in ch variable
            if(Character.isDigit(ch))
                NumCount++;
            else if(Character.isLetter(ch))
                CharCount++;
            else
                return false;

        }

        return (CharCount>=2 && NumCount>=2);
    }
    public static void main(String[] args) {
        Scanner name=new Scanner(System.in);
        System.out.println("Frist Condition A password must have at least eight characters!");
        System.out.println("Second Condition A password consists of only letters and digits!");
        System.out.println("3rd Condition password must contain at least two digits!");
        System.out.println("Please Follow the instructions When Enter your password = ");
        String enter=name.nextLine();
        if(CheckPassword(enter))
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");



    }
}