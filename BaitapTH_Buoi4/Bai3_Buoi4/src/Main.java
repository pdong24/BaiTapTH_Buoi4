import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String id = scanner.next();
            String name = scanner.next();
            double baseSalary = scanner.nextDouble();

            if ("O".equalsIgnoreCase(type)) {
                employees.add(new OfficeWorker(id, name, baseSalary));
            } else if ("T".equalsIgnoreCase(type)) {
                int overtimeHours = scanner.nextInt();
                employees.add(new Technician(id, name, baseSalary, overtimeHours));
            }
        }

        double totalPay = 0;

        for (Employee emp : employees) {
            double pay = emp.calculatePay();
            totalPay += pay;

            System.out.println(emp.getName() + " - Pay: " + pay);
            emp.work();
            System.out.println();
        }

        System.out.println("Total Pay = " + totalPay);

        scanner.close();
    }
}