package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static support.TestContext.getDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class MyStepdefs {
    @Given("I navigate to {string}")

    @Then("I see {string} button")
    public void iSeeButton(String btnName) {
        getDriver().findElement(By.xpath("//button[contains(text(),'"+btnName+"')]")).isDisplayed();
    }

    @And("I wait for {int} seconds")
    public void iWaitForSeconds(int sec) throws InterruptedException {
        Thread.sleep(sec*1000);
    }

    @Given("I navigate to the web")
    public void iNavigateToTheWeb() {
        getDriver().get("https://automationintesting.online/");
    }

    @And("I click {string} button")
    public void iClickButton(String btn) {
        if (getDriver().findElement(By.xpath("//button[contains(text(),'"+btn+"')]")).isDisplayed()){
            getDriver().findElement(By.xpath("//button[contains(text(),'"+btn+"')]")).click();
        }
        else {
            System.out.println("There is no such button");
        }
    }

    @Then("I put {string} the name field")
    public void iPutTheNameField(String name) {
        getDriver().findElement(By.xpath("//input[@id='name']")).sendKeys(name);
    }

    @And("I put {string} into the email field")
    public void iPutIntoTheEmailField(String email) {
        getDriver().findElement(By.xpath("//input[@id='email']")).sendKeys(email);
    }


    @And("I enter {string} into the phone field")
    public void iEnterIntoThePhoneField(String phone) {
        getDriver().findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
    }

    @And("I enter {string} into the subject field")
    public void iEnterIntoTheSubjectField(String subject) {
        getDriver().findElement(By.xpath("//input[@id='subject']")).sendKeys(subject);
    }

    @And("I enter {string} into the message field")
    public void iEnterIntoTheMessageField(String message) {
        getDriver().findElement(By.xpath("//textarea[@id='description']")).sendKeys(message);
    }

    @Then("{string} is displayed")
    public void isDisplayed(String text) {
        assertThat(getDriver().findElement(By.xpath("//div/../..//p[contains(text(),'"+text+"')]")).isDisplayed()).isTrue();
    }

    @And("I enter {string} into the first name field")
    public void iEnterIntoTheFirstNameField(String firstName) {
        getDriver().findElement(By.xpath("//input[@placeholder='Firstname']")).sendKeys(firstName);
    }

    @Then("I enter {string} into the last name field")
    public void iEnterIntoTheLastNameField(String lastName) {
        getDriver().findElement(By.xpath("//input[@placeholder='Lastname']")).sendKeys(lastName);
    }

    @And("I enter {string} into the email field")
    public void iEnterIntoTheEmailField(String myEmail) {
        getDriver().findElement(By.xpath("//input[@placeholder='Email']")).sendKeys(myEmail);
    }

    @And("I enter {string} into phone field")
    public void iEnterIntoPhoneField(String myPhone) {
        getDriver().findElement(By.xpath("//input[@placeholder='Phone']")).sendKeys(myPhone);
    }

    @Then("I check the info")
    public void iCheckTheInfo() {
        try {
            getDriver().findElement(By.xpath("//div/../..//p[contains(text(),'Booking successful')]")).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            boolean b = false;
        }
        System.out.println("We found the bug!");
    }

    @And("I scroll down")
    public void iScrollDown() {
        getDriver().findElement(By.xpath("//input[@id='name']"));
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,1000)");
    }
}
