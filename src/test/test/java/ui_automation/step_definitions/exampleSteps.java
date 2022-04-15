package ui_automation.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import ui_automation.pages.ExamplePage;
import ui_automation.utilities.*;
public class exampleSteps {
    ExamplePage examplepage = new ExamplePage();
    GridHelper gridHelper = new GridHelper();
    @Given("I'm on logged in to Example webApp as admin")
    public void i_m_on_logged_in_to_examplepage_as_admin() {
        //Go to URL
        Driver.getInstance().getDriver().get(ConfigurationReader.getProperty("ui-config.properties","exapmleWebapp.url"));
        examplepage.userNameInput.sendKeys(ConfigurationReader.getProperty("ui-config.properties","exapmleWebapp.username"));
        examplepage.passwordInput.sendKeys(ConfigurationReader.getProperty("ui-config.properties","exapmleWebapp.password"));
        examplepage.loginBtn.click();
    }
    @Given("I click on the Employee List")
    public void i_click_on_the_Employee_List() {
        Helper.hover(examplepage.pImTab);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        examplepage.employeeTab.click();
    }
    @Then("I see employee list table")
    public void iSeeEmployeeListTable() {
        Assert.assertTrue(examplepage.employeeTable.isDisplayed());
    }
}
