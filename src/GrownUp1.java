public class GrownUp1 extends AbstractPerson {
    public GrownUp1(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public void shout() {
        System.out.println(name + " " + age);
    }
}
