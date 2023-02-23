package actionAdventureGame;


public class Knight extends Character {
    
    public Knight () {    
        System.out.println("-----I am Knight-----");
        weaponBehaviour = new Knife();
    }

    public void fight () {
        System.out.println("Knight is fighting");
    }

}
