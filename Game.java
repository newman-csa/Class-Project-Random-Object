import java.util.Scanner;

public class Game {
    static void printDeckStats(Player.Card[] deck) {
        int index = 1;
        for (Player.Card card : deck) {
            System.out.print("(" + index + ") ");
            card.printStats();
            System.out.println();
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Initializing players and cards
        int deckSize = 2;
        Player p1 = new Player("Winter", deckSize);
        Player.Card p1c1 = p1.new Card("Solstice", "Ice", 100, 40, 1.0);
        Player.Card p1c2 = p1.new Card();
        Player.Card[] p1deck = { p1c1, p1c2 };
        Player p2 = new Player("Talus", deckSize);
        Player.Card p2c1 = p2.new Card("Ethereal", "Void", 150, 20, 1.2);
        Player.Card p2c2 = p2.new Card();
        Player.Card[] p2deck = { p2c1, p2c2 };

        // Action Loop: breaks when someone wins the game
        while (true) {
            // P1's Turn
            System.out.println(p1.getName() + ", what card would you like to attack with?");
            printDeckStats(p1deck);
            int attacker = scn.nextInt();
            System.out.println("What card would you like to attack?");
            printDeckStats(p2deck);
            int defender = scn.nextInt();
            // P1 attacks P2
            p2deck[defender - 1].takeDamage(p1deck[attacker - 1].attack());
            // Checks if P2 had no cards, if they assigns multiplier based on amount of dead cards
            if (p2.getAmountCards() == 0) {
                System.out.println("\n--" + p1.getName() + " WINS--");
                break;
            } else if (p2.amountCardDead() != 0) {
                for (Player.Card card : p2deck) {
                    card.setMultiplier(1 + (p2.amountCardDead() * 0.25));
                }
                System.out.println(p2.getName() + " has " + p2.amountCardDead() + " card(s) dead, giving them a "
                        + (p2.amountCardDead() * 0.25) + " multiplier");
            }

            // P2's Turn
            System.out.println(p2.getName() + ", what card would you like to attack with?");
            printDeckStats(p2deck);
            attacker = scn.nextInt();
            System.out.println("What card would you like to attack?");
            printDeckStats(p1deck);
            defender = scn.nextInt();
            // P2 attacks P1
            p1deck[defender - 1].takeDamage(p2deck[attacker - 1].attack());
            // Checks if P1 had no cards, if they assigns multiplier based on amount of dead cards
            if (p1.getAmountCards() == 0) {
                System.out.println("\n--" + p2.getName() + " WINS--");
                break;
            } else if (p1.amountCardDead() != 0) {
                for (Player.Card card : p1deck) {
                    card.setMultiplier(1 + (p1.amountCardDead() * 0.25));
                }
                System.out.println(p1.getName() + " has " + p1.amountCardDead() + "c ards, giving them a "
                        + (p1.amountCardDead() * 0.25) + " multiplier");
            }

        }
    }
}