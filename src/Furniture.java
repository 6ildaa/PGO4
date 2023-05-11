import java.math.BigDecimal;

class Furniture {
    private String name;
    private BigDecimal price;
    private BigDecimal vatRate;

    public Furniture(String name, BigDecimal price, BigDecimal vatRate) {
        this.name = name;
        this.price = price;
        this.vatRate = vatRate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getPriceIncludingVat() {
        return price.multiply(vatRate).add(price);
    }


}
