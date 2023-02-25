import java.util.Scanner;
import java.util.HashMap;

public class  EliminateDuplicatesAnotherway{
    public static int[] EliminateDuplicatesanotherway(int [] list)
    {
        //Create a hashmap which will
        //store elements which has previously appeared.
        HashMap<Integer, Boolean> mp=new HashMap<>();
        for(int i=0;i<10;i++)
        {
            //Printing elements if it not in hashmap
            if(mp.get(list[i])==null)
                System.out.println(list[i]+ " ");

            //Insert the element in the hashmap
            mp.put(list[i],true);
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner arr=new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Please Enter Ten numbers:");
        for(int i=0;i<10;i++) {
            array[i] = arr.nextInt();

        }
        EliminateDuplicatesanotherway(array);
    }
}