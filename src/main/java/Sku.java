public class Sku {
    private String vendorCode;
    private String name;
    private String brand;
    private double weight;
    private double price;

    public Sku(String vendorCode, String name, String brand, double weight, double price) {
        this.vendorCode = vendorCode;
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
    }

    public Sku() {

    }

    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sku{" +
                "vendorCode = '" + vendorCode + '\'' +
                ", name = '" + name + '\'' +
                ", brand = '" + brand + '\'' +
                ", weight = " + weight +
                ", price = " + price +
                '}';
    }
}
