package OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String courseName;
    String code;
    String prefix;
    int not;

    Course(String courseName , String code , String prefix){
        this.courseName = courseName;
        this.code = code;
        this.prefix = prefix;
        this.not = 0;
    }
    //ders kodu ile eslesiyormu!
    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacherInfo();
        }
        else {
            System.out.println("Öğretmen ders kodu ile eşleşmiyor.");
        }
    }
    void printTeacherInfo(){
        System.out.println("#######################");
        this.teacher.printTeacher();
        System.out.println("#######################");
    }


}
