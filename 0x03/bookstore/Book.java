public class Book {
    private String title;
    private String author;
    private float price;

    public Book(String title, String author, float price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }

    public void setTitle(String title) {
        if (title.length() < 3) {
            throw new InvalidBookException("Invalid book title");
        } else {
            this.title = title;
        }
    }

    public void setAuthor(String author) {
        if (author.contains(" ")) {
            this.author = author;
        } else {
            throw new InvalidAuthorException("Invalid author name");
        }
    }

    public void setPrice(float price) {
        if (price <= 0) {
            throw new InvalidBookException("Invalide book price");
        } else {
            this.price = price;
        }
    }
}
