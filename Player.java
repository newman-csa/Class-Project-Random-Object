// NOTE: NOT FINISHED

// Player is an outer class

// Constructor:
// String name of player
// Int number of cards the player starts with

// Getter/Setter:
// Get the number of current cards the player has.
// Get/set player name

// Methods:
// If player has no cards return loseState boolean of false.
// Make random card with random values

// Card is an inner class of Player

// Constructor:
// What type of card is it
// String Title of card
// Int health the card has
// Int Damage to the card
// Double Card multiplier

// Getters/Setters:
// Grabs all info
// Info for health can be removed by another cars damage to preform an attack

// Methods:
// A Method that attacks another card using the getter and setters from before
// A Method that receives damage from another card
// A Method that declares a card dead

public class Player {
    private String name;
    protected int amountCards;

    public Player() {
        this.name = "Default";
        this.amountCards = 8;
    }

    public Player(String name, int amountCards) {
        this.name = name;
        this.amountCards = amountCards;
    }

    public int getAmountCards() {
        return amountCards;
    }

    public String getName() {
        return name;
    }

    public boolean loseState() {
        return amountCards == 0;
    }

    public class Card {
        private String title;
        private String type;
        private int health;
        private int damage;
        private double multiplier;

        public Card() {
            this.title = "Blank";
            this.type = "noamal";
            this.health = 100;
            this.damage = 10;
            this.multiplier = 1;
        }

        public Card(String title, String type, int health, int damage, double multiplier) {
            this.title = title;
            this.type = type;
            this.health = health;
            this.damage = damage;
            this.multiplier = multiplier;
        }

    }
}

// --The following is in Boss.java--
// public class Boss extends Player {

//     public class BossCard extends Player.Card {

//     }
// }