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
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String id = scanner.next();
            String name = scanner.next();
            double gpa = scanner.nextDouble();
            students.add(new Student(id, name, gpa));
        }

        students.removeIf(student -> student.getGpa() < 5.0);

        System.out.println("After removing GPA < 5.0:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));

        System.out.println("After sorting by name:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();

        Operation<Double> add = (a, b) -> a + b;
        Operation<Double> subtract = (a, b) -> a - b;
        Operation<Double> multiply = (a, b) -> a * b;
        Operation<Double> divide = (a, b) -> b != 0 ? a / b : Double.NaN;

        double x = 10.0, y = 2.0;
        System.out.println("Demo Custom Functional Interface:");
        System.out.println(x + " + " + y + " = " + add.execute(x, y));
        System.out.println(x + " - " + y + " = " + subtract.execute(x, y));
        System.out.println(x + " * " + y + " = " + multiply.execute(x, y));
        System.out.println(x + " / " + y + " = " + divide.execute(x, y));

        scanner.close();
    }
}