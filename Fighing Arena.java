//all the necessary imports of libraries
import java.util.Scanner;
import java.util.Random;

//this class has attributes and methods of players
class Player
{
    // attributes of players
    private String name;
    private int health;
    private int strength;
    private int attack;
    
    // setter and getter for name attribute
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    // setter and getter for health attribute
    public int getHealth()
    {
        return health;
    }
    public void setHealth(int health)
    {
        this.health = health;
    }

    // setter and getter for strength attribute
    public int getStrength()
    {
        return strength;
    }
    public void setStrength(int strength)
    {
        this.strength = strength;
    }

    // setter and getter for attack attribute
    public int getAttack()
    {
        return attack;
    }
    public void setAttack(int attack)
    {
        this.attack = attack;
    }


    //this method returns an array of 2 random integers greater than 0, lesser that 7 simulating a dice roll
    public static int[] rollDice()
    {
        Random rand = new Random();

        //results of the rolls of dice by both players
        int player1_roll = rand.nextInt(6) + 1;
        int player2_roll = rand.nextInt(6) + 1;
        System.out.println("Player 1 rolled " + "'"+player1_roll+"'" + " Player 2 rolled " + "'"+player2_roll+"'");
        System.out.println();
        System.out.println();

        int[] rolls = {player1_roll,player2_roll};
        //returns 2 numbers as an array
        return rolls;
    }


    //this method will be called when the player1 attacks
    //it will calculate the difference between the attack and defense and return the difference
    public static int attack1(int player1_roll, int player2_roll, int player1_attack, int player2_strength)
    {
        int health_decrement = player1_roll*player1_attack - player2_roll*player2_strength;
        System.out.println();
        System.out.println();
        System.out.println("Player 1 attacks : " + player1_roll*player1_attack);
        System.out.println("Player 2 defends : " + player2_roll*player2_strength);
        return health_decrement;
    }

    //this method will be called when the player2 attacks
    //it will calculate the difference between the attack and defense and return the difference
    public static int attack2(int player1_roll, int player2_roll, int player2_attack, int player1_strength)
    {
        int health_decrement = player2_roll*player2_attack - player1_roll*player1_strength;
        System.out.println();
        System.out.println();
        System.out.println("Player 2 attacks : " + player2_roll*player2_attack);
        System.out.println("Player 1 defends : " + player1_roll*player1_strength);
        return health_decrement;
    }
}



