package co.com.certification.RetoSophos.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Track
{
    public static final Target ClosePopUpNotify = Target.the("Close Pop_Up").located(By.xpath("(//button[@id='onesignal-slidedown-cancel-button'])"));
    public static final Target ClickSearch = Target.the("Click search").located(By.id("search-autocomplete-input"));
    public static final Target ScrollItems = Target.the("Scroll web site").located(By.xpath("(//a[@class='product-item__name'])[1]"));
    public static final Target ClickAddMani = Target.the("Click Maní").located(By.xpath("(//button[@class='product-item__add-to-cart product-add-to-cart btn red add-to-cart'])[1]"));
    public static final Target CLosePopUp = Target.the("Close Pop up").located(By.xpath("(//button[@class='modal-address__close font-icn cross'])"));
    public static final Target ScrollUpPage = Target.the("Scroll up web site").located(By.xpath("(//div[@class='shipping-preference__active-label'])"));
    public static final Target ClickShoppingCart = Target.the("click on shopping cart").located(By.xpath("(//button[@class='btn red minicart__action--toggle-open food-site'])"));
    public static final Target ClickLookCart = Target.the("Click on look shopping cart").located(By.xpath("(//a[@class='btn primary minicart__action minicart__action--buy'])[1]"));
    public static final Target ScrollToVerify = Target.the("Scroll to verify items").located(By.xpath("(//div[@class='text'])[7]"));
    public static final Target VERIFYITEMS = Target.the("Verify items").located(By.xpath("(//a[@class='product-item__name'])"));
   // public static final Target prueba = Target.the("....").located(By.xpath("//button[@id='onesignal-slidedown-cancel-button']"));



}
