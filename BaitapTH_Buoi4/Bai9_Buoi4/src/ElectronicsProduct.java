public class ElectronicsProduct extends Product {
    private int warrantyMonths;

    public ElectronicsProduct(String id, String name, int warrantyMonths) {
        super(id, name);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    @Override
    public void displayInfo() {
        System.out.println(name + " - " + warrantyMonths + " tháng bảo hành");
    }
}