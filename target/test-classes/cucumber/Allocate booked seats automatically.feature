Feature: Automatically Allocate Seat

  Customers who buy tickets in advance should be given the opportunity to also book their seats in advance.
  Seats will be allocated automatically

  Business Rules:
  -Ideally, do not book more than 70% of the seats in carriage

  -Don't book more than 70% of the available seats on the train

  -Don't split bookings across carriages

  @smoke
  Scenario: All carriages will have less than 70% allocation
    Given a train with the following configuration:
      | carriage    |  A  | B  |
      |Total Seats  |  10 | 10 |
      |Booking Seats|  4  | 0  |
    When a booking  for 2 seats is made
    Then the seats should be allocated in Carriage A

  Scenario: One carriage will have more than 70% allocation
    Given a train with the following configuration:
      | carriage    |  A  | B  |
      |Total Seats  |  10 | 10 |
      |Booking Seats|  7  | 0  |
    When a booking for 1 seat is made
    Then the seats should be allocated in Carriage B


  Scenario: All carriages will have more than 70% allocation, train allocation below 70%
    Given a train with the following configuration:
      | carriage    |  A  | B  |
      |Total Seats  |  10 | 10 |
      |Booking Seats|  6  | 5  |
    When a booking  for 3 seats is made
    Then the seats should be allocated in Carriage A


  Scenario: The one where user can book more than 4 seats
    Given a train with the following configuration:
      | carriage    |  A  | B  |
      |Total Seats  |  10 | 10 |
      |Booking Seats|  6  | 5  |
    When user book 4 seats
    Then the seats should be allocated in Carriage A


    Scenario: The one where user is unable to book a seat
      Given a train with the following configuration:
        | carriage    |  A  | B  |
        |Total Seats  |  10 | 10 |
        |Booking Seats|  6  | 5  |
      When user try to book 6 seats
      Then system should not do the booking