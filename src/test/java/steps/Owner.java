package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Owner {
    WebDriver driver = null;
    @Given("Open browser Chrome")
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aji\\IdeaProjects\\QAE-Technical-Test-Mamikos\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @And("Open Website Mamikos")
    public void openWebsiteMamikos() {
        driver.get("https://mamikos.com/");
        driver.manage().window().maximize();
    }

    @And("User doing Login")
    public void userDoLogin() {
        driver.findElement(By.xpath("//button[@class='nav-login-button']")).click();
    }

    @And("User choose Owner")
    public void userChooseOwner() {
        driver.findElement(By.xpath("//img[@alt='login-owner']")).click();
    }

    @And("Owner located on Login Pages")
    public void ownerLocatedOnLoginPages() throws InterruptedException {
        driver.findElement(By.xpath("//div[@class='login-modal__container auth-step-card auth-step-card--stretched']")).isDisplayed();
        Thread.sleep(1000);
    }

    @When("Owner Enter Phone Number {string}")
    public void ownerEnterPhoneNumber(String PhonenumberValue) {
        driver.findElement(By.xpath("//input[@name='Nomor Handphone']")).sendKeys(PhonenumberValue);
    }

    @When("Owner Enter Password {string}")
    public void ownerEnterPassword(String PasswordValue) throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(PasswordValue);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-mamigreen login-button track-login-owner']")).click();
        Thread.sleep(10000);
    }

    @And("Owner located on Home Pages Owner Mamikos")
    public void ownerLocatedOnHomePagesOwnerMamikos() {
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/aside/div/div[2]/div[1]/p")).isDisplayed();
    }

    @And("Owner Owner open menu My Property")
    public void ownerOwnerOpenMenuMyProperty() {
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/aside/div/div[2]/div[1]/p")).click();
    }

    @And("Owner choose Kost")
    public void ownerChooseKost() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[1]/aside/div/div[2]/div[2]/div[1]/p")).click();
        Thread.sleep(5000);
    }

    @And("Owner add Kost")
    public void ownerAddKost() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"ownerModalAdd\"]/div/div/div[3]/div/form/button[1]")).click();
        Thread.sleep(2000);
    }

    @When("Owner Enter Name Kost {string}")
    public void ownerEnterNameKost(String arg0) {
        driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/div/div/div[1]/div")).click();
    }

    @When("Owner Enter Type Kost")
    public void ownerEnterTypeKost() {
    }

    @When("Owner Enter Gender of Kost")
    public void ownerEnterGenderOfKost() {
    }

    @When("Owner Enter Description Kost {string}")
    public void ownerEnterDescriptionKost(String arg0) {
    }

    @When("Owner Enter Term&Condition Kost")
    public void ownerEnterTermConditionKost() {
    }

    @When("Owner Enter When this Kost built?")
    public void ownerEnterWhenThisKostBuilt() {
    }

    @Then("Owner do Next Steps Question Group")
    public void ownerDoNextStepsQuestionGroup() {
    }

    @Then("Owner located on Address Pages")
    public void ownerLocatedOnAddressPages() {
    }

    @When("Owner Enter Address Location Maps")
    public void ownerEnterAddressLocationMaps() {
    }

    @When("Owner Enter Provinsi")
    public void ownerEnterProvinsi() {
    }

    @When("Owner Enter Kabupaten\\/Kota")
    public void ownerEnterKabupatenKota() {
    }

    @When("Owner Enter Kecamatan")
    public void ownerEnterKecamatan() {
    }

    @When("Owner Enter Noteds Address Detail")
    public void ownerEnterNotedsAddressDetail() {
    }

    @Then("Owner located on Photo Kost")
    public void ownerLocatedOnPhotoKost() {
    }

    @When("Owner Enter Photo Kost Tampak Depan")
    public void ownerEnterPhotoKostTampakDepan() {
    }

    @When("Owner Enter Photo Kost Tampak Belakang")
    public void ownerEnterPhotoKostTampakBelakang() {
    }

    @When("Owner Enter Photo Kost from Road")
    public void ownerEnterPhotoKostFromRoad() {
    }

    @Then("Owner located on Photo Room Kost")
    public void ownerLocatedOnPhotoRoomKost() {
    }

    @When("Owner Enter Photo Room Kost Tampak Depan")
    public void ownerEnterPhotoRoomKostTampakDepan() {
    }

    @When("Owner Enter Photo Room Kost Tampak Dalam")
    public void ownerEnterPhotoRoomKostTampakDalam() {
    }

    @When("Owner Enter Photo Room Kost Bathroom")
    public void ownerEnterPhotoRoomKostBathroom() {
    }

    @Then("Owner located on Facility Kost")
    public void ownerLocatedOnFacilityKost() {
    }

    @When("Owner Enter Public Facilities")
    public void ownerEnterPublicFacilities() {
    }

    @When("Owner Enter Room Facilities")
    public void ownerEnterRoomFacilities() {
    }

    @When("Owner Enter Bathroom Facilities")
    public void ownerEnterBathroomFacilities() {
    }

    @Then("Owner located on Availability of Kost rooms")
    public void ownerLocatedOnAvailabilityOfKostRooms() {
    }

    @When("Owner Enter Size the Kost")
    public void ownerEnterSizeTheKost() {
    }

    @When("Owner Enter Total Number Kost Room? {string}")
    public void ownerEnterTotalNumberKostRoom(String arg0) {
    }

    @When("Owner Enter How many room Kost? {string}")
    public void ownerEnterHowManyRoomKost(String arg0) {
    }

    @Then("Owner located on Price Kost")
    public void ownerLocatedOnPriceKost() {
    }

    @When("Owner Enter Price the Kost {string}")
    public void ownerEnterPriceTheKost(String arg0) {
    }

    @Then("Owner Save The Kost")
    public void ownerSaveTheKost() {
    }
}
