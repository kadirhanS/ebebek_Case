public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public int tax() {
        if (salary >= 1000) {
            return (salary * 3) / 100;
        }
        return 0;
    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public int raiseSalary() {
        if (2021 - hireYear < 10) {
            return ((salary + tax() + bonus()) * 5) / 100;
        } else if (2021 - hireYear > 9 && 2021 - hireYear < 20) {
            return ((salary + tax() + bonus()) * 10) / 100;
        } else {
            return ((salary + tax() + bonus()) * 15) / 100;
        }
    }

    @Override
    public String toString() {
        return "Employee:\n" +
                " Name = '" + name + "',\n" +
                " Salary = " + salary + ",\n" +
                " Work hours = " + workHours + ",\n" +
                " Hire year = " + hireYear + ",\n" +
                " Tax = " + tax() + ",\n" +
                " Bonus = " + bonus() + ",\n" +
                " Salary raise = " + raiseSalary() + ",\n" +
                " Salary with tax and bonuses = " + (salary - tax() + bonus()) + ",\n" +
                " Total salary = " + (salary + bonus());
    }
    
    //employee class'inda bir takim degisiklikler yapıldı
}
