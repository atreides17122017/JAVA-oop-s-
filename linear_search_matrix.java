import java.util.Scanner;
public class linear_search_matrix
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int a=sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int b=sc.nextInt();
        System.out.println("Enter te elements of the matrix :");
        int[][] matrix_1=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                matrix_1[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("The elements in Matrix are:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(matrix_1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter any number that you want to search in the matrix:");
        int key=sc.nextInt();
        boolean x=false;
        int r_idx=-1;
        int c_idx=-1;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(matrix_1[i][j]==key)
                {
                    x=true;
                    r_idx=i+1;
                    c_idx=j+1;
                }
            }
        }
        if(x)
        {
            System.out.println("The element "+key+" was found at row "+r_idx+" and column "+c_idx+" in the matrix");
        }
        else
        {
            System.out.println("The element was not found in the matrix");
        }
        sc.close();
    }
}
