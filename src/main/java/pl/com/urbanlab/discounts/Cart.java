package pl.com.urbanlab.discounts;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by andrzej on 28.12.16.
 */
public class Cart {

    private Map<Book, Integer> books = new HashMap();

    public void add(Book book, int amount) {
        books.put(book, amount);
    }

    public int price() {
        int total = 0;
        for (Book book : books.keySet()) {
            int amount = books.get(book);
            total += book.price * amount;
        }
        return total;
    }
}
