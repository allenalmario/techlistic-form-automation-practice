import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class formPractice {
    public static void main(String[] args) {

        // Establish a chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //maximize window
        driver.manage().window().maximize();

        // go to following URL
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //find the first name input in the form
        WebElement firstNameInput = driver.findElement(By.name("firstname"));

        //send text to first name input
        firstNameInput.sendKeys("Eren");

        WebElement lastNameInput = driver.findElement(By.name("lastname"));

        lastNameInput.sendKeys("Jaegar");

        // find the male radio input
        WebElement maleRadioInput = driver.findElement(By.id("sex-0"));

        //click on male radio input
        maleRadioInput.click();

        //find 1 year experience radio button
        WebElement oneYearExpRadioInput = driver.findElement(By.id("exp-0"));

        //click on 1 year experience radio button
        oneYearExpRadioInput.click();

        //find date input field
        WebElement dateInput = driver.findElement(By.id("datepicker"));

        // gets current date in mm/dd/yyyy format
        LocalDate dateObj = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String date = dateObj.format(formatter);

        //send text to date input field
        dateInput.sendKeys(date);

        //find profession radio button; automation
        WebElement professionRadioButton = driver.findElement(By.id("profession-1"));

        //click on automation tester radion button
        professionRadioButton.click();

        //find automation tool radio button
        WebElement seleniumRadioButton = driver.findElement(By.id("tool-2"));

        //click on selenium radio button
        seleniumRadioButton.click();

        // find select country
        Select drpCountry = new Select(driver.findElement(By.id("continents")));

        // select country
        drpCountry.selectByIndex(5);

        //find selenium commands element
        Select seleniumCommands = new Select(driver.findElement(By.id("selenium_commands")));

        // select option
        seleniumCommands.selectByIndex(4);

        //find submit button
        WebElement submitButton = driver.findElement(By.id("submit"));

        //click on submit buttonm
        submitButton.click();

        // close browser when script is finished
        driver.close();
    }
}
