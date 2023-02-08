public class Persister implements Functionable {


    @Override
    public void save(User user) {
        System.out.println("Save user: " + user);
    }

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user);
    }
    
}
