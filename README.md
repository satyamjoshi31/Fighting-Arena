Understanding the game.

- There are two players
- Each player has attack, strength and health as a positive integer
- Both players take turn attacking each other (player with the lower health attacks first and then it goes on alternately)
- A dice is rolled by each player
- Attack power of the attacker is the product of his dice roll and his ATTACK value.
- Defense power of the defender is the product of his dice roll and his STRENGTH value.
- If the attack power is greater than the defense power then the health of the defender is reduced by the difference between attack power and defense power.
- If the attack power is lesser than or equal to the defense power then the health of the defender is unaffected.
- Both the players keep attacking alternately untill one of the player's health touches zero.



Understanding an example.

- Suppose there are two players 'A' and 'B'
- For 'A' health = 50, strength = 5, attack = 10
- For 'B' health = 100, strength = 10, attack = 5

- As the health of 'A' is lesser, he will attack first.
- Both players roll dice.
- Say, 'A' gets 4, 'B' gets 5
- Attack power of 'A' = 10*4 = 40, Defense power of 'B' = 10*5 = 50
- As the attack power is lesser than defense power, health will not be affected.
- Both players roll dice again.
- Say, 'A' gets 1, 'B' gets 6.
- As 'A' attacked first, now the attacker will be 'B'.
- Attack power of 'B' = 5*6 = 30, Defense power of 'A' = 5*1 = 5
- As the attack power is greater than defense power, health of 'A' will be reduced by 25(30-5).
- The health of 'A' will be 50-25 = 25
- Now 'A' will attack.
- This will continue untill one of the players loses all his health.
- If player 'A' loses all his health then 'B' wins and vice versa.


What does the java program do?

- As soon as the program is run, the user is asked to enter the name, health, strength and attack for each player.
- Health, strength and attack mandatorily need to be a positive integer.
- If inappropriate value is entered the program will display a message and ask to re-enter the appropriate value again.
- After the values are entered by the user, attributes of both the players will displayed and the user will be asked to enter 'r' to roll the dice or 'e' to exit the game.
- Any other value except these two won't be accepted. If entered an inappropriate value, a message will be displayed and user will be asked to enter the value again.
- After pressing 'r' round begins. The values of dice rolls of both the players are displayed first.
- Below it, the attack power and defense power is displayed for attacker and the defender respectively(As per the calculation of dice roll).
- Below it, the health of both the players is displayed.
- Then the user is asked to enter 'r' to roll the dice and start the next round.
- This goes on till one of the player wins the game which means, the other player loses all his health.
- The message of victory is displayed and the program is exited.


Sample output - 

Enter the name of player 1 : 
A //user input

Enter the health of player 1 : 
50 //user input

Enter the strength of player 1 : 
5 //user input

Enter the attack of player 1 : 
10 //user input

Enter the name of player 2 : 
B //user input

Enter the health of player 2 : 
100 //user input

Enter the strength of player 2 : 
10 //user input

Enter the attack of player 2 : 
5 //user input

// If a non positive integer value is entered for the integral attributes then a message is displayed and the user is asked to re-enter the correct value



Players have entered the Arena. Details of the players are -


Player 1 : A
Health : 50
Strength : 5
Attack : 10


Player 2 : B
Health : 100
Strength : 10
Attack : 5


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '1' Player 2 rolled '5'


Comparing their healths, Player 1 will attack first...




Player 1 attacks : 10
Player 2 defends : 50


Health of Player 1 : 50
Health of Player 2 : 100

--- Round 1 completed ---


Enter 'r' to roll the dice, 'e' to exit : g //user input

// if any value other than 'r' or 'e' is entered, message is displayed and the user is asked to re-enter the correct value


Invalid input. Please enter 'r' or 'e'.


Enter 'r' to roll the dice, 'e' to exit : 45 //user input
// if any value other than 'r' or 'e' is entered, message is displayed and the user is asked to re-enter the correct value


Invalid input. Please enter 'r' or 'e'.


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '6' Player 2 rolled '1'




Player 2 attacks : 5
Player 1 defends : 30


Health of Player 1 : 50
Health of Player 2 : 100

--- Round 2 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '3' Player 2 rolled '4'




Player 1 attacks : 30
Player 2 defends : 40


Health of Player 1 : 50
Health of Player 2 : 100

--- Round 3 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '3' Player 2 rolled '3'




Player 2 attacks : 15
Player 1 defends : 15


Health of Player 1 : 50
Health of Player 2 : 100

--- Round 4 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '1' Player 2 rolled '5'




Player 1 attacks : 10
Player 2 defends : 50


Health of Player 1 : 50
Health of Player 2 : 100

--- Round 5 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '5' Player 2 rolled '5'




Player 2 attacks : 25
Player 1 defends : 25


Health of Player 1 : 50
Health of Player 2 : 100

--- Round 6 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '6' Player 2 rolled '2'




Player 1 attacks : 60
Player 2 defends : 20


Health of Player 1 : 50
Health of Player 2 : 60

--- Round 7 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '2' Player 2 rolled '6'




Player 2 attacks : 30
Player 1 defends : 10


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 8 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '1' Player 2 rolled '5'




Player 1 attacks : 10
Player 2 defends : 50


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 9 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '3' Player 2 rolled '3'




Player 2 attacks : 15
Player 1 defends : 15


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 10 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '3' Player 2 rolled '5'




Player 1 attacks : 30
Player 2 defends : 50


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 11 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '5' Player 2 rolled '4'




Player 2 attacks : 20
Player 1 defends : 25


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 12 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '5' Player 2 rolled '6'




Player 1 attacks : 50
Player 2 defends : 60


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 13 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '4' Player 2 rolled '2'




Player 2 attacks : 10
Player 1 defends : 20


Health of Player 1 : 30
Health of Player 2 : 60

--- Round 14 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '6' Player 2 rolled '4'




Player 1 attacks : 60
Player 2 defends : 40


Health of Player 1 : 30
Health of Player 2 : 40

--- Round 15 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '2' Player 2 rolled '5'




Player 2 attacks : 25
Player 1 defends : 10


Health of Player 1 : 15
Health of Player 2 : 40

--- Round 16 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '2' Player 2 rolled '2'




Player 1 attacks : 20
Player 2 defends : 20


Health of Player 1 : 15
Health of Player 2 : 40

--- Round 17 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '3' Player 2 rolled '3'




Player 2 attacks : 15
Player 1 defends : 15


Health of Player 1 : 15
Health of Player 2 : 40

--- Round 18 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '6' Player 2 rolled '6'




Player 1 attacks : 60
Player 2 defends : 60


Health of Player 1 : 15
Health of Player 2 : 40

--- Round 19 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '5' Player 2 rolled '3'




Player 2 attacks : 15
Player 1 defends : 25


Health of Player 1 : 15
Health of Player 2 : 40

--- Round 20 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '1' Player 2 rolled '3'




Player 1 attacks : 10
Player 2 defends : 30


Health of Player 1 : 15
Health of Player 2 : 40

--- Round 21 completed ---


Enter 'r' to roll the dice, 'e' to exit : r //user input


Player 1 rolled '2' Player 2 rolled '5'




Player 2 attacks : 25
Player 1 defends : 10


Health of Player 1 : 0
Health of Player 2 : 40

--- Round 22 completed ---


Player 1 has lost all its Health.

!!! PLAYER 2 WINS !!!
Thank You for playing.
Have a good day!!!