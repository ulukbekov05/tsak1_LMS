public class Programmer extends Person {
    private String companyName;

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void get(){
        System.out.println(name+" is coding at "+designation);
    }


    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
