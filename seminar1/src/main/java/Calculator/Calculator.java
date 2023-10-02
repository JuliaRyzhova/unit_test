package Calculator;

public class Calculator {
    public double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0 || discountAmount > 99)
            throw new ArithmeticException("Процент допустимой скидки вне диапазона");
        return purchaseAmount - (purchaseAmount / 100 * discountAmount);
    }

}
