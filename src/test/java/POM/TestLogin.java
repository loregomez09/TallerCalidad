package POM;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin {

    private WebDriver driver;
    private IniciodeSesion iniciodeSesion;
    @Before
    public void inicio(){
        iniciodeSesion = new IniciodeSesion(driver);
        driver = iniciodeSesion.ConectorChrome();
        iniciodeSesion.pagina("https://toolsqa.com/");
    }
  /*  @After
    public void cerrar(){
        driver.quit();
    }*/
    @Test
    public void inicioExitoso(){
     //   iniciodeSesion.iniciarSesion("Lore ","lore@gmail.com","Centro","Centro");
       // Assert.assertEquals("Envio correcto", iniciodeSesion.mensajeFinal());
    }

}
