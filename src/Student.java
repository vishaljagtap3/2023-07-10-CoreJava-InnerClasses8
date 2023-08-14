public class Student {
    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}


class StudentComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Student s1 = (Student) o1;
        Student s2 = (Student) o2;

        if(s1.getRoll() > s2.getRoll()) {
            return 1;
        }

        if(s1.getRoll() < s2.getRoll()) {
            return -1;
        }

        return 0;
    }
}