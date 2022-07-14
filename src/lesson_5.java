import java.util.Arrays;

public class lesson_5 {
    public static void main(String[] args) {
Boss boss=new Boss();
boss.setBossDamage(50);
boss.setHealth(400);
boss.setProtection("Magical");
        System.out.println("Damage boss: "+boss.getBossDamage()+" "+" Health boss : "+boss.getHealth()+
                " Protection boss :"+boss.getProtection());
        createHeroes();
    }
    public static Object[] createHeroes(){
        Hero thor=new Hero(280,33);
        Hero artur=new Hero(300,45,"Excalibur");
        Hero zoro=new Hero(220,22);
        Object[] heroes=new Object[6];
        heroes[0]=thor.getDamage();
        heroes[1]=thor.getHealth();
        heroes[2]=artur.getHealth();
        heroes[3]=artur.getDamage();
        heroes[4]=artur.getSuperPower();
        heroes[5]=zoro.getHealth();
        heroes[6]=zoro.getDamage();
        return createHeroes();
    }
}
