package hw2_2;

public class Ravenclaw extends Hogwarts {
    private int mind, wisdom, wit, creation;

    public Ravenclaw(String fio, int power, int transgression, int mind, int wisdom, int wit, int creation) {
        super(fio, power, transgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void bestStudentFaculty(Ravenclaw student) {
        String best = sumScore() > student.sumScore() ? getFio() : student.getFio();
        String bad = sumScore() > student.sumScore() ? student.getFio() : getFio();
        System.out.println(best + " лучший Когтевранец, чем " + bad);
    }

    private int sumScore() {
        return mind + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return "Факультет Когтеврана, " + super.toString() +
                ", mind= " + mind +
                ", wisdom= " + wisdom +
                ", wit= " + wit +
                ", creation= " + creation;
    }
}