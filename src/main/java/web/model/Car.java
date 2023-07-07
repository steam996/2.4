package web.model;
public class Car {

    private String name;
    private Integer series;
    private Integer year;

    public Car() {
    }

    public Car(String name, Integer series, Integer year) {
        this.name = name;
        this.series = series;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", series=" + series +
                ", year=" + year +
                '}';
    }
}
