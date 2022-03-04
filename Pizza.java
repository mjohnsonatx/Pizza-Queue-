public class Pizza {
    String ingredients;
    String address;
    Pizza  next;

    public Pizza(String ingredients, String address ) {
        this.address = address;
        this.ingredients = ingredients;
        next = null;

    }

    public Pizza () {};
}