package Assignment_3;

public class Car
{
    private String model, series;
    String[] countries = {"Apple", "Orange", "Banana", "Pineapple", "None of the listed"};

    private enum country{
        japan,
        america,
        germany,
        france, italy
    }
    private int horsepower, year, doors;

    public Car(String model, String series, int horsepower, int year, int top_speed) {
        this.model = model;
        this.series = series;
        this.horsepower = horsepower;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getSeries() {
        return series;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public void setYear(int year) {
        this.year = year;
    }



    @Override
    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", series='" + series + '\'' + ", horsepower=" + horsepower + ", year=" + year + ", top_speed=" + '}';
    }
}
