package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BdShop {
    public BdShop(){
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(xpath = "(//*[text()='Consumer Electronics'])[1]")
    public WebElement consumerElectronics;

    @FindBy(xpath = "(//*[text()='DSLR Camera'])[1]")
    public WebElement DSLRCamera;

    @FindBy(xpath = "//*[@class='base']")
    public WebElement DSLRCameraVerify;

    @FindBy(xpath = "(//h2//a)[2]")
    public WebElement urun;

    @FindBy(xpath = "//*[@class='product-info-main']")
    public WebElement urunBilgisi;

    @FindBy(xpath = "//*[text()='Add to Cart']")
    public WebElement addToCart;

    @FindBy(xpath = "//*[text()='View Cart']")
    public WebElement viewCart;

    @FindBy(xpath = "//*[@class='base']")
    public WebElement shoppingCart;

    @FindBy(xpath = "//*[@class='action continue']")
    public WebElement continueShopping;

    @FindBy(xpath = "//*[@class='navigation']")
    public WebElement kategoriMenu;

    @FindBy(xpath = "(//*[text()='Digital Cameras'])[1]")
    public WebElement digitalCameras;

    @FindBy(xpath = "//*[@class='base']")
    public WebElement digitalCamerasVerify;

    @FindBy(xpath = "(//*[@class='product-item-link'])[8]")
    public WebElement sekizinciUrun;

    @FindBy(xpath = "//*[@class='product-info-main']")
    public WebElement urunBilgisiVerify;

    @FindBy(xpath = "(//*[@class='product-item-details'])[4]")
    public WebElement urunSepetteMi;

    @FindBy(xpath = "(//*[@class='input-text qty'])[2]")
    public WebElement urunAdeti;

    @FindBy(xpath = "//*[@class='action update']")
    public WebElement updateCart;

    @FindBy(xpath = "(//*[@class='input-text qty'])[2]")
    public WebElement guncelAdet;

    @FindBy(xpath = "(//*[@class='amount'])[4]")
    public WebElement toplamFiyat;

    @FindBy(xpath = "//*[@class='action clear']")
    public WebElement clearShoppingCart;

    @FindBy(xpath = "//*[@class='action-primary action-accept']")
    public WebElement ok;

    @FindBy(xpath = "(//h2)[1]")
    public WebElement deleteVerify;

    @FindBy(xpath = "//*[@class='logo text-hide']")
    public WebElement anaSayfa;

}
