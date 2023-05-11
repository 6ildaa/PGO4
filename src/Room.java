import java.math.BigDecimal;
import java.util.List;

class Room {
    private BigDecimal area;
    private List<Furniture> furnitureList;
    private BigDecimal vatRate;

    public Room(BigDecimal area, List<Furniture> furnitureList, BigDecimal vatRate) {
        this.area = area;
        this.furnitureList = furnitureList;
        this.vatRate = vatRate;

    }

    public BigDecimal getTotalPriceIncludingVat() {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for (Furniture furniture : furnitureList) {
            totalPrice = totalPrice.add(furniture.getPriceIncludingVat());
        }
        return totalPrice;
    }



}
