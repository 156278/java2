public class GrownUp implements Person {
    private int age;
    private String name;

    public GrownUp(int age, String name) {
        this.age = age;
        this.name = name;

    }

    @Override
    public void birthday() {
        age++;
    }

    @Override
    public void shout() {
        System.out.println(name + " " + age);
    }
}
