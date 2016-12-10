package pl.com.urbanlab.kentbeck.financial;

import org.junit.Test;
import pl.com.urbanlab.kentbeck.financial.Bank;
import pl.com.urbanlab.kentbeck.financial.Expression;
import pl.com.urbanlab.kentbeck.financial.Money;
import pl.com.urbanlab.kentbeck.financial.Sum;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 05.12.16.
 */
public class MoneyTest {

    @Test
    public void testMultiplication() {
        Expression fiveDollar = Money.dollar(5);
        Expression tenDollar = fiveDollar.times(2);
        assertEquals(Money.dollar(10), tenDollar);
        Expression fifteenDollar = fiveDollar.times(3);
        assertEquals(Money.dollar(15), fifteenDollar);
    }

    @Test
    public void testEquality() {
        Money fiveFranc = Money.franc(5);
        Money fiveDollar = Money.dollar(5);
        assertNotEquals(fiveDollar, fiveFranc);
        assertEquals(Money.dollar(5), fiveDollar);
        assertEquals(Money.franc(5), fiveFranc);
    }

    @Test
    public void testSum() {
        Money fiveDollar = Money.dollar(5);
        Money tenDollar = Money.dollar(10);
        Money sevenDollar = Money.dollar(7);
        Sum sum = (Sum) fiveDollar.plus(tenDollar);
        assertEquals(fiveDollar, sum.augent);
        assertEquals(tenDollar, sum.addend);
        assertNotEquals(Money.dollar(10), fiveDollar.plus(sevenDollar));
    }

    @Test
    public void testSimpleAddition() {
        Bank bank = new Bank();
        Expression sum = new Sum(Money.dollar(5), Money.dollar(5));
        Expression sum2 = new Sum(Money.dollar(7), Money.dollar(8));
        Money reduced = bank.reduce(sum, "USD");
        Money reduced2 = bank.reduce(sum2, "USD");
        assertEquals(Money.dollar(10), reduced);
        assertEquals(Money.dollar(15), reduced2);
    }

    @Test
    public void testReduce() {
        Money six = Money.dollar(6);
        Bank bank = new Bank();
        assertEquals(six, six.reduce(bank, "USD"));
    }

    @Test
    public void testReduceDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.franc(2), "USD");
        assertEquals(Money.dollar(1), result);
    }

    @Test
    public void testRateTable() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        bank.addRate("PLN", "USD", 4);
        assertEquals(2, bank.rate("CHF", "USD"));
        assertEquals(1, bank.rate("USD", "USD"));
        assertEquals(4, bank.rate("PLN", "USD"));
    }

    @Test
    public void testMixedAddition() {
        Expression dollar = Money.dollar(1);
        Expression twoFranc = Money.franc(2);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression result = bank.reduce(dollar.plus(twoFranc), "USD");
        assertEquals(Money.dollar(2), result);
    }

    @Test
    public void testSumPlusMoney() {
        Expression fiveDollar = Money.dollar(5);
        Expression tenFranc = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = fiveDollar.plus(tenFranc).plus(Money.dollar(7));
        Expression result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(17), result);
    }


    @Test
    public void testSumTimes() {
        Expression fiveDollar = Money.dollar(5);
        Expression tenFranc = Money.franc(10);
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Expression sum = fiveDollar.plus(tenFranc).times(2);
        Expression result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(20), result);
    }
}