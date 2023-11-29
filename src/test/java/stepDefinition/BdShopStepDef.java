package stepDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;
import pages.BdShop;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.*;

public class BdShopStepDef {
    BdShop bdShop = new BdShop();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("kullanici {string} sayfasina properties ile gider")
    public void kullanici_sayfasina_properties_ile_gider(String url) {
        Driver.getDriver().get(ConfigReader.getProperty(url));
    }
    @When("kullanici Consumer Electronics'i secer")
    public void kullanici_consumer_electronics_i_secer() {
        actions.moveToElement(bdShop.consumerElectronics).perform();
    }
    @Then("kullanici DSLR Camera secer")
    public void kullanici_dslr_camera_secer() {
        js.executeScript("arguments[0].click()" , bdShop.DSLRCamera);
    }
    @Then("kullanici {int} saniye bekler")
    public void kullanici_saniye_bekler(Integer sayi) {
        try {
            Thread.sleep(sayi*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Then("kullanici DSLR Camera kategorisinde oldugunu dogrular")
    public void kullanici_dslr_camera_kategorisinde_oldugunu_dogrular() {
        assertTrue(bdShop.DSLRCameraVerify.isDisplayed());

        //if (bdShop.DSLRCameraVerify.getText().contains("DSLR Camera")) {
        //    System.out.println("DSLR Camera sayfasindasiniz");
        //}else {
        //    System.out.println("DSLR Camera sayfasinda degilsiniz");
        //}
    }
    @Then("acilan kategoriden bir urune tikla")
    public void acilan_kategoriden_bir_urune_tikla() {
        js.executeScript("arguments[0].click()" , bdShop.urun);
    }
    @Then("urunun bilgilerinin gorunurlugunu dogrula")
    public void urunun_bilgilerinin_gorunurlugunu_dogrula() {
        assertTrue(bdShop.urunBilgisi.isDisplayed());
    }
    @Then("urunu satin almak icin Add To Cart butonuna tikla")
    public void urunu_satin_almak_icin_add_to_cart_butonuna_tikla() {
        js.executeScript("arguments[0].click()" , bdShop.addToCart);
        ReusableMethods.bekle(2);
    }
    @Then("acilan sayfada View Cart butonuna tikla sepete git")
    public void acilan_sayfada_view_cart_butonuna_tikla_sepete_git() {
        js.executeScript("arguments[0].click()" , bdShop.viewCart);
        ReusableMethods.bekle(2);
    }
    @Then("sepete gittigini dogrula")
    public void sepete_gittigini_dogrula() {
        assertTrue(bdShop.shoppingCart.isDisplayed());
        ReusableMethods.bekle(2);
    }
    @Then("Continue Shopping butonuna tikla")
    public void continue_shopping_butonuna_tikla() {
        js.executeScript("arguments[0].click()" , bdShop.continueShopping);
        ReusableMethods.bekle(2);
    }
    @Then("alisverise devam ettigini dogrula")
    public void alisverise_devam_ettigini_dogrula() {
        assertTrue(bdShop.kategoriMenu.isDisplayed());
    }
    @Then("kullanici Consumer Electronics'den Digital Cameras'i secer")
    public void kullanici_consumer_electronics_den_digital_cameras_i_secer() {
        actions.moveToElement(bdShop.consumerElectronics).perform();
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click()" , bdShop.digitalCameras);
        ReusableMethods.bekle(2);

    }
    @Then("kullanici Digital Cameras kategorisinde oldugunu dogrular")
    public void kullanici_digital_cameras_kategorisinde_oldugunu_dogrular() {
        assertTrue(bdShop.digitalCamerasVerify.isDisplayed());

        //if (bdShop.digitalCamerasVerify.isDisplayed()) {
        //    System.out.println("Gorunur");
        //}else {
        //    System.out.println("Gorunur Degil");
        //}
    }
    @Then("acilan kategoriden sekizinci urune tiklar")
    public void acilan_kategoriden_sekizinci_urune_tiklar() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        js.executeScript("arguments[0].click()" , bdShop.sekizinciUrun);
        ReusableMethods.bekle(2);
    }
    @Then("urunu satin almak icin Add To Cart butonuna tiklar")
    public void urunu_satin_almak_icin_add_to_cart_butonuna_tiklar() {
        assertTrue(bdShop.urunBilgisiVerify.isDisplayed());
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click()" , bdShop.addToCart);
        ReusableMethods.bekle(2);
        js.executeScript("arguments[0].click()" , bdShop.viewCart);
        ReusableMethods.bekle(2);
    }
    @Then("ikinci urunun sepette oldugunu dogrula")
    public void ikinci_urunun_sepette_oldugunu_dogrula() {
        assertTrue(bdShop.urunSepetteMi.isDisplayed());
    }
    @Then("sepetteki urunlerden birinin adetini arttir")
    public void sepetteki_urunlerden_birinin_adetini_arttir() {
        bdShop.urunAdeti.clear();
        bdShop.urunAdeti.sendKeys("2" , Keys.ENTER);
    }
    @Then("Update Cart butonuna tikla sepeti guncelle")
    public void update_cart_butonuna_tikla_sepeti_guncelle() {
        js.executeScript("arguments[0].click()" , bdShop.updateCart);
    }
    @Then("toplam fiyatin gorunurlugunu dogrula")
    public void toplam_fiyatin_gorunurlugunu_dogrula() {
        assertTrue(bdShop.toplamFiyat.isDisplayed());
    }
    @When("Clear Shopping Cart butonuna tikla")
    public void clear_shopping_cart_butonuna_tikla() {
        js.executeScript("arguments[0].click()" , bdShop.clearShoppingCart);
    }
    @Then("cikan uyariyi onayla")
    public void cikan_uyariyi_onayla() {
        js.executeScript("arguments[0].click()" , bdShop.ok);
    }
    @Then("sepetin bos oldugunu dogrula")
    public void sepetin_bos_oldugunu_dogrula() {
        assertTrue(bdShop.deleteVerify.isDisplayed());
    }
    @Then("anasayfaya don")
    public void anasayfaya_don() {
        js.executeScript("arguments[0].click()" , bdShop.anaSayfa);
        ReusableMethods.bekle(2);
    }
    @Then("sayfayi kapat")
    public void sayfayi_kapat() {
        Driver.closeDriver();
    }
}
