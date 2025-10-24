public class Person {
    protected String name;
    protected String designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn(){
        System.out.println(" is learning  ");
    }
    public void wolk(){
        System.out.println("is wolking");
    }
    public void eating(){
        System.out.println("is eating");
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
