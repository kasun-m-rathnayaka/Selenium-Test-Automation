package test.products;

import base.BaseTest;
import com.saucedemo.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest {

    @Test
    public void testProductHeaderDisplayed(){
        ProductsPage productsPage = loginPage.loginToTheApplication("standard_user","secret_sauce");
        Assert.assertTrue(productsPage.isProductHeaderDisplayed(), "Product Header is not Displayed");

    }
}
