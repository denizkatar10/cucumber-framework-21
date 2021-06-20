package stepdefinitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DefaultPage;
import pages.RoomReservationPage;
import utilities.ReusableMethods;
public class Room_Reservation_Step_Defs {
    DefaultPage defaultPage=new DefaultPage();
    RoomReservationPage roomReservationPage=new RoomReservationPage();
    Faker faker=new Faker();
    @Given("user navigates to create_room_reservation_page")
    public void user_navigates_to_create_room_reservation_page() {
//    =======click on hotelmanagement, room reservation, addroom reservation
        defaultPage.hotelManagement.click();
        defaultPage.roomReservations.click();
        roomReservationPage.addRoomReservationButton.click();
    }
    @Given("user enters the IDUser")
    public void user_enters_the_id_user() {
        Select select = new Select(roomReservationPage.idUser);
        select.selectByIndex(2);
    }
    @Given("user enters the IDHotel")
    public void user_enters_the_id_hotel() {
        Select select=new Select(roomReservationPage.idHotelRoom);
        select.selectByIndex(3);
    }
    @Given("user enters the price")
    public void user_enters_the_price() {
        roomReservationPage.price.sendKeys("1000");
    }
    @Given("user enters the date_start")
    public void user_enters_the_date_start() {
        roomReservationPage.dateStart.sendKeys("07/01/2021");
    }
    @Given("user enters the date_end")
    public void user_enters_the_date_end() {
        roomReservationPage.dateEnd.sendKeys("07/05/2021");
    }
    @Given("user enters the adult_amount")
    public void user_enters_the_adult_amount() {
        roomReservationPage.adultAmount.sendKeys("2");
    }
    @Given("user enters the children_amount")
    public void user_enters_the_children_amount() {
        roomReservationPage.childrenAmount.sendKeys("3");
    }
    @Given("user enters the contact_name")
    public void user_enters_the_contact_name() {
        roomReservationPage.nameAndSurname.sendKeys(faker.name().firstName());
    }
    @Given("user enters the contact_phone")
    public void user_enters_the_contact_phone() {
        roomReservationPage.contactPhone.sendKeys(faker.phoneNumber().phoneNumber());
    }
    @Given("user enters the contact_email")
    public void user_enters_the_contact_email() {
        roomReservationPage.contactEmail.sendKeys(faker.internet().emailAddress());
    }
    @Given("user enters the notes")
    public void user_enters_the_notes() {
        roomReservationPage.notes.sendKeys("Test Notes");
    }
    @Given("user clicks on the approved checkbox")
    public void user_clicks_on_the_approved_checkbox() {
        roomReservationPage.approved.click();
    }
    @Given("user clicks on the is_paid checkbox")
    public void user_clicks_on_the_is_paid_checkbox() {
        roomReservationPage.isPaid.click();
    }
    @Given("user clicks on the save_button")
    public void user_clicks_on_the_save_button() {
        roomReservationPage.saveButton.click();
    }
    @Then("user verifies the success_message")
    public void user_verifies_the_success_message() {
        ReusableMethods.waitForVisibility(roomReservationPage.actualSuccessMessage,3);
        Assert.assertTrue(roomReservationPage.actualSuccessMessage.isDisplayed());
    }
}