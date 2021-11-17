package Assignment_3;

public class Car
{
    private String make, series, country, power_type;
    private int id, year, doors;

    public Car(int id, String make, String series, String power_type, String country, int year, int doors) {
        this.make = make;
        this.series = series;
        this.country = country;
        this.power_type = power_type;
        this.id = id;
        this.year = year;
        this.doors = doors;
    }

    public String getMake() {return make;}
    public String getSeries() {return series;}
    public String getCountry() {return country;}
    public String getPower_type() {return power_type;}
    public int getYear() {return year;}
    public int getDoors() {return doors;}
    public int getID() {return id;}

    public void setMake(String make) {
        this.make = make;
    }
    public void setSeries(String series) {
        this.series = series;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPower_type(String power_type) {
        this.power_type = power_type;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String[] getData() {
        return new String[]{
                Integer.toString(id), make, series, country, power_type,

                Integer.toString(year),
                Integer.toString(doors)
        };
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", series='" + series + '\'' +
                ", country='" + country + '\'' +
                ", power_type='" + power_type + '\'' +
                ", year=" + year +
                ", doors=" + doors +
                ", id=" + id +
                '}';
    }

}
