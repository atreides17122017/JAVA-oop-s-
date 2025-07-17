import java.util.Scanner;
public class calculator
{
    public static void main(String[] args)
    {
    	System.out.println("Hello World!");
    	System.out.println("Enter any 2 number:");
        Scanner sc= new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
       	System.out.println("Enter any character:");
       	char ch=sc.next().charAt(0);
       	if(ch=='+')
       	{
       		System.out.println("Addition:"+(x+y));
       	}
       	else if(ch=='-')
       	{
       		System.out.println("Subtraction:"+(x-y));
       	}
       	else if(ch=='*')
       	{
       		System.out.println("Multiplication:"+(x*y));
       	}
       	else if(ch=='/')
       	{
       		if(y==0)
       		{
       			System.out.println("please enter a valid number in the denominator.It cant be 0");
       		}
       		else
       		{
       			System.out.println("Division:"+(x/y));
       		}
       	}
       	else
       	{
       		System.out.println("Invalid input.Please enter valid input");
       	}
		sc.close();
    }
}