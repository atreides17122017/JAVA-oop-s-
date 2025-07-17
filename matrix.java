import java.util.Scanner;

public class matrix {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Rows:");
        int a=sc.nextInt();
        System.out.println("Enter the no of columns:");
        int b=sc.nextInt();
        System.out.println("Enter the elements of the matrix:");
        int[][] matrix = new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        sc.close();
    }
}
