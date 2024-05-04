import org.lecture.Product;

public class ConcreteProduct extends Product {

    public String getName() {
        return this.name;

    }

    public void setName(String newName) {
        this.name = newName;
    }

    /*
    price is private in Superclass
    public double getPrice() {
        return this.price;
    }
    */
}
