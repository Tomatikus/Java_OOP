import java.util.Iterator;

public class Program {
   
    public static void main(String[] args) {
        OfficeWorkers office1 = new OfficeWorkers();

        Counter counter = new Counter("Misha", 28, 1400);
        FinDirector findir = new FinDirector("Petra", 25, counter);
        Director diric = new Director("Alexsandr", 35, findir);
        Owner owner = new Owner("Alexsay", 48, diric);

        office1.addNewWorker(owner);
        office1.addNewWorker(diric);
        office1.addNewWorker(findir);
        office1.addNewWorker(counter);


        Iterator people = office1;
        while(people.hasNext()){
            System.out.println(people.next());
        }
    }
}
