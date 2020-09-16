package co.com.certification.RetoSophos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Track
{
    public static final Target ClickSearch = Target.the("Click search").located(By.id("search-autocomplete-input"));
    public static final Target ScrollItems = Target.the("Scroll web site").located(By.xpath("(//a[@class='product-item__name'])[1]"));
    public static final Target ClickAddMani = Target.the("Click Maní").located(By.xpath("(//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart'])[1]"));

}
