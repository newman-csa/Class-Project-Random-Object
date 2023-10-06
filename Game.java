public class Game {
  public static void main(String[] args) {
    Player p1 = new Player();
    Player.Card p1c1 = p1.new Card();
    Player p2 = new Player("Talus", 10);
    Player.Card p2c1 = p2.new Card();
  }
}