package pl.com.urbanlab.discounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by andrzej on 28.12.16.
 */
public class Cart {

    private Map<Book, Integer> books = new HashMap();
    private List<Discount> discounts = new ArrayList<Discount>();

    public void add(Book book, int amount) {
        books.put(book, amount);
    }

    public int price() {
        int total = 0;
        for (Book book : books.keySet()) {
            int amount = books.get(book);
            total += book.price * amount * getDiscount(amount);
        }
        return total;
    }

    private double getDiscount(int amount) {
        double discountPercent = 0;
        if (!discounts.isEmpty()) {
            discountPercent = discounts.get(0).getDiscount(amount);
        }

        return 1 - discountPercent;
    }

    public void addDiscount(Discount discount) {
        discounts.add(discount);
    }
}
