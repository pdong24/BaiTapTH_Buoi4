import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();

        // Khởi tạo 2 kho riêng biệt
        Warehouse<FoodProduct> foodWarehouse = new Warehouse<>("Kho Thực phẩm");
        Warehouse<ElectronicsProduct> electronicsWarehouse = new Warehouse<>("Kho Điện tử");

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String id = scanner.next();
            String name = scanner.next();

            if ("F".equalsIgnoreCase(type)) {
                String expiryDate = scanner.next();
                foodWarehouse.addItem(new FoodProduct(id, name, expiryDate));
            } else if ("E".equalsIgnoreCase(type)) {
                int warrantyMonths = scanner.nextInt();
                electronicsWarehouse.addItem(new ElectronicsProduct(id, name, warrantyMonths));
            }
        }

        // Print kiểm kê danh sách hàng hóa từng kho
        foodWarehouse.inventoryCheck();
        System.out.println();
        electronicsWarehouse.inventoryCheck();

        // Test
        // Đưa Tivi vào kho Thực phẩm:
        // foodWarehouse.addItem(new ElectronicsProduct("E99", "Tivi", 12)); 

        scanner.close();
    }
}