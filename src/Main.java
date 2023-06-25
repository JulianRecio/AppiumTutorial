import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        //Appium code
        DesiredCapabilities cap = new DesiredCapabilities();

        //cap.setCapability(MobileCapabilityType.UDID,"RF8RA13XAAK");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"android");
        cap.setCapability(MobileCapabilityType.APP, "C:\\Users\\Tomas\\IdeaProjects\\AppiumTutorial\\src\\basketball.apk"); // este apk esta configurado para que me llegue a mi ip, se necesita cambiar si quieren usarlo
        AndroidDriver ad = new AndroidDriver(new URL("http://localhost:4723"),cap);
        Thread.sleep(45000);
        //Start searching

        ad.findElement(By.id("startSearchingButton")).click();
        Thread.sleep(45000);
        ////NBA
        //aca falta un identificador en el boton de la liga
        //Thread.sleep(45000);
        ////Orlando Magic
        ad.findElement(By.id("team_8"));
        Thread.sleep(45000);
        ////Cletus Grant III, se va a seleccionar el player_86 de la bdd
        ad.findElement(By.id("player_86"));
        Thread.sleep(45000);
        ////Return
        ad.findElement(By.id("returnButton"));
        Thread.sleep(45000);
        //// NBA <- Orlando Magic, le falta un identficador al return button
        //Thread.sleep(45000);
        //// Leagues <- NBA, mismo que el anterion
        //Thread.sleep(45000);
        //// Home <- Leagues, lo mismo que lo anterior
    }
}