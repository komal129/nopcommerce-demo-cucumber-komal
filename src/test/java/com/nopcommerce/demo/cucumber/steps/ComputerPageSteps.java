package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("^I click on Computer tab$")
    public void iClickOnComputerTab() {
        new HomePage().clickOnMenuTab("Computers");
    }

    @Then("^I should navigate to computer page successfully$")
    public void iShouldNavigateToComputerPageSuccessfully() {
        org.junit.Assert.assertEquals("Text is not displayed","Computers",new ComputerPage().getPageTitleText());
    }

    @And("^I click on Desktops link$")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnSubMenu("Desktops");
    }

    @Then("^I should navigate to Desktops page successfully$")
    public void iShouldNavigateToDesktopsPageSuccessfully() {
        org.junit.Assert.assertEquals("Text is not displayed","Desktops",new ComputerPage().getPageTitleText());
    }

    @And("^I click on product name Build your own computer$")
    public void iClickOnProductNameBuildYourOwnComputer() {
        new DesktopsPage().selectProduct("Build your own computer");
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor)  {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("^I select ram \"([^\"]*)\"$")
    public void iSelectRam(String ram)  {
        new BuildYourOwnComputerPage().selectRam(ram);
    }

    @And("^I select hdd \"([^\"]*)\"$")
    public void iSelectHdd(String hdd)  {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os)  {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("^I select Software \"([^\"]*)\"$")
    public void iSelectSoftware(String software)  {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerPage().clickOnAddToCartButton();
    }

    @Then("^I should see product has been added to your shopping cart confirmation message$")
    public void iShouldSeeProductHasBeenAddedToYourShoppingCartConfirmationMessage() {
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals("The cart is empty",expectedMessage,new BuildYourOwnComputerPage().getProductAddedMessage());
    }
}
