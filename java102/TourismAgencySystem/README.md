# TourismAgencySystem

This repo is the last assignment of the Intermediate Java Backend Path at www.patika.dev. Homework definition and project features are written below in detail.

Technologies used in the project: 
**Java
Swing
JDBC
PostgreSQL**

>In this project, 2 types of users are defined.
Admin: It has the authority to add a hotel, add a room to a hotel and a room pricing.
Operator: It has the powers of Searching Hotel, Adding New Reservation and Listing.

## Sign In screen. 
New operators can register from this screen.

<img width="595" alt="Screenshot 2022-12-27 at 14 01 31" src="https://user-images.githubusercontent.com/46796424/209663124-07f24a63-5531-4c38-a033-f6641bf3a528.png">


## Login In Screen
<img width="450" alt="Screenshot 2022-12-27 at 14 02 12" src="https://user-images.githubusercontent.com/46796424/209663193-197b93b8-8e76-44c6-834d-bc73c9720a9f.png">

## Hotel List Screen
Only admin user can access this screen.

<img width="1053" alt="Screenshot 2022-12-27 at 14 03 05" src="https://user-images.githubusercontent.com/46796424/209663336-b9c37ee3-36b0-4c50-9f73-bfe013ee8688.png">

## Hotel Room Add Screen
<img width="746" alt="Screenshot 2022-12-27 at 14 03 56" src="https://user-images.githubusercontent.com/46796424/209663347-67e798a9-8169-4d7e-b18b-751c0af35d13.png">

## Room Pricing Screen
<img width="746" alt="Screenshot 2022-12-27 at 14 04 15" src="https://user-images.githubusercontent.com/46796424/209663365-e2023487-98cd-4e93-90e1-e2acb329edc4.png">

## New Hotel Add Screen
<img width="700" alt="Screenshot 2022-12-27 at 14 08 27" src="https://user-images.githubusercontent.com/46796424/209663376-da46dd8b-e286-4636-84fd-8bcc70401343.png">

## Reservation List
Operator userscan access this screen.

<img width="994" alt="Screenshot 2022-12-27 at 14 08 58" src="https://user-images.githubusercontent.com/46796424/209663426-75e799d9-eaaf-492f-86dd-d2c462341c86.png">

## Search Screen
From here, you can find out if there is a hotel with suitable rooms according to the date you want and the number of guests.
The "-" sign is automatically placed in the date input field.

<img width="698" alt="Screenshot 2022-12-27 at 14 10 30" src="https://user-images.githubusercontent.com/46796424/209663560-b734f730-8f49-47be-8e57-26f286e6c472.png">

## Searching Result Screen
<img width="1089" alt="Screenshot 2022-12-27 at 14 10 49" src="https://user-images.githubusercontent.com/46796424/209663585-863b513b-63e7-4767-b5a5-a89b931e9edb.png">

## Make New Rezervation
<img width="998" alt="Screenshot 2022-12-27 at 14 13 01" src="https://user-images.githubusercontent.com/46796424/209663608-3029b6fe-1bde-499d-9a9a-3c5747b89403.png">

# Return the Rezervation Lists
<img width="998" alt="Screenshot 2022-12-27 at 14 14 57" src="https://user-images.githubusercontent.com/46796424/209663621-123ccc39-c870-4f31-b1f8-ff962b8e435f.png">




## Homework Defination

Tourism Agency System
Patika Tourism Agency needs a structure in which it can run its business digitally. Assume that you have agreed with Patika for this digital infrastructure.

The working logic of Patika Tourism Agency is as follows: Hotels reserve certain rooms with Patika Tourism Agency and expect the agency to sell these rooms. When selling these rooms, the agency sells it to its customers by putting its own service fee as a percentage or a fixed price.

The agency thinks that doing these works on paper and manually is a waste of time, and needs a software that will make their job easier.

Expectation of the agency from the software:

Hotel management
The agency should manage the hotels it has contracted with, together with their location information and other features, from the system. While adding a hotel, other definitions such as Hotel Name, Address, E-mail, Telephone, Star, Facility Features, Hostel types are made.

Hostel Types expected to be in the system:
Ultra All Inclusive
All inclusive
Room breakfast
Full pension
Half board
Bed Only
Full credit without alcohol
Facility Features expected to be in the system:
Free Parking
Free WiFi
Swimming pool
Fitness Center
Hotel Concierge
SPA
24/7 Room Service
Sample Hotel Data;


Term Management
Historical periods of the hotels are added and pricing is made over these periods. The aim here is to offer a variable pricing. While hotel prices are higher in summer, this is less in winter. Pricing is made periodically in the tourism sector. Periods are defined as two date ranges.

Example Periods:

01/01/2021 - 31/05/2021
01/06/2021 - 01/12/2021
Room Management
The agency adds the rooms reserved from the hotels to the system and provides pricing on these rooms. Generally Single, Double, Suit etc. in hotels. There are certain room types, such as . It should also be entered in the properties of the rooms.

Room Features expected to be in the system:
Other information other than the number of beds is optional.

Number of Beds
Television (Yes, No)
Minibar (Yes, No)
Game Console (Yes, No)
Square meters
Till
Projection
Sample Room Data;


Room Pricing
Rooms are calculated as per night rate. The prices are defined according to the hostel and adult child types over the periods added for the hotel.

Pricing expected in the system:
Prices are defined according to the nightly rates of the rooms. These prices include the agency's commission fee.

Room Search and Reservation Procedures
The agency employee should be able to search for a room according to the date range, Region or Hotels and guest information entered through the system.

Room Search Algorithm
After the agency enters the required room search information, it can list the rooms defined in the system.

For rooms to appear in the list:

The hotel of the room must be in the desired region.
According to the desired date range, the hotel should have period information. For example, for a search with Check-in Date: 09/06/2021 , Check-out Date: 12/06/2021, hotels must have a period in that date range.
If there is a period for the hotel, the room should also have price information according to the hostel types in the relevant periods so that price information can be given to the customer.
The stock number of the room must be greater than 0.
Example Search Data
Region : Beyoglu
Entry Date: 01/04/2021
Release Date: 03/04/2021
Guest Information: 2 Adults, 1 Child
Price Calculation
Prices are calculated based on the guest information, the number of nights to stay and the hostel.

According to this information

First, the hotels in the region are found.
There are rooms with stock belonging to the hotel found.
If the rooms have period price information in the relevant date range, the price calculation is made.

Reservation Process
The agency user completes the reservation by selecting the appropriate hostel type from the room types of the hotels he has listed.

To complete the reservation:

Customer contact information
Guest Name Surname and T.C. ID information
and completes the sale through the system. If the sale is completed, the stock of the relevant room will be reduced by 1.

Reservation List
Agency employees can list the reservations made on the system.

