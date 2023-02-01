import java.util.Collections;

public class Program {
    public static void main(String[] args) {
        User newUser = new User("Tom", "Sokol", 30);
        newUser.addOneUser(new User("John", "Smith", 35));
        Personal personal = new Personal();

        personal.addUser(newUser);
        personal.addUser(new User("John", "Doww", 25));
        personal.addUser(new User("Jaison", "Statam", 40));
        personal.addUser(new User("Jackson", "Curtis", 39));
        personal.addUser(new User("Jenifer", "Curtis", 8));
        personal.addUser(new User("John", "Curtis", 38));



        for (User user : personal) {
            System.out.println(user);   // список юзеров
        }
        System.out.println("________");
        Collections.sort(personal.getUsers());


        // User bigBoss = new User("Donald", "Tramp", 65);
        // bigBoss.addSubordinators(personal);

        // System.out.println(bigBoss);
    }
}