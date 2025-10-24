public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Aibek", "deverlop", "Peaksoft");
        Dancer dancer = new Dancer("Ainur", "Professional Dancer", "Kyrgyz Folk Group");
        Singer singer = new Singer("Eldar", "singer ", "best Band");


        programmer.learn();
        programmer.wolk();
        programmer.eating();
        System.out.println(programmer+"\n");

        dancer.eating();
        dancer.wolk();
        dancer.learn();
        System.out.println(dancer+"\n");

        singer.learn();
        singer.wolk();
        singer.eating();
        System.out.println(singer);








    }
}
