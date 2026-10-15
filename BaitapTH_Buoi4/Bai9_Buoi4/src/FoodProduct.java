public class FoodProduct extends Product {
    private String expiryDate;

    public FoodProduct(String id, String name, String expiryDate) {
        super(id, name);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - " + expiryDate);
    }
}