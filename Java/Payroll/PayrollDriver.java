import java.lang.Math;

public class PayrollDriver {
    public static void main(String args[]) {
        Payroll p = new Payroll();
        int[] employees = { 6668466, 4520125, 7895122, 8777541, 8451277, 1302850, 4447892 };

        for (int i = 0; i < employees.length; i++) {
            int hours = (int) (Math.random() * 5 + 4);
            double pay = Math.floor(Math.random() * 24 + 7);

            p.setHours(employees[i], hours);
            p.setPay(employees[i], pay);
            p.setWages(employees[i]);
        }

        double[] wages = p.getWages();

        for(double wage: wages)
            System.out.println("$" + wage + "0");
    }
}
