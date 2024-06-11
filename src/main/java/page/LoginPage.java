package page;

import object.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    LoginObject loginObject;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        loginObject = new LoginObject(driver);
    }

    public void clickSubmit() {
//        driver.findElement(loginObject.getButtonLogin()).click();
//        driver.findElement(By.cssSelector(".text-center.font-medium.focus-within\\:ring-4.focus-within\\:outline-none.inline-flex.items-center.justify-center.px-5.py-2.5.text-sm.text-white.bg-primary-700.hover\\:bg-primary-800.dark\\:bg-primary-600.dark\\:hover\\:bg-primary-700.focus-within\\:ring-primary-300.dark\\:focus-within\\:ring-primary-800.rounded-lg.w-full"));
        driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public void signAs() {
        driver.findElement(loginObject.getButtonLogin()).click();
    }
    public String getURL() {
        return driver.getCurrentUrl();
    }


}
