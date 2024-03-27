package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHorus;
    int hireYear;

    Employee(String name , int salary , int workHorus , int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHorus = workHorus;
        this.hireYear = hireYear;
    }
    void tax(){
        if(this.salary > 1000){
            double tax = this.salary * 0.03;
            System.out.println("Vergi: " + tax + " TL");
        }
        else {
            System.out.println("Vergi: -");
        }
    }
    public double taxSbt(){
        if(this.salary > 1000){
            double tax = this.salary * 0.03;
            return tax;
        }else {
            return 0;
        }

    }
    void bonus(){
        if(this.workHorus > 40){
            int moreWorkHours = workHorus - 40;
            int bonus = moreWorkHours * 30;
            System.out.println("Bonus: " + bonus + " TL");
        }
        else {
            System.out.println("Bonus: -");
        }
    }
    public int bonusSbt(){
        if(this.workHorus > 40){
            int moreWorkHours = workHorus - 40;
            int bonus = moreWorkHours * 30;
            return bonus;
        }
        else {
            return 0;
        }
    }
    void raiseSalary(){
        if((2024 - this.hireYear) < 10){
            double raiseSalary = this.salary * 0.05;
            System.out.println("Maaş artışı: " + raiseSalary + " TL");
        }
        else if(((2024 - this.hireYear) > 9) && ((2024 - this.hireYear) < 20)){
            double raiseSalary = this.salary * 0.10;
            System.out.println("Maaş artışı: " + raiseSalary + " TL") ;
        }
        else {
            double raiseSalary = this.salary * 0.15;
            System.out.println("Maaş artışı: " + raiseSalary + " TL");
        }
    }
    public double raiseSalarySbt(){
        if((2024 - this.hireYear) < 10){
            double raiseSalary = this.salary * 0.05;
            return raiseSalary;
        }
        else if(((2024 - this.hireYear) > 9) && ((2024 - this.hireYear) < 20)){
            double raiseSalary = this.salary * 0.10;
            return raiseSalary;
        }
        else {
            double raiseSalary = this.salary * 0.15;
            return raiseSalary;
        }
    }
    void print(){
        System.out.println("İsim: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Haftalık Çalışma Saati: " + this.workHorus);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        tax();
        bonus();
        raiseSalary();
        double x = this.salary + (bonusSbt() - taxSbt());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + x + " TL");
        double y = x + raiseSalarySbt();
        System.out.println("Toplam Maaş: " + y + " TL");
    }
}
