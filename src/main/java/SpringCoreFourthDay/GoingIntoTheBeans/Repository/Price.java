package SpringCoreFourthDay.GoingIntoTheBeans.Repository;

public class Price {
    private final double price;

    public Price(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Price [price: " + price + "]";
    }

}

