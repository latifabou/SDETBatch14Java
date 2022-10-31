package Class22;

public class StoreProduct {
    class Main {
        public static void main(String[] args) {
            StoreProduct obj1 = new StoreProduct("Eggs", 3, "Produce", true, 10);
            obj1.diplayInfo();
            StoreProduct obj2 = new StoreProduct("Paper Towels", 2, 24);
            obj2.diplayInfo();
            StoreProduct obj3 = new StoreProduct("Paper Towels", 2, false);
            obj3.diplayInfo();
        }
    }


    String label;
    double price;
    String category;
    boolean hasExpiration;
    int stock;

    StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    StoreProduct(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        category = "misc";
        hasExpiration = false;
        this.stock = stock;
    }

    StoreProduct(String label, double price, boolean hasExpiration) {
        this.label = label;
        this.price = price;
        this.hasExpiration = hasExpiration;
        stock = 0;
    }

    void diplayInfo() {
        System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
    }


}