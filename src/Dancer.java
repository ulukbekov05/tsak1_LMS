public class Dancer extends Person {
    private String groupName;

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void getden(){
        System.out.println(name+"is dancing with group"+groupName);
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
