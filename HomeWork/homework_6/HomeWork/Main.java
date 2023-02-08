
public class Main{
	public static void main(String[] args){
		User user = new User("John");
		Functionable functionable = new Persister();
		Controller controller = new Controller(functionable);
		View view = new View(controller);
		view.run(user);
	}
}


