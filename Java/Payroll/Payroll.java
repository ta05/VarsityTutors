public class Payroll {

    private int[] myEmployeeID = {6668466, 4520125, 7895122, 8777541, 8451277, 1302850, 4447892};
    private int[] myHours = new int[7];
    private double[] myPayRate = new double[7];
    private double[] myWages = new double[7];

    public int getEmployeeIndex(int id) {
        for(int i = 0; i < this.myEmployeeID.length; i++){
            if(this.myEmployeeID[i] == id)
                return i;
        }
        return -1;
    }

    public void setPay(int id, double payrate) {
        int index = getEmployeeIndex(id);
        if (index > -1)
            this.myPayRate[index] = payrate;
        else
            System.out.println("Employee not found.");
    }

    public void setHours(int id, int hours) {
        int index = getEmployeeIndex(id);
        if (index > -1)
            this.myHours[index] = hours;
        else
            System.out.println("Employee not found.");
    }

    public void setWages(int id) {
        int index = getEmployeeIndex(id);
        if (index > -1)
            this.myWages[index] = this.myPayRate[index] * this.myHours[index];
        else
            System.out.println("Employee not found.");
    }

    public int[] getHours() {
        return myHours;
    }

    public double[] getPay() {
        return myPayRate;
    }

    public double[] getWages() {
        return myWages;
    }
}