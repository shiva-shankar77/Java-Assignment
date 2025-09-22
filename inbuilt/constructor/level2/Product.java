class Product {
    String productName;
    double price;
    static int totalProducts;

    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
