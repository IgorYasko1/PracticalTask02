package study.BigDecimal;

import java.math.BigDecimal;

public class TestBigDecimal {

    public static void main(String[] args) {

        BigDecimal bigDecimal = new BigDecimal("2.0");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal.subtract(bigDecimal2));
//      output  0.9

        BigDecimal bigDecimal3 = new BigDecimal(2.0);
        BigDecimal bigDecimal4 = new BigDecimal(1.1);
        System.out.println(bigDecimal3.subtract(bigDecimal4));
//      output  0.899999999999999911182158029987476766109466552734375

        final BigDecimal TEN_CENTS = new BigDecimal(".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)){
            funds = funds.subtract(price);
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
//      4 items bought.
//      Money left over: $0.00

    }

}
