package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefinitions {
    AmazonPage amazonPages=new AmazonPage();

    @And("kullanici cerezleri kabul et butonuna tiklar")
    public void kullaniciCerezleriKabulEtButonunaTiklar() {
        amazonPages.cerezleriKabulEt.click();
    }
    @Then("giris yapin sekmesine tiklar")
    public void girisYapinSekmesineTiklar() {
        amazonPages.LoginButonu.click();
    }

    @Then("dogru kullanici adi girer")
    public void dogru_kullanici_adi_girer() {
       amazonPages.kullaniciAdiSekmesi.sendKeys("5414542930");
       amazonPages.devamEtButonu.click();

    }
    @Then("yanlis sifre girer")
    public void yanlis_sifre_girer() {
       amazonPages.passwordSekmesi.sendKeys("123123");

    }
    @Then("giris yap butonun tiklar")
    public void giris_yap_butonun_tiklar() {
        amazonPages.girisYapButonu.click();

    }
    @Then("giris yapamadigini test eder")
    public void giris_yapamadigini_test_eder() {
       Assert.assertTrue(amazonPages.basarisizsonucYazisi.isDisplayed());

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
       Driver.closeDriver();

    }


    @And("yanlis kullanici adi girer")
    public void yanlisKullaniciAdiGirer() {
        amazonPages.kullaniciAdiSekmesi.sendKeys("muhammeduçoluk@gmail.com");

    }

    @And("devam et butonuna tiklar")
    public void devamEtButonunaTiklar() {

        amazonPages.devamEtButonu.click();
    }

    @And("dogru sifre girer")
    public void dogruSifreGirer() {

        amazonPages.passwordSekmesi.sendKeys("15935728");
    }

    @Then("giris yap butonuna tiklar")
    public void girisYapButonunaTiklar() {

        amazonPages.girisYapButonu.click();
    }

    @And("basarili giris yapildigini test eder")
    public void basariliGirisYapildiginiTestEder() {

        Assert.assertTrue(amazonPages.basarilisonucYazisi.isDisplayed());

    }

    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));

    }
}
