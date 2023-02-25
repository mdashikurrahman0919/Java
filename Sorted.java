import java.util.*;
public class Sorted{
    public static boolean isSorted(int[] list)
    {
        int i,j;
        for(i=0;i<list.length-1;i++)
        {
            for(j=i+1;j<list.length-1;j++)
            {
                if(list[i]>list[j])
                    return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner arr= new Scanner(System.in);
        //Enter the size of list
        System.out.println("Enter list:");
        int n=arr.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=arr.nextInt();
        }
        //checks the condition if the statement is true or false.
        if(isSorted(array))
            System.out.println("The list is sorted");
        else
            System.out.println("The list is not sorted");



    }
}