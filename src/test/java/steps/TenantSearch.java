package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TenantSearch {
    WebDriver driver = null;
    @Given("Open browser")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aji\\IdeaProjects\\QAE-Technical-Test-Mamikos\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open website Mamikos")
    public void openWebsiteMamikos() {
        driver.get("https://mamikos.com/");
        driver.manage().window().maximize();
    }

    @And("User do Login")
    public void userDoLogin() {
        driver.findElement(By.xpath("//button[@class='nav-login-button']")).click();
    }

    @And("User choose Tenant")
    public void userChooseTenant() {
        driver.findElement(By.xpath("//img[@alt='login-tenant']")).click();
    }

    @And("Tenant located on Login Pages")
    public void tenantLocatedOnLoginPages() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='login-modal__container auth-step-card auth-step-card--stretched']")).isDisplayed();
        Thread.sleep(1000);
    }

    @When("Tenant Enter Phone Number {string}")
    public void tenantEnterPhoneNumber(String PhonenumberValue) {
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(PhonenumberValue);
    }

    @When("Tenant Enter Password {string}")
    public void tenantEnterPassword(String PasswordValue) {
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PasswordValue);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-mamigreen login-button track-login-tenant']")).click();
    }

    @And("Tenant located on Home Pages Mamikos")
    public void tenantLocatedOnHomePagesMamikos() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='btn-cta-span']")).isDisplayed();
        Thread.sleep(2000);
    }

    @When("Tenant do Search")
    public void tenantDoSearch() {
        driver.findElement(By.xpath("//div[@class='btn-cta-label']")).click();
    }

    @When("Tenant Enter Search Tobelo Area {string}")
    public void tenantEnterSearchTobeloArea(String SearchValue) throws InterruptedException {
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys(SearchValue);
        Thread.sleep(1000);
    }

    @And("Tenant located on Page Kost Tobelo")
    public void tenantLocatedOnPageKostTobelo() throws InterruptedException {
        driver.get("https://mamikos.com/room/kost-halmahera-utara-kost-putra-eksklusif-kost-automation-putra-tobelo");
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,300)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn-next btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn-next btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn-next btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn-next btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn-next btn-primary']")).click();
        driver.findElement(By.xpath("//button[@class='btn-primary swiper-button-disabled']")).click();
        Thread.sleep(1000);

//        WebElement element = driver.findElement(By.xpath("//div[@class='results-header']"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",element);

        //driver.findElement(By.xpath("//label[@title='Kost Automation Putra Tobelo']")).click();
    }

    @When("Tenant Enter Favorite the Kost Tobelo")
    public void tenantEnterFavoriteTheKostTobelo() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='ng-binding']")).click();
        //driver.findElement(By.xpath("//*[@id=\"detailKostOverviewFavShare\"]/div[1]/button/svg")).click();
        //driver.findElement(By.xpath("//div[@class='detail-kost-overview-widget__favorite-button']")).click();
    }

    @When("Tenant Enter Unfavorite the Kost Tobelo")
    public void tenantEnterUnfavoriteTheKostTobelo() {
    }
}
