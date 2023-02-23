package actionAdventureGame;

public class King extends Character {

    public King () {
        System.out.println("-----I am King-----");
        weaponBehaviour = new Knife();
    }
    
    public void fight () {
        System.out.println("King is fighting");
    }

}
