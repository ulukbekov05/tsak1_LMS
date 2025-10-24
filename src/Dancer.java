public class Dancer extends Person {
    private String groupName;

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void learn(){
        System.out.println(name+" is learning   dancer " );

    }
    public void wolk(){
        System.out.println(name+"is wolking park");

    }
    public void eating(){
        System.out.println(name+"is eating lagman");
    }







    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
