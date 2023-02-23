package actionAdventureGame;

public class Main {
    public static void main(String[] args) {
        
        Character ch1 = new King();
        ch1.performUseWeapon();

        Character ch2 = new Queen();
        ch2.performUseWeapon();

        Character ch3 = new Knight();
        ch3.performUseWeapon();
        ch3.changeWeaponBehaviour(new Sword());
        ch3.performUseWeapon();

        Character ch4 = new Troll();
        ch4.performUseWeapon();

    }
}
