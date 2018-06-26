import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        Person pers1 = new Person("tom",23,"devops");

        Person pers2 = new Person("dave",26,"tester");

        Person pers3 = new Person("john",28,"developer");

        Person pers4 = new Person("paul",31,"tester");

        System.out.println(pers2.toString());

    }
    ArrayList<Person> Person = new ArrayList<>();
}
