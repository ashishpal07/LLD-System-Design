package actionAdventureGame;

public abstract class Character {
    
    WeaponBehaviour weaponBehaviour;

    public abstract void fight ();

    public void performUseWeapon () {
        weaponBehaviour.useWeapon();
    }

    public void changeWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

}
