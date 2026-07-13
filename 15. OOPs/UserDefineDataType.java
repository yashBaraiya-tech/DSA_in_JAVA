public class UserDefineDataType {

    public static class Student {
        String name;
        int rno;
        double cgpa;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Yash";
        s.rno = 03;
        s.cgpa = 9.9;
        System.out.println(s.name);
        System.out.println(s.rno);
        System.out.println(s.cgpa);
    }
}