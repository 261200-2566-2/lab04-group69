// RPGCharacter interface represents the common features of all RPG characters
interface RPGCharacter {
    // วิธีที่ให้ลักษณะของตัวละคร RPG ทุกตัว
    void displayCharacterInfo();
}

// Warrior interface represents characters with a warrior job
interface Warrior extends RPGCharacter {
    // วิธีที่ให้ความสามารถพิเศษของนักทหาร
    void useSlashAttack();
}

// Mage interface represents characters with a mage job
interface Mage extends RPGCharacter {
    // วิธีที่ให้ความสามารถพิเศษของเวทมนต์
    void castFireball();
}

// RPGAccessory interface represents the common features of all accessories
interface RPGAccessory {
    // วิธีที่ให้ลักษณะของอุปกรณ์เสริมใน RPG ทุกชิ้น
    void displayAccessoryInfo();
}

// Gauntlet interface represents gauntlet-type accessories
interface Gauntlet extends RPGAccessory {
    // วิธีที่ให้เอฟเฟ็กต์พิเศษของกันมือ
    void provideStrengthBuff();
}

// Ring interface represents ring-type accessories
interface Ring extends RPGAccessory {
    // วิธีที่ให้เอฟเฟ็กต์พิเศษของแหวน
    void provideMagicBuff();
}

// Example implementation of a Warrior character
class WarriorCharacter implements Warrior {
    // Implementation of RPGCharacter methods
    public void displayCharacterInfo() {
        // แสดงข้อมูลทั่วไปของนักทหาร
    }

    // Implementation of Warrior methods
    public void useSlashAttack() {
        // ใช้การโจมตีด้วยดาบ
    }
}

// Example implementation of a Gauntlet accessory
class IronGauntlet implements Gauntlet {
    // Implementation of RPGAccessory methods
    public void displayAccessoryInfo() {
        // แสดงข้อมูลทั่วไปของกันมือ
    }

    // Implementation of Gauntlet methods
    public void provideStrengthBuff() {
        // ให้เอฟเฟ็กต์พิเศษเพิ่มพลังโจมตี
    }
}
