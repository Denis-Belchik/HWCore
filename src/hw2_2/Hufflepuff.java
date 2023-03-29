package hw2_2;

public class Hufflepuff extends Hogwarts {
    private int industriousness, loyalty, honesty;

    public Hufflepuff(String fio, int power, int transgression, int industriousness, int loyalty, int honesty) {
        super(fio, power, transgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void bestStudentFaculty(Hufflepuff student) {
        String best = sumScore() > student.sumScore() ? getFio() : student.getFio();
        String bad = sumScore() > student.sumScore() ? student.getFio() : getFio();
        System.out.println(best + " лучший Пуфендуец, чем " + bad);
    }

    private int sumScore() {
        return industriousness + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Факультет Пуфендуя, " + super.toString() +
                ", industriousness= " + industriousness +
                ", loyalty= " + loyalty +
                ", honesty= " + honesty;
    }
}