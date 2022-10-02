class HelloWorld {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Kerim Celik", 8000, 100, 2050);
        emp.tax();
        emp.bonus();
        emp.raiseSalary();
        System.out.println(emp.toString());
    }
}

class Employee{
    String name;
    int salary;
    int workHours;
    int hireYear;
    
    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    
    public void tax(){
        if(this.salary > 1000){
            this.salary -= (this.salary * 3) / 100;
        }
    }
    
    public void bonus(){
        if( this.workHours > 40 ){
            this.salary += ( this.workHours - 40 ) * 30;
        }
    }
    
    public void raiseSalary(){
        int year = hireYear - 2021;
        if( year < 10 ){
            this.salary += (this.salary * 5) / 100;
        }else if( year > 9 && year < 20 ){
            this.salary += (this.salary * 10) / 100;
        }else if( year > 19 ){
            this.salary += (this.salary * 15) / 100;
        }
    }
    
    public String toString(){
        return "Ad Soyad :" + this.name+"\n"+ "Maas : " + this.salary + "\n"+ "Haftalik Calisma Saati: " + this.workHours+"\n"+ "Ise baslangic yili : " + this.hireYear;
    } 
    
}
