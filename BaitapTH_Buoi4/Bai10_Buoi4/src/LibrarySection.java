import java.util.ArrayList;
import java.util.List;

public class LibrarySection<T extends MediaItem> {
    private String sectionName;
    private List<T> items;

    public LibrarySection(String sectionName) {
        this.sectionName = sectionName;
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public void displaySection() {
        System.out.println(sectionName + ":");
        for (T item : items) {
            item.displayInfo();
        }
    }
}