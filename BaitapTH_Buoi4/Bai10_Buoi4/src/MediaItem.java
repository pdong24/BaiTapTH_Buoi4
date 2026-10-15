public abstract class MediaItem {
    protected String id;
    protected String title;

    public MediaItem(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public abstract void displayInfo();
}