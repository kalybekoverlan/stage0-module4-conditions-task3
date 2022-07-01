package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        double consumed;
        if(salary == 0)
            System.out.println("wrong input!");
        else if (salary <= 10000)
            consumed = salary * 15 / 100;
        else if (salary <= 20000)
            consumed = salary * 18 / 100;
        else if (salary > 20000)
            consumed = salary * 20 / 100;

    }
}
