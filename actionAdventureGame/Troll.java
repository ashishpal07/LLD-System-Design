package actionAdventureGame;

public class Troll extends Character {

    public Troll () { 
        System.out.println("-----I am Troll-----");
        weaponBehaviour = new Knife();
    }
    
    public void fight () {
        System.out.println("Troll is fighting");
    }

}
