package hw2_2;
public class Gryffindor extends Hogwarts {
    private int nobility, honor, bravery;

    public Gryffindor(String fio, int power, int transgression, int nobility, int honor, int bravery) {
        super(fio, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public void bestStudentFaculty(Gryffindor student) {
        String best = sumScore() > student.sumScore() ? getFio() : student.getFio();
        String bad = sumScore() > student.sumScore() ? student.getFio() : getFio();
        System.out.println(best + " лучший Гриффиндорец, чем " + bad);
    }

    private int sumScore() {
        return nobility + honor + bravery;
    }

    @Override
    public String toString() {
        return "Факультет Гриффиндора, " + super.toString() +
                ", nobility= " + nobility +
                ", honor= " + honor +
                ", bravery= " + bravery;
    }

}