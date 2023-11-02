Feature: Hotel Booking In Adactin Application
@smokeTest
Scenario: User Login In The Web Application
Given user Launch The Url In Adactin Application
When user Enter The Username In User Field 
And user Enter The Password In Paaword Field
Then user Click The Login Button And It Navigates To Search Hotel Page

@smokeTest
Scenario: User Select The Hotel Type
When User Select The Location
And user Select The Hotels
And user Select The Room Type
And user Select The Number Of Rooms
And user Enter The Check In Date
And user Enter The Check Out Date
And user Select The Adults Per Room
And user Select The Children Per Room 
Then user Click The Search Button And It Navigates To Next Page

@sanityTest
Scenario: User Select The Hotel 
When user Select The Hotel Name
Then user Click The Continue Button And And It Navigates To Next Page


Scenario: User Book A Hotel
When user Enter The First Name In First Name Field
And user Enter The Last Name In Last Name Field
And user Enter The Billing Address In Billing Address Field
And user Enter The Credit Card No In Credit Card No Field
And user Select The Credit Card Type In Credit Card Field
And user Select The Expiry Date In Month And Year
And user Enter The Cvv Number In Cvv Number Field
Then User Click The Book Now And It Navigates To Next Page