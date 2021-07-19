package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AllocateSeatsStepDefintions {

    @Given("a train with the following configuration:")
    public void a_train_with_the_following_configuration(io.cucumber.datatable.DataTable dataTable) {
        System.out.println("a train with the following configuration:");
    }


    @When("a booking  for {int} seats is made")
    public void a_booking_for_seats_is_made(Integer int1) {
        System.out.println("a booking  for {int} seats is made");
    }

    @When("a booking for {int} seat is made")
    public void a_booking_for_seat_is_made(Integer int1) {
        System.out.println("a booking for {int} seat is made");
    }
    @Then("the seats should be allocated in Carriage B")
    public void the_seats_should_be_allocated_in_carriage_b() {
        System.out.println("the seats should be allocated in Carriage B");
    }

    @Then("the seats should be allocated in Carriage A")
    public void the_seats_should_be_allocated_in_carriage_a() {
        System.out.println("the seats should be allocated in Carriage A");
    }

    @When("user book {int} seats")
    public void user_book_seats(Integer int1) {
        System.out.println("user book {int} seats");
    }

    @When("user try to book {int} seats")
    public void user_try_to_book_seats(Integer int1) {

    }

    @Then("system should not do the booking")
    public void system_should_not_do_the_booking() {
        Assert.assertTrue(false);
    }

}
