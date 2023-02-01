// Реализовать абстрактный класс Warrior, с полями name, weapon, healthPoint
// Создать интерфейс Weapon с методом damage(), который будет показывать наносимый урон
// На основе класса Warrior создать различные типы воинов, например, лучник, меченосец, ополченец и т.п.
// У лучника добавить поле расстояние поражения. 
// Создать различные виды вооружения, например, меч, лук, лопата.
// Обеспечить, чтобы определенный тип воина мог нести только определенной оружие
// Создать класс командира

package seminar_4;

import seminar_4.Weapons.Bow;
import seminar_4.Weapons.HavyShield;
import seminar_4.Weapons.LightShield;
import seminar_4.Weapons.MidleShield;
import seminar_4.Weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Swordman> team1 = new Team<>();
        team1.addWarriorToTeam(new Swordman("Ivan", 100, new Sword(50), new MidleShield(60)))
                .addWarriorToTeam(new Swordman("Vasiliy", 110, new Sword(60), new HavyShield(70)));

                for (Swordman swordman : team1) {
                }
                System.out.println();

        Team<Archer> team2 = new Team<>();
        team2.addWarriorToTeam(new Archer("Violetta", 80, new Bow(30, 45), new LightShield(15)))
        .addWarriorToTeam(new Archer("Elena", 70, new Bow(45, 50), new LightShield(20)));

            for (Archer archer : team2) {
            }
            System.out.println();

        Team <Sheldman> team3 = new Team<>();
        team3.addWarriorToTeam(new Sheldman("Igor", 100, new Sword(70), new HavyShield( 120)))
        .addWarriorToTeam(new Sheldman("Svetochka", 160, new Sword(95), new HavyShield(155)))
        .addWarriorToTeam(new Sheldman("Fedor", 120, new Sword(90), new HavyShield(150)));
        
            for (Sheldman sheldman : team3) {   
            }
            System.out.println();

    }    
}
