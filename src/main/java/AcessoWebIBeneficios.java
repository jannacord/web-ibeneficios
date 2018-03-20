import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebDriver.*;
import org.testng.annotations.Test;


public class AcessoWebIBeneficios {


    public static void main (String args[])  {

        String email = "65846803555@gmail.com" ;
        String senha = "Rede@2018";

        WebDriver driver = new ChromeDriver(  );
        System.setProperty("webdriver.chrome.driver","C:\\Users\\444101\\IdeaProjects\\Chrome");
        driver.get( "http://10.59.164.13/integracao/#/clientes/login?ibeneficios=Id1234" );


        driver.findElement( By.id("rpLogin-create-accoute-link")).click();
        driver.findElement( By.id( "signup-name-input" )).sendKeys( "Jaiminho Testes de Software" );
        driver.findElement( By.id("signup-cpf-input") ).sendKeys( "65846803555" );
        driver.findElement( By.name("dadosPhone") ).sendKeys( "11979932421" );
        driver.findElement( By.name("dadosEmail") ).sendKeys( email );
        driver.findElement( By.id("signup-proceed-button") ).click();

        try {

            Thread.sleep( 10000 );

        }catch (Exception e){}

        //Criar Senha
        driver.findElement( By.id("password-password-input") ).sendKeys( senha );
        driver.findElement( By.name("accepted") ).click();
        //driver.findElement( By.className( "btn btn-block btn-default bottom-positioned" ) ).click();
        driver.findElement(By.xpath("//button[contains(@class,'btn btn-block btn-default bottom-positioned')]")).click();

        try {

            Thread.sleep( 10000 );

        }catch (Exception e){}

        //Efetuar Login
        driver.get( "http://10.59.164.13/integracao/#/clientes/login?ibeneficios=Id1234" );
        driver.findElement( By.id( "rpLogin-email-input" ) ).sendKeys( email );
        driver.findElement( By.id( "rpLogin-password-input" ) ).sendKeys( senha );
        driver.findElement( By.id( "rpLogin-accessAccount-button" ) ).click();





    }

}
