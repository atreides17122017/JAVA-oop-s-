//WAP to calculate matrix multiplication

import java.util.Scanner;
public class matrix_multiplication 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows:");
        int a=sc.nextInt();
        System.out.println("Enter the number of Columns:");
        int b=sc.nextInt();
        System.out.println("Enter te elements of the matrix 1:");
        int[][] matrix_1=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                matrix_1[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("Enter te elements of the matrix 2:");
        int[][] matrix_2=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                matrix_2[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        System.out.println("The elements in Matrix 1 are:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(matrix_1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("The elements in Matrix 2 are:");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(matrix_2[i][j]+" ");
            }
            System.out.println();
        }

        int[][] mul=new int [a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                mul[i][j]=0;
                for(int k=0;k<b;k++)
                {
                    mul[i][j]=mul[i][j]+(matrix_1[i][k]*matrix_2[k][j]);
                }
            }
        }

        System.out.println("multiplication of matrix 1 and matrix 2");
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        } 
        sc.close();
    }
}
