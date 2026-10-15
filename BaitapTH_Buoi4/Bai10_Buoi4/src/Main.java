import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();

        LibrarySection<Book> bookSection = new LibrarySection<>("Khu vực Sách");
        LibrarySection<DVD> dvdSection = new LibrarySection<>("Khu vực DVD");

        for (int i = 0; i < n; i++) {
            String type = scanner.next();
            String id = scanner.next();
            String title = scanner.next();

            if ("B".equalsIgnoreCase(type)) {
                String author = scanner.next();
                int pages = scanner.nextInt();
                bookSection.addItem(new Book(id, title, author, pages));
            } else if ("D".equalsIgnoreCase(type)) {
                String director = scanner.next();
                int duration = scanner.nextInt();
                dvdSection.addItem(new DVD(id, title, director, duration));
            }
        }

        bookSection.displaySection();
        System.out.println();
        dvdSection.displaySection();

        // Test Generic
        // Đưa DVD vào Khu vực Book:
        // bookSection.addItem(new DVD("D99", "Inception", "Nolan", 148));

        scanner.close();
    }
}