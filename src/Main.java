public class Main {
    public static void main(String[] args) {

        Student [] students = new Student[5];
        students[0] = new Student(45, "DD", 90);
        students[1] = new Student(56, "EE", 65);
        students[2] = new Student(22, "CC", 39);
        students[3] = new Student(19, "BB", 48);
        students[4] = new Student(25, "AA", 69);

        //Util.sort(students, new StudentComparator());
        Util.sort(
                students,
                new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        Student s1 = (Student) o1;
                        Student s2 = (Student) o2;
                        if(s1.getMarks() > s2.getMarks()) {
                            return -1;
                        }
                        if(s1.getMarks() < s2.getMarks()) {
                            return 1;
                        }
                        return 0;
                    }
                }
        );

        for(Student student : students) {
            System.out.println(student);
        }

    }
}
