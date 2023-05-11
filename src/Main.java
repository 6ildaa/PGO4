import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String args[]) {


        Multiplier x = new Multiplier();
        x.multiply(1 ,2);

        x.multiply(1,2,3,4);

        x.multiply(2d, 2.37);

        BigDecimal a = new BigDecimal("2.5");
        BigDecimal b = new BigDecimal("4.5");
        x.multiply(a, b);


        Adder z = new Adder();
        int result = z.add(2, 3);

        List<BigDecimal> numbers = Arrays.asList(new BigDecimal("2.5"), new BigDecimal("3.5"), new BigDecimal("4.0"));
        BigDecimal result2 = z.add(numbers);

        Furniture table = new Furniture("Table", new BigDecimal("500"),new BigDecimal("0.23"));
        Furniture sofa = new Furniture("Sofa", new BigDecimal("1500"),new BigDecimal("0.23"));

        Room kitchen = new Room(new BigDecimal("30"), Arrays.asList(table), new BigDecimal("0.23"));

        BigDecimal totalPrice = kitchen.getTotalPriceIncludingVat();

        House myHouse = new House();

        Room livingRoom = new Room(new BigDecimal("40"), Arrays.asList(table, sofa), new BigDecimal("0.23"));

        myHouse.addRoom(livingRoom);
        myHouse.addRoom(kitchen);

        int roomCount = myHouse.getRoomCount();


    }

}
