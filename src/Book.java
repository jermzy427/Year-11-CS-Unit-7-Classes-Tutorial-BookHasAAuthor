public class Book {
    private Author author;
    private String name;
    private double price;
    private int qty;

    public Book(String name, Author author, double price, int qty){
        this.author = author;
        this.name = name;
        this.price = price;
        this.qty = qty;
    }
    public Author getAuthor() {
        return this.author;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty() {
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }


    public String toString() {
        return "'"+name+"' "+ "by " + author.getName() + " ("+author.getGender()+") at "+ author.getEmail();
    }
}
