import employee.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> empList = new ArrayList<>();

        while (true) 
        {
            System.out.println("\nChoose Employee Type:");
            System.out.println("1. Programmer");
            System.out.println("2. Assistant Professor");
            System.out.println("3. Associate Professor");
            System.out.println("4. Professor");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 5) 
            {
                break;
            }

            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter ID: ");
            String id = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            System.out.print("Enter Mail ID: ");
            String mail = sc.nextLine();
            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();
            System.out.print("Enter Basic Pay: ");
            double bPay = sc.nextDouble();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    empList.add(new Programmer(name, id, address, mail, mobile, bPay));
                    break;
                case 2:
                    empList.add(new AssistantProfessor(name, id, address, mail, mobile, bPay));
                    break;
                case 3:
                    empList.add(new AssociateProfessor(name, id, address, mail, mobile, bPay));
                    break;
                case 4:
                    empList.add(new Professor(name, id, address, mail, mobile, bPay));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }

        System.out.println("\n========== PAY SLIPS ==========\n");
        for (Employee emp : empList) 
        {
            emp.display();
            emp.paySlip();
            System.out.println("----------------------------------------");
        }

        sc.close();
    }
}
