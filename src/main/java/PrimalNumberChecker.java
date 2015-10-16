/**
 * Created by tatsianabeliai on 10/14/15.
 */
public class PrimalNumberChecker {
    public boolean isNumberPrimal(int primeNumber) {
        for (int i = 2; i < (primeNumber / 2); i++) {
            if (primeNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
