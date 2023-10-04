# Travel Game #
The purpose of this project is to create a game by using JavaFX framework. This game aims to transfer all passengers from a starting city to the desired city with the highest score.
The game board consists of 10x10 cells. Each cell identified by a cell ID starts with 1 and increases row
based ascending order. For transferring the passengers, user will select vehicle destination city with
mouse and click DRIVE button to move vehicle to the destination city.  

### Implementation Details ###
* There are several levels; the user will not be able to play a next level without completing a
  previous one.
* Each level is created based on an input file that is located in the “levels” folder.
* Images for cities are randomly assigned.
* The program draws a drive path between the city where the vehicle is located and the city selected by the user.

<p align="center">
  <img src="https://github.com/basakakyuz/travel-game/blob/main/repo/game1.jpg" width="450"/>
  <img src="https://github.com/basakakyuz/travel-game/blob/main/repo/animation.gif" width="450"/>
</p>  

* The drive path is created using empty/unused cells. Fixed cells cannot be used for
   the drive path and the vehicle cannot pass over it.
* PLAY button starts the game from the beginning. CONTINUE button shows all the unlocked and locked levels and enables the player choose between any unlocked levels
or to continue the game where they left. In order to provide a continue option, the last unlocked level's number is saved automatically in `level-save.txt`. 

### Level Input File ###
Input file contains the object name and related attributes, each separated by commas.  
- City type object `<City>,<city_name>,<cell_id>,<city_id>`  
- Passenger type object `<Passenger>,<number_of_passengers>,< starting_city_id >,<destination_city_id>`  
- Vehicle type object `<Vehicle>,<current_city_id>,<passenger_capacity>`  
- Fixed Cell type object `<Fixed>,<cell_id>`  

__Ex:__  
- City,Istanbul,14,1  
  Object type: City  
  City Name: Istanbul  
  Location cell id on game board: 14  
  City id: 1

- Passenger,10,3,1  
  Object type: Passenger  
  Number of passengers: 10  
  Starting city id: 3 (Name of city id 3 is Mersin)  
  Destination city id: 1 (Name of city id 1 is Istanbul)  
  So in Mersin there are 10 passengers waiting for move to the Istanbul.

- Vehicle,1,10  
  Object type: Vehicle  
  Current city id: 1 (Name of city id 1 is Istanbul)  
  Passenger capacity: 10 (vehicle seat capacity)

- Fixed,63  
  Cell id 63 cell is defined fixed cell.

### Score Calculation ###
At the end of every move between cities, there is a cost and an income. Cost value is the distance between two cities. 
Income value is calculated using the transferred number of passengers and distance value.  

  Cost = Distance  
  Income = (Number of passengers transferred) * (Distance * 0.2)  
  Move score = Income – Cost  

For example, transferring 10 passengers from Istanbul to Mersin is calculated as follows:
- Istanbul cell id is 14 so Istanbul position on game board is in the 2nd row and 4th column.
- Mersin cell id is 62 so Mersin position on game board is 7th row and 2nd column.
- The distance between two points, first point is (2, 4) and second is (7, 2), is 5.39 based on Euclidean distance and you can calculate the distance as 6 by taking the ceiling of that value.
- The Income value is 12 (10 * 6 * 0.2) based on the given formula above. 
- So, move score from Istanbul to Mersin for this case is 6 (12 – 6). 

### Game Screenshots ###
- Menu
<p align="center">
  <img src="https://github.com/basakakyuz/travel-game/blob/main/repo/menu.jpg" width="450"/>
</p>  

- Level Menu
<p align="center">
  <img src="https://github.com/basakakyuz/travel-game/blob/main/repo/continue.jpg" width="450"/>
</p>  

- High Scores
<p align="center">
  <img src="https://github.com/basakakyuz/travel-game/blob/main/repo/high-scores.jpg" width="450"/>
</p>  

- Level
<p align="center">
  <img src="https://github.com/basakakyuz/travel-game/blob/main/repo/game3.jpg" width="450"/>
</p>

### Running ###
[JDK 17](https://www.oracle.com/tr/java/technologies/downloads/#java17) and [JavaFX](https://openjfx.io/openjfx-docs/#introduction) is needed to run this project. 
