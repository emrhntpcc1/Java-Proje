package OgrenciBilgiSistemi;

public class EkranaYazdirma {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Nurcihan","FZK","0545");
        Teacher teacher2 = new Teacher("Özgür","KMYA","0537");
        Teacher teacher3 = new Teacher("İrfan","BIO","0541");


        Course fizik = new Course("Fizik" , "101", "FZK");
        Course kimya = new Course("Kimya" , "101", "KMYA");
        Course biyoloji = new Course("Biyoloji" , "101" , "BIO");
        fizik.addTeacher(teacher1);
        kimya.addTeacher(teacher2);
        biyoloji.addTeacher(teacher3);


        Student student1 = new Student("Emirhan","138","12/A",fizik,kimya,biyoloji);
        student1.addBulkExamNote(75,60,85);
        student1.studentInfo();


        Student student2 = new Student("Aleyna","1420","11/B",fizik,kimya,biyoloji);
        student2.addBulkExamNote(35,25,18);
        student2.studentInfo();


    }
}
