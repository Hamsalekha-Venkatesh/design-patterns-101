package java.org.modernjava.monkey_patching;

public class MoneyConvertor implements IMoneyConvertor{
    public double conversion;

    public MoneyConvertor() {
        this.conversion = 1.5;
    }

    @Override
    public double convertEuroToUSD(double amount) {
        return this.conversion * amount;
    }
}
