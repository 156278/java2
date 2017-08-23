public class Child implements Person {
    private String mother;
    private String father;
    private int age;
    private String name;

    public Child(String mother, String father, int age, String name) {
        this.mother = mother;
        this.father = father;
        this.age = age;
        this.name = name;
    }

    @Override
    public void birthday() {
        age++;
    }

    @Override
    public void shout() {
        System.out.println(name + " " + age + " Mother: " + mother + " Father: " + father);
    }
}
