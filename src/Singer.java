public class Singer extends Person {
    private String bandName;


    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;

    }

    public void learn(){
        System.out.println(name+" is learning   singer " );

    }
    public void wolk(){
        System.out.println(name+"is wolking waiteress");

    }
    public void eating(){
        System.out.println(name+"is eating fast wood");
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
