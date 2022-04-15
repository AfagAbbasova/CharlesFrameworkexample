package ui_automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui_automation.utilities.Driver;

import java.util.List;

public class ExamplePage {
    WebDriver driver;
    public ExamplePage(){
        driver= Driver.getInstance().getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "txtUsername")
    public WebElement userNameInput;

    @FindBy(id = "txtPasswordza")
    public WebElement passwordInput;

    @FindBy(id = "btnzaxogin")
    public WebElement loginBtn;

    @FindBy(id = "menu_pim_viewPzaimModule")
    public WebElement pImTab;

    @FindBy(id = "menu_pim_viewazEmployeeList")
    public WebElement employeeTab;

    @FindBy(xpath = "//table[@id='resultTable']/aztbody/tr")
    public List<WebElement> employeeRecords;

    @FindBy(id="resultTable")
    public WebElement employeeTable;
}
