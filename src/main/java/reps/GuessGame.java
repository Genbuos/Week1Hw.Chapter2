package reps;

public class GuessGame {
    // 3 instance varibales for three Player Objects
    Player p1;
    Player p2;
    Player p3;


    public void startGame(){
        // initializing the instance variables into Player objects
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        // three variables to hold the three guesses the Players make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

         //three variables to hold a true or a false based on the player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        // Make a target number that the players have to guess.
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0  and 9");

        while(true){
            System.out.println("Number to guess is " + targetNumber);


            //invoke the guess method defined in the Player class for each player
            p1.guess();
            p2.guess();
            p3.guess();

            // get each player's guess (the result of their guess() method)
            // by accessing the number variable of each player
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player one guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player one guessed " + guessp3);

            //Check the guess of each player to see if it matches the target number.
            // If a player is right,
            //then set that player's variable to be true
            // (because we set it to false by default.
            if (guessp1 == targetNumber){
                p1isRight = true;
            }
            if (guessp2 == targetNumber){
                p2isRight = true;
            }
            if (guessp3 == targetNumber){
                p3isRight = true;
            }

            // if any of the players are correct print these lines
            if (p1isRight || p2isRight || p3isRight){
                System.out.println("We have a winner!");
                System.out.println("Player one got it right? " + p1isRight);
                System.out.println("Player two got it right? " + p2isRight);
                System.out.println("Player three got it right? " + p3isRight);
                System.out.println("Game is over.");
                break;
            } else {// other wise stay in the loop for another round.
                System.out.println("Players will have to try again. ");
            }
        }
    }
}
