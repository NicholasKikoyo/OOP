public class Main {
    public static void main(String[] args) {
        StudentDetails student1 = new StudentDetails("Bob", 26, false);
        StudentDetails student2 = new StudentDetails("Alice", 25, false);
        StudentDetails student3 = new StudentDetails("John", 19, false);
        StudentDetails student4 = new StudentDetails("Jane", 46, false);


        System.out.println(student1.studentFriends.add("Alice"));
        System.out.println(student1.studentFriends);
    }
}