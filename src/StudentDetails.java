import java.util.ArrayList;

public class StudentDetails {
    String name;
    int age;
    boolean marriageStatus;
    String city;
    ArrayList<String> studentFriends = new ArrayList<>();


    public StudentDetails(String p1, int p2, boolean p3){
        name = p1;
        age = p2;
        marriageStatus = p3;
    }
}
