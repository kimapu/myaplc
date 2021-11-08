package tut8.tutorial.q3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

@FunctionalInterface
interface Computer<T, U, R> {
    R apply(T t1, U t2);
}

public class Demo {
	 //lambda expr
    static Computer<Double, Double, Double> calc = (t1, t2) -> t1 * (1 * t2);

    public static void main(String[] args) {

        functional();

    }

    static final void functional() {

//        PaymentCalculator calc = new PaymentCalculator();

        Item i1 = new Item("Soap", 3.9);
        Item i2 = new Item("Plate", 15.9);
        Item i3 = new Item("Wok", 199.9);

        Order order = new Order();
        order.setItems(Arrays.asList(i1, i2, i3));

        List<Item> tempLst = order.getItems();
        double sum = tempLst.stream()
                .map(item -> {

                    item.price += calc.apply(item.price, 0.06);
                    return item.price;

                })
                .mapToDouble(Double::doubleValue)
                .sum();
        System.out.println("Total payment w/o 10% tax: " + sum);
        System.out.println("10% tax: " + calc.apply(sum, 0.1));
        System.out.println("\nTotal payment including 10% tax: " + (sum + calc.apply(sum, 0.1)));
    }

}

class Order {

    List<Item> items = new ArrayList();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}

class Item {

    String name;
    double price;

    public Item(String name, double price) {
        super();
        this.name = name;
        this.price = price;
    }

    public Item() {
        super();
        // TODO Auto-generated constructor stub
    }

}

//Alternatively, BiFunction is equivalent to Computer interface.
class PaymentCalculator2 implements BiFunction<Double, Double, Double> {

    @Override
    public Double apply(Double t, Double u) {
        return t * (1 * u);
    }

}
