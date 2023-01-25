public class Car {

    private  String brand;
    private  double price;

    public Car(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public  void addTax(){
        price = price += price * 0.1;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" + "brand='" + brand + '\'' + ", price='" + price + '\'' + '}';
    }





}
