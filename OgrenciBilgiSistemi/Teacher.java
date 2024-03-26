package OgrenciBilgiSistemi;

public class Teacher {
    Course courseName;
    String teacherName;
    String branch;
    String phoneNumber;

    Teacher(String teacherName , String branch , String phoneNumber){
        this.teacherName = teacherName;
        this.branch = branch;
        this.phoneNumber = phoneNumber;
    }
    void printTeacher(){
        System.out.println("İsim: " + this.teacherName + "\n" +
                            "Ders Kodu: " + this.branch + "\n" +
                            "Telefon No: " + this.phoneNumber);
    }
}
