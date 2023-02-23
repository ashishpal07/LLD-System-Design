
package actionAdventureGame;

public class Queen extends Character {

    public Queen () {
        System.out.println("-----I am Queen-----");
        weaponBehaviour = new Knife();
    }

    public void fight () {
        System.out.println("Queen is fighting");
    }

}