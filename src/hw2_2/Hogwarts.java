package hw2_2;

public class Hogwarts {
    private int power, transgression;
    private String fio;

    public Hogwarts(String fio, int power, int transgression) {
        this.fio = fio;
        this.power = power;
        this.transgression = transgression;
    }

    public void printStudent() {
        System.out.println(toString());
    }

    public void bestStudentHogwarts(Hogwarts student) {
        String best = sumScore() > student.sumScore() ? getFio() : student.getFio();
        String bad = sumScore() > student.sumScore() ? student.getFio() : getFio();
        System.out.println(best + " лучший в Хогравтсе, чем " + bad);
    }

    private int sumScore() {
        return power + transgression;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String toString() {
        return "ученик - " + fio +
                ", сила магии " + power +
                ", расстояние трансгресии " + transgression;
    }
}