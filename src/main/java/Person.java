public class Person implements Eater, Rider {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void eat(Edible edible) {
        System.out.println(name + " is eating " + edible);
    }

    public void makeNoise() {
        System.out.println(name + " is making noise.");
    }

    @Override
    public void mount(Rideable rideable) {
        System.out.println(name + " is mounting a rideable object.");
    }

    @Override
    public void dismount(Rideable rideable) {
        System.out.println(name + " is dismounting a rideable object.");
    }
}


