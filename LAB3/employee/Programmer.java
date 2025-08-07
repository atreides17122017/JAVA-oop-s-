package employee;

public class Programmer extends Employee 
{
    protected double bPay;
    protected String des;

    public Programmer(String name, String id, String address, String mail, String mobile, double bPay) 
    {
        super(name, id, address, mail, mobile);
        this.bPay = bPay;
        this.des = "Programmer";
    }

    @Override
    public void paySlip() 
    {
        double da = 0.97 * bPay;
        double hra = 0.10 * bPay;
        double pf = 0.12 * bPay;
        double staffClub = 0.001 * bPay;

        double gross = bPay + da + hra;
        double net = gross - (pf + staffClub);

        System.out.println("\nDesignation : " + des);
        System.out.println("Basic Pay   : " + bPay);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary  : " + net);
    }
}
