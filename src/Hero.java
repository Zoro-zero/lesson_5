public class Hero {
    private int health;
    private int herodamage;
    private String superPower;

    public Hero(int health, int damage, String superPower){
       this.health=health;
        this.herodamage=damage;
        this.superPower=superPower;
    }
    public Hero(int health,int damage){
        this.health=health;
        this.herodamage=damage;
    }
    public String getSuperPower() {
        return superPower;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return herodamage;
    }
}
