import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> menschen = new ArrayList<>();

        GrownUp grownUp = new GrownUp(32, "Gawain");
        Child child = new Child("Anna", "Gorka", 1, "Clara");

        menschen.add(grownUp);
        menschen.add(child);
        for(int i = 0; i< menschen.size(); i++){
            menschen.get(i).shout();
        }

        GrownUp1 pommi = new GrownUp1(2, "Pommi");
        pommi.shout();
        pommi.birthday();
        pommi.shout();
    }

}
