import java.util.LinkedList;
import java.util.List;

public class Store {
    private static List<Sku> storeShelf;

    public static void main(String[] args) {
        fillStore();
        printStoreShelf();
    }

    private static void fillStore() {
        storeShelf = new LinkedList<>();
        storeShelf.add(new Sku("123HJ-865972", "Vacuum cleaner", "Samsung", 3.3, 75));
        storeShelf.add(new Sku("135RV-333972-22", "Owen", "Mile", 12.5, 138));
        storeShelf.add(new Sku("123HJ-865972", "Razor", "Philips", 0.3, 99.9));
        storeShelf.add(new Sku("123HJ-865972", "TV", "Sony", 21.37, 1175));
    }

    private static void printStoreShelf() {
        double totalCostOfShelf = 0.0;
        System.out.println("There are goods on the shelf :");
        for (Sku element : storeShelf) {
            System.out.println(element.toString());
            totalCostOfShelf += element.getPrice();
        }
        System.out.println("Total SKU  : " + storeShelf.size());
        System.out.println("Total cost : " + totalCostOfShelf + " $");
    }
}
