import java.util.Objects;

public class Car implements Comparable<Car> {

    String vin;
    String model;
    String manufacturer;
    int year;
    int mileage;
    int price;

    public Car(String vin, String model, String manufacturer,
               int year, int mileage, int price) {
        this.vin = vin;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }
//геттеры
    public String getVin() {
        return vin;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    //переопределение методов
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(vin, car.vin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    @Override
    public int compareTo(Car OtherCar) {
        return Integer.compare(OtherCar.year, this.year);
    }

    @Override
    public String toString() {
        return "Car " +
                "vin= '" + vin + '\'' +
                ", model= '" + model + '\'' +
                ", manufacturer= '" + manufacturer + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                ", price=" + price ;
    }
}


