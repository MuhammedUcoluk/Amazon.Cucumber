package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="sp-cc-accept")
    public WebElement cerezleriKabulEt;

    @FindBy(xpath = "//span[.='Merhaba, Giriş yapın']")
    public WebElement LoginButonu;

    @FindBy(id="ap_email")
    public WebElement kullaniciAdiSekmesi;

    @FindBy(id="continue")
    public WebElement devamEtButonu;

    @FindBy(id="ap_password")
    public WebElement passwordSekmesi;

    @FindBy(id="signInSubmit")
    public WebElement girisYapButonu;

    @FindBy(className = "a-box-inner a-alert-container")
    public WebElement basarisizsonucYazisi;

    @FindBy(id = "glow-ingress-line1")
    public WebElement basarilisonucYazisi;


    }

