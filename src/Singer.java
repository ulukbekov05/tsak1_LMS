public class Singer extends Person {
    private String bandName;


    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }

    public void ger_singer(){
        System.out.println(name+" is singing with "+bandName);
    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}
