public class EmployeePartTime extends Employee {
    double rate = 12.99;

    public EmployeePartTime(double rate) {
        this.rate = rate;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double GetHourlyRate() {
        return rate;
    }
}
