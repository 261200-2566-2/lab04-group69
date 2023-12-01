public class Main {
    public static void main(String[] args) {
        // Create a Warrior character
        WarriorCharacter warrior = new WarriorCharacter();
        warrior.displayCharacterInfo();
        warrior.useSlashAttack();

        // Create a Gauntlet accessory
        IronGauntlet ironGauntlet = new IronGauntlet();
        ironGauntlet.displayAccessoryInfo();
        ironGauntlet.provideStrengthBuff();
    }
}
