public class GoldEditionBook extends Book {

    public GoldEditionBook(String title, String author, float price) {
        super(title, author, price);
    }

    @Override
    public float getPrice() {
        return this.price * 0.30f;
    }
}