class Main
{
    public static void main(String[] args)
    {
        //Initializing two players as members of Player class
        Player player1 = new Player();
        Player player2 = new Player();
        
        Scanner sc = new Scanner(System.in);

        //defining the integer attributes
        int player1_health;
        int player1_strength;
        int player1_attack;
        int player2_health;
        int player2_strength;
        int player2_attack;

        //Getting the required name of player1 from the user
        System.out.println("Enter the name of player 1 : ");
        String player1_name = sc.nextLine();

        // 6 do while loops have been used to get the values of 6 integer type attributes from the user, 3 for each player
        //this is done so that only poisitive integer is accepted as an input or else user is asked to enter again

        //getting health of player1 from user and accepting only positive integer
        do 
        {
            System.out.println("Enter the health of player 1 : ");
            while (!sc.hasNextInt()) 
            { 
                // Check if the input is an integer
                String input = sc.next();
                System.out.println("'" + input + "' is not a valid integer. Please enter a positive integer.");
            }
            player1_health = sc.nextInt(); // Read the integer input
            if (player1_health <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            }
        } 
        while (player1_health <= 0);

        //getting strength of player1 from user and accepting only positive integer
        do 
        {
            System.out.println("Enter the strength of player 1 : ");
            while (!sc.hasNextInt()) 
            { // Check if the input is an integer
                String input = sc.next();
                System.out.println("'" + input + "' is not a valid integer. Please enter a positive integer.");
            }
            player1_strength = sc.nextInt(); // Read the integer input
            if (player1_strength <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            }
        } 
        while (player1_strength <= 0);

        //getting attack of player1 from user and accepting only positive integer
        do 
        {
            System.out.println("Enter the attack of player 1 : ");
            while (!sc.hasNextInt()) 
            { // Check if the input is an integer
                String input = sc.next();
                System.out.println("'" + input + "' is not a valid integer. Please enter a positive integer.");
            }
            player1_attack = sc.nextInt(); // Read the integer input
            if (player1_attack <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            }
        } 
        while (player1_attack <= 0);


        sc.nextLine(); //consuming the extra new line character

        //Getting the required name of player2 from the user
        System.out.println("Enter the name of player 2 : ");
        String player2_name = sc.nextLine();

        //getting health of player2 from user and accepting only positive integer
        do 
        {
            System.out.println("Enter the health of player 2 : ");
            while (!sc.hasNextInt()) 
            { // Check if the input is an integer
                String input = sc.next();
                System.out.println("'" + input + "' is not a valid integer. Please enter a positive integer.");
            }
            player2_health = sc.nextInt(); // Read the integer input
            if (player2_health <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            }
        } 
        while (player2_health <= 0);

        //getting strength of player2 from user and accepting only positive integer
        do 
        {
            System.out.println("Enter the strength of player 2 : ");
            while (!sc.hasNextInt()) 
            { // Check if the input is an integer
                String input = sc.next();
                System.out.println("'" + input + "' is not a valid integer. Please enter a positive integer.");
            }
            player2_strength = sc.nextInt(); // Read the integer input
            if (player2_strength <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            }
        } 
        while (player2_strength <= 0);

        //getting attack of player2 from user and accepting only positive integer
        do 
        {
            System.out.println("Enter the attack of player 2 : ");
            while (!sc.hasNextInt()) 
            { // Check if the input is an integer
                String input = sc.next();
                System.out.println("'" + input + "' is not a valid integer. Please enter a positive integer.");
            }
            player2_attack = sc.nextInt(); // Read the integer input
            if (player2_attack <= 0) 
            {
                System.out.println("Please enter a positive integer.");
            }
        } 
        while (player2_attack <= 0);
        

        sc.nextLine(); //consuming the extra new line character


        //setting the attributes of both the players
        player1.setName(player1_name);
        player1.setHealth(player1_health);
        player1.setStrength(player1_strength);
        player1.setAttack(player1_attack);
        player2.setName(player2_name);
        player2.setHealth(player2_health);
        player2.setStrength(player2_strength);
        player2.setAttack(player2_attack);

        //initial display of the details of the players
        System.out.println();
        System.out.println();
        System.out.println("Players have entered the Arena. Details of the players are - ");
        System.out.println();
        System.out.println();
        System.out.println("Player 1 : " + player1_name);
        System.out.println("Health : " + player1_health);
        System.out.println("Strength : " + player1_strength);
        System.out.println("Attack : " + player1_attack);
        System.out.println();
        System.out.println();
        System.out.println("Player 2 : " + player2_name);
        System.out.println("Health : " + player2_health);
        System.out.println("Strength : " + player2_strength);
        System.out.println("Attack : " + player2_attack);
        System.out.println();
        System.out.println();

        
        //fighting rounds will begin here. 1st round will be independent and rest will be in loop
        //this is because 1st round is based on the basis of difference in health, the player with lower health attacks first

        int round = 1;  //round keeps the tab of number of rounds the players are fighting

        //value 5 of attacker has been given randomly, after the 1st dice roll is done, the value of attacker will changed depending
        //on which player attacks first. For example if player1 attacks first then the value of attacker will be set to '1'
        //this will be used to alternate the attacks of each player
        int attacker = 5;
        char userInput;

        char a = 'm'; //this is a temporary variable

        //this code will only allow 'r' or 'e' to be entered by the user or will ask user to again input a value. 
        do 
        {
            System.out.print("Enter 'r' to roll the dice, 'e' to exit : ");
            userInput = sc.next().charAt(0);

            switch (userInput) 
            {
                case 'r':
    
                    a = 'r';
                    break;
                case 'e':
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } 
        while (userInput != 'r' && userInput != 'e');

        System.out.println();
        System.out.println();

        //user input value is taken and then stored in a variable 'a' after checking all the conditions in previous do while loop
        if (a == 'r') //this code will run if user wants to roll dice and enters 'r'
        {
            //dice roll and assignment of respective roll numbers
            int[] rolls = Player.rollDice();
            int player1_roll = rolls[0];
            int player2_roll = rolls[1];

            if (player1_health <= player2_health) //player 1 will attack first if his health is lower or equal to player 2
            {
                System.out.println("Comparing their healths, Player 1 will attack first...");
                System.out.println();
                System.out.println();
                int health_decrement = Player.attack1(player1_roll, player2_roll, player1_attack, player2_strength);

                //if health decrement is positive it means attack was higher than defense and only then the health is altered
                if (health_decrement > 0) // this means that damage has happened to player2
                {
                    int prev_health = player2.getHealth();
                    player2.setHealth(prev_health - health_decrement); //setting the new health of player2
                }
                attacker = 1;
            }
            else //player 2 will attack first
            {
                System.out.println("Comparing their healths, Player 2 will attack first...");
                System.out.println();
                System.out.println();
                int health_decrement = Player.attack2(player1_roll, player2_roll, player2_attack, player1_strength);

                //if health decrement is positive it means attack was higher than defense and only then the health is altered
                if (health_decrement > 0) // this means that damage has happened to player1
                {
                    int prev_health = player1.getHealth();
                    player1.setHealth(prev_health - health_decrement); //setting the new health of player1
                }
                attacker = 2; //attacker value is used as an alternator to alternate between attackers
            }
        }
        
        //display of health of players after round 1
        System.out.println();
        System.out.println();
        System.out.println("Health of Player 1 : " + player1.getHealth());
        System.out.println("Health of Player 2 : " + player2.getHealth());
        System.out.println();
        System.out.println("--- Round 1 completed ---");
        // Round 1 is completed here


        //this is the code to keep asking user if he wants to play next round or exit the game
        //this loop works as long as the health of both the players is greater than 0, unless user wants to quit the game
        //user is asked to enter 'r' after every round to roll the dice
        char input;
        while (true) 
        {
            //this if condition checks if either player has lost complete health in 1st round
            //this if condition will be executed only if a player has won in 1st round itself
            if(player1.getHealth() <= 0 || player2.getHealth() <= 0)
            {
                if(player1.getHealth() <= 0)
                {
                    //player 2 victory message
                    System.out.println();
                    System.out.println();
                    System.out.println("Player 1 has lost all its Health.");
                    System.out.println();
                    System.out.println("!!! PLAYER 2 WINS !!!");
                }

                if(player2.getHealth() <= 0)
                {
                    //player 1 victory message
                    System.out.println();
                    System.out.println();
                    System.out.println("Player 2 has lost all its Health.");
                    System.out.println();
                    System.out.println("!!! PLAYER 1 WINS !!!");
                    System.out.println();
                    System.out.println();
                }
                break;
            }
            //user will be asked to enter 'r' to roll the dice for the next round
            // Prompt the user for input
            System.out.println();
            System.out.println();
            System.out.print("Enter 'r' to roll the dice, 'e' to exit : ");
           
            input = sc.next().charAt(0); // Read the first character of input
            System.out.println();
            System.out.println();

            // Check if the input is valid ('r' or 'e')
            if (input == 'r') 
            {
                round += 1; //increments the value of round so that it can be known how many rounds the whole fight lasted

                // Rolling the dice
                int[] rolls = Player.rollDice();
                int player1_roll = rolls[0];
                int player2_roll = rolls[1];

                //if the previous attacker was player 1, now player 2 will attack
                if(attacker == 1)
                {
                    //attack by player 2
                    int health_decrement = Player.attack2(player1_roll, player2_roll, player2_attack, player1_strength);
                    if (health_decrement > 0) // this means that damage has happened to player1
                    {
                        int prev_health = player1.getHealth();
                        player1.setHealth(prev_health - health_decrement); //setting the new health of player1
                    }
                    //value of attacker is alternated to 2 so that as the next iteration happens, attack is done by another
                    attacker = 2; 

                    //displaying the health of players
                    System.out.println();
                    System.out.println();
                    System.out.println("Health of Player 1 : " + player1.getHealth());
                    System.out.println("Health of Player 2 : " + player2.getHealth());


                    System.out.println();
                    System.out.println("--- Round " + round + " completed ---");

                    
                }

                //if previous attacker was player 2, now player 1 will attack
                else if(attacker == 2)
                {
                    int health_decrement = Player.attack1(player1_roll, player2_roll, player1_attack, player2_strength);
                    if (health_decrement > 0) // this means that damage has happened to player2
                    {
                        int prev_health = player2.getHealth();
                        player2.setHealth(prev_health - health_decrement); //setting the new health of player2
                    }
                    //value of attacker is alternated to 1 so that as the next iteration happens, attack is done by another
                    attacker = 1;

                    //displaying the health of players
                    System.out.println();
                    System.out.println();
                    System.out.println("Health of Player 1 : " + player1.getHealth());
                    System.out.println("Health of Player 2 : " + player2.getHealth());


                    System.out.println();
                    System.out.println("--- Round " + round + " completed ---");

                }
            } 
            else if (input == 'e') 
            {
                // Exit the program for 'e'
                break; // Exit the loop
            } 
            else 
            {
                // Display message for invalid input
                System.out.println("Invalid input. Please enter 'r' or 'e'.");
            }
        }
        sc.close();
        System.out.println("Thank You for playing.");
        System.out.println("Have a good day!!!");
        System.out.println("----------------------------------------");


            

    }
}