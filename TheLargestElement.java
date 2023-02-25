import java.util.*;
public class TheLargestElement {


    public static int[] locateLargest(double[][] a)
    {

        int[]x=new int[2];
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a[i].length-1;j++)
            {
                if(a[i][j]>a[i+1][j+1])
                {
                    x[0]=i;
                    x[1]=j;
                }
            }
        }
        return x;

    }
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Please Enter the size of row and column:");
        int rows=Input.nextInt();
        int columns=Input.nextInt();
        double[][] array = new double[rows][columns];
        Scanner arr = new Scanner(System.in);

        System.out.println("Please Enter the array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                array[i][j] = arr.nextDouble();
            }
        }
        int[] elements=locateLargest(array);
        //printf is used to print formatted output that is having %f
        System.out.printf("The location of the largest element is = (%d, %d)%n",elements[0],elements[1]);

    }

}