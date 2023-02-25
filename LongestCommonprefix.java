import java.util.*;

public class LongestCommonprefix{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the first string:");
        String first=input.nextLine();
        System.out.println("Enter the second string:");
        String second=input.nextLine();
        StringBuilder prefix= new StringBuilder();
        for(int i=0,j=0;i<first.length()&&j<second.length();i++,j++)
        {
            if(first.charAt(i)==second.charAt(j))
                prefix.append(first.charAt(i));
            else
                break;

        }
        if(prefix.length()>0)
        {
            System.out.println("The common prefix is " +prefix);
        }
        else
        {
            System.out.println(first+ " and " +second+" have no common prefix");
        }



    }
}