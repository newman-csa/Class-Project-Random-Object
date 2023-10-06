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

    public String getName() {
        return name;
    }

    public int getAmountCards() {
        return amountCards;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmountCards(int amountCards) {
        this.amountCards = amountCards;
    }

    public boolean loseState() {
        return getAmountCards() == 0;
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

        public String getTitle() {
            return title;
        }

        public String getType() {
            return type;
        }

        public int getHealth() {
            return health;
        }

        public int getDamage() {
            return damage;
        }

        public double getMultiplier() {
            return multiplier;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public void setMultiplier(double multiplier) {
            this.multiplier = multiplier;
        }

        public void takeDamage(int damageReceived) {
            this.health -= damageReceived;
        }

        public boolean isDead() {
            return getHealth() <= 0;
        }
    }
}

// --The following is in Boss.java--
// public class Boss extends Player {

// public class BossCard extends Player.Card {

// }
// }