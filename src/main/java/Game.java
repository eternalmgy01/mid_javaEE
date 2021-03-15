public class Game {
    String title;
    String description;
    String price;
    String size;

    public Game(String title, String description, String price, String size) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.size = size;
    }

    public Game(String title, String description, double price, double size) {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
