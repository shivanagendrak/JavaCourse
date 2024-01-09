public class fruit {
    private final String name;
    private final String type;
    private final double price;
    public fruit(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    public void displayFruit() {
        System.out.println("Fruit: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: $" + price);
        System.out.println();
    }
    public static void main(String[] args) {
        fruit fruit1 = new fruit("Apple", "Single", 1.50);
        fruit fruit2 = new fruit("Banana", "Bunch", 0.75);
        fruit fruit3 = new fruit("SHiva","Single",200000000000.00);
        System.out.println("Details of Fruit 1:");
        fruit1.displayFruit();
        System.out.println("Details of Fruit 2:");
        fruit2.displayFruit();
        System.out.println("Details of shiva:");
        fruit3.displayFruit();
    }
}

