public class Programmer extends Person {
    private String companyName;

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void learn(){
        System.out.println(name+" is learning   IT " );

    }
    public void wolk(){
        System.out.println(name+"is wolking work");

    }
    public void eating(){
        System.out.println(name+"is eating burger");
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
