package ebebekfirstcase;

public class Employee {

    private String name;
    public double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        super();
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public double getsalary() {
        return salary;
    }

    public void setsalary(double salary) {
        this.salary = salary;
    }

    public int getworkHours() {
        return workHours;
    }
    
    public void setworkHours(int workHours){
        this.workHours = workHours;
    }
    
    public int gethireYear(){
        return hireYear;
    }
    public void sethireYear(int hireYear){
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary >= 1000){
            double tax = salary*0.03;
            return tax;
        }
        return 0.0;
    }
    public double bonus(){
        if(this.workHours > 40){
            double bonus = (workHours - 40)*30;
            return bonus;
        }
        return 0.0;
    }
    public double raiseSalary(){
        int workedYear = 2021 - hireYear;
        double lastSalary;
        if(workedYear < 10){
            return (salary * 0.05);      
        }else if(9 < workedYear && workedYear < 20){
            return salary * 0.1;    
        }else if (workedYear > 19) {
            return salary * 0.15;    
        }
        return 0.0;
    }
    public void toString(Employee emp){
        
        System.out.println("Name : " + this.name +"\nSalary : " + this.salary + "\nWork Hours : " + this.workHours +
                "\nHire Year : " + this.hireYear + "\nTax : " + emp.tax() + "\nBonus : "+ emp.bonus() + 
                "\nRaise Salary : " + emp.raiseSalary()+ "\nTotal Salary with Tax and Bonus : " + (emp.salary + emp.bonus() - emp.tax())  
                +"\nTotal Salary : " + (emp.salary + emp.bonus()) + "\n");
    }

}