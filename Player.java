public class Player {
    private String name;
    private int totalCards;
    protected int amountCards;

    public Player() {
        this.name = "Default";
        this.amountCards = 2;
    }

    public Player(String name, int amountCards) {
        this.name = name;
        this.amountCards = amountCards;
        this.totalCards = amountCards;
    }

    public String getName() {
        return name;
    }

    public int getAmountCards() {
        return amountCards;
    }

    public int getTotalCards() {
        return totalCards;
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

    public int amountCardDead() {
        return getTotalCards() - getAmountCards();
    }

    public class Card {
        private String title;
        private String type;
        private int health;
        private int damage;
        private double multiplier;

        public Card() {
            this.title = "Basic";
            this.type = "normal";
            this.health = 100;
            this.damage = 25;
            this.multiplier = 1.0;
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

        public int attack() {
            return (int) (getDamage() * getMultiplier());
        }

        public void takeDamage(int damageReceived) {
            setHealth(getHealth() - damageReceived);
            if (getHealth() <= 0) {
                setAmountCards(getAmountCards()-1);
            }
        }

        public boolean isDead() {
            if (getHealth() <= 0) {
                return true;
            }
            return false;
        }

        public void printStats() {
            if (isDead()) {
                System.out.println(getTitle() + ": Dead");
            } else {
                System.out.println(getTitle());
                System.out.println("Health: " + getHealth());
                System.out.println("Type: " + getType());
                System.out.println("Damage: " + getDamage());
                System.out.println("Multiplier: " + getMultiplier());
            }
        }
    }
}

// --The following is in Boss.java--
// public class Boss extends Player {

// public class BossCard extends Player.Card {

// }
// }