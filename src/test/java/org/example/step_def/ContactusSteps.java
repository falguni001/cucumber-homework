package org.example.step_def;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.driver.DriverManager;
import org.example.pages.ContactusPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.StringContains.containsString;

public class ContactusSteps extends DriverManager {
    DriverManager driverManager = new DriverManager();
    ContactusPage contactusPage = new ContactusPage();

        @When("^I click on the contactus on footer$")
        public void i_click_on_the_contactus_on_footer() throws Throwable {
            contactusPage.clickOncontactusbutton();
            }


        @Then("^I should see \"([^\"]*)\" text on contactus\"  page$")
        public void i_should_see_text_on_contactus_page(String expUrl) throws Throwable {

            String actualUrl = driverManager.getTitle();
            System.out.println(actualUrl);
            assertThat(actualUrl,is(endsWith("nopCommerce demo store. Contact Us")));

            String contactusText= contactusPage.contactusText();
            System.out.println(contactusText);
            assertThat(contactusText,is(equalToIgnoringCase("contact us")));
        }

    @When("^I enter name \"([^\"]*)\",Email \"([^\"]*)\"and Enquiry\"([^\"]*)\"$")
    public void i_enter_name_Email_and_Enquiry(String Name, String Email, String Enquiry) throws Throwable {
         contactusPage.enterNameEmailandEnquiry(Name, Email, Enquiry);

    }

    @When("^i click on submit on contact us page$")
    public void i_click_on_submit_on_contact_us_page() throws Throwable {
       contactusPage.clickonsubmitbtn();}

        @Then("^I should see \"([^\"]*)\"message$")
        public void i_should_see_message(String arg1) throws Throwable {
             contactusPage.getsubmitbtnText();
        String getsubmitbtnText =contactusPage.getsubmitbtnText();
                    contactusPage.contactusText();
           System.out.println(getsubmitbtnText);
            assertThat(getsubmitbtnText,is(equalToIgnoringCase("Your enquiry has been successfully sent to the store owner.")));

        }


    }


