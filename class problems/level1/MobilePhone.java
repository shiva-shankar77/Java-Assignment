class MobilePhone {
    String brand;
    String model;
    double price;
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MobilePhone m = new MobilePhone();
        m.brand = "Samsung";
        m.model = "Galaxy S24";
        m.price = 79999;
        m.display();
    }
}
