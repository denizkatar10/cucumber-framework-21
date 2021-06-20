package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.hu.De;
import pages.DefaultPage;
import pages.RoomReservationPage;

public class Room_Reservation_Step_Defs {
    DefaultPage defaultPage=new DefaultPage();
    RoomReservationPage roomReservationPage=new RoomReservationPage();
    @Given("user navigates to create_room_reservation_page")
    public void user_navigates_to_create_room_reservation_page() {
//    =======click on hotelmanagement, room reservation, addroom reservation
        defaultPage.hotelManagement.click();
        defaultPage.roomReservations.click();
        roomReservationPage.addRoomReservationButton.click();
    }
    @Given("user enters the IDUser")
    public void user_enters_the_id_user() {

    }
    @Given("user enters the IDHotel")
    public void user_enters_the_id_hotel() {

    }
    @Given("user enters the price")
    public void user_enters_the_price() {

    }
    @Given("user enters the date_start")
    public void user_enters_the_date_start() {

    }
    @Given("user enters the date_end")
    public void user_enters_the_date_end() {

    }
    @Given("user enters the adult_amount")
    public void user_enters_the_adult_amount() {

    }
    @Given("user enters the children_amount")
    public void user_enters_the_children_amount() {

    }
    @Given("user enters the contact_name")
    public void user_enters_the_contact_name() {

    }
    @Given("user enters the contact_phone")
    public void user_enters_the_contact_phone() {

    }
    @Given("user enters the contact_email")
    public void user_enters_the_contact_email() {

    }
    @Given("user enters the notes")
    public void user_enters_the_notes() {

    }
    @Given("user clicks on the approved checkbox")
    public void user_clicks_on_the_approved_checkbox() {

    }
    @Given("user clicks on the is_paid checkbox")
    public void user_clicks_on_the_is_paid_checkbox() {

    }
    @Given("user clicks on the save_button")
    public void user_clicks_on_the_save_button() {

    }
    @Then("user verifies the success_message")
    public void user_verifies_the_success_message() {

    }
}