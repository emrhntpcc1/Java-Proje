package OgrenciBilgiSistemi;

public class Student {
    Course course1;
    Course course2;
    Course course3;
    String studentName;
    String schollNo;
    String classes;
    boolean isPass;
    double avarage;
    Student(String studentName , String schollNo , String classes ,
            Course course1,Course course2 , Course course3) {
        this.studentName = studentName;
        this.schollNo = schollNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.isPass = false;
        this.avarage = 0.0;
    }

    void addBulkExamNote(int course1Not , int course2Not , int course3Not){
        if((course1Not >= 0) && (course1Not <= 100)){
            this.course1.not = course1Not;
        }
        if((course2Not >= 0) && (course2Not <= 100)){
            this.course2.not = course2Not;
        }
        if((course3Not >= 0) && (course3Not <= 100)){
            this.course3.not = course3Not;
        }
    }

    void calcAvarage(){
        this.avarage = (this.course1.not + this.course2.not + this.course3.not) / 3.0;
        System.out.println("Dönem ortalaması: " + avarage);
        if(this.avarage >= 50){
            System.out.println("Sınıfı geçtiniz !");

        } else {
            System.out.println("Sınıfı geçemediniz !");
        }
    }
    void printNot(){

        System.out.println(this.course1.courseName + " = " + this.course1.not);
        System.out.println(this.course2.courseName + " = " + this.course2.not);
        System.out.println(this.course3.courseName + " = " + this.course3.not);
        calcAvarage();
    }
    void studentInfo(){
        System.out.println("#######################");
        System.out.println("İsim: " + this.studentName);
        System.out.println("Sınıf: " + this.classes);
        System.out.println("Okul Numarası: " + this.schollNo);
        System.out.println("Öğrencinin not bilgileri aşağıdadır. ");
        printNot();
        System.out.println("#######################");
    }

}
