import java.util.ArrayList;
import java.util.List;

public class Warehouse<T extends Product> {
    private String warehouseName;
    private List<T> items;

    public Warehouse(String warehouseName) {
        this.warehouseName = warehouseName;
        this.items = new ArrayList<>();
    }

    // Nhập kho
    public void addItem(T item) {
        items.add(item);
    }

    // Xuất kho
    public void removeItem(T item) {
        items.remove(item);
    }

    // Kiểm kê
    public void inventoryCheck() {
        System.out.println(warehouseName + ":");
        for (T item : items) {
            item.displayInfo();
        }
    }
}