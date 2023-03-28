package hw2_2;

public class Slytherin extends Hogwarts {
    private int cunning, determination, ambition, resourcefulness, lustForPower;

    public Slytherin(String fio, int power, int transgression, int cunning, int determination,
                     int ambition, int resourcefulness, int lustForPower) {
        super(fio, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public void bestStudentFaculty(Slytherin student) {
        String best = sumScore() > student.sumScore() ? getFio() : student.getFio();
        String bad = sumScore() > student.sumScore() ? student.getFio() : getFio();
        System.out.println(best + " лучший Слизеринец, чем " + bad);
    }

    private int sumScore() {
        return cunning + determination + ambition + resourcefulness + lustForPower;
    }

    @Override
    public String toString() {
        return "Факультет Слизерина, " + super.toString() +
                ", cunning= " + cunning +
                ", determination= " + determination +
                ", ambition= " + ambition +
                ", resourcefulness= " + resourcefulness +
                ", lustForPower= " + lustForPower;
    }
}