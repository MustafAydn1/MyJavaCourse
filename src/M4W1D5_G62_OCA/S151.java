package M4W1D5_G62_OCA;



public class S151 {
    ElectricAccount acct = new ElectricAccount();

    public void useElectricity(double kWh){
        acct.addKWh(kWh);
    }
}


class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    public void addKWh(double kWh)
    {
        if (kWh>0)
        {
            this.kWh +=kWh;
            this.bill = this.kWh * this.rate;
        }
    }

    // line n1
}
