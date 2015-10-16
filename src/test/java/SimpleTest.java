import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by tatsianabeliai on 10/14/15.
 */
public class SimpleTest {

    @Test(dataProvider = "primalNumbers", dataProviderClass = DataProvider.class, groups = "DDT")
    public void simpleTest(int number, boolean expectedResult) {
        PrimalNumberChecker checker = new PrimalNumberChecker();
        boolean result = checker.isNumberPrimal(number);
        Assert.assertEquals(result, expectedResult);
    }

    @Test(groups = "sanity")
    public void fifteen(){
        PrimalNumberChecker checker = new PrimalNumberChecker();
        boolean result = checker.isNumberPrimal(15);
        Assert.assertEquals(result, false);
    }
    @Test(groups = "sanity")
    public void twentyThreeTest(){
        PrimalNumberChecker checker = new PrimalNumberChecker();
        boolean result = checker.isNumberPrimal(23);
        Assert.assertEquals(result, true);
    }

    @Test(groups = "sanity")
    public void twentyOneTest(){
        PrimalNumberChecker checker = new PrimalNumberChecker();
        boolean result = checker.isNumberPrimal(21);
        Assert.assertEquals(result, false);
    }
}
