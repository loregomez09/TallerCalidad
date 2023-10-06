package POM;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IniciodeSesion extends Base {


    private By ClickDemo = By.xpath("//ul[@class='hamburger-menu__links d-lg-none']//a[.='Demo Site']");
   // private By ClickElem = By.xpath("//ul[@class='hamburger-menu__links d-lg-none']//a[.='Demo Site']");
   // private By ClickText = By.xpath("//span[.='Text Box']");
    //private By txtName = By.xpath("//input[@id='userName']");
    //private By txtEmail = By.xpath("//input[@id='userName']");
    //private By txtCurrent = By.xpath("//input[@id='userName']");
    //private By txtPermanent = By.xpath("//input[@id='userName']");
    //private By btnEnvio = By.xpath("//input[@name='submit']");
    //private By mensaje = By.xpath("//p[@id='currentAddress']");



    public IniciodeSesion(WebDriver driver){

        super(driver);
    }

    //Metodo inicio sesion
    public void iniciarSesion(String Name, String Email, String Current, String Permanent){
        findElement(ClickDemo).click();
      //  findElement(ClickElem).click();
      /*  findElement(ClickText).click();
        findElement(txtName).sendKeys(Name);
        findElement(txtEmail).sendKeys(Email);
        findElement(txtCurrent).sendKeys(Current);
        findElement(txtPermanent).sendKeys(Permanent);
        findElement(btnEnvio).click();
*/
    }
  /*  public String mensajeFinal(){
        return findElement(mensaje).getText();
    }

*/
}
