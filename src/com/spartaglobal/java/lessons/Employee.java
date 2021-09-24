package com.spartaglobal.java.lessons;

public class Employee extends Person2{
    private String department;
    private double salary;

    public void print(){
        System.out.println(
                firstName + " " + lastName + " "
                        + department + " (" + salary + ")");
    }


//    // commenting out the below will make the lastName read only
    // also not eneded anymore
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // negative salaries not allowed
        if (salary < 0.0) {
            return;
        }
        // salary increases limited to 10%
        if (this.salary != 0.0 && salary > 1.1 * this.salary) {
            return;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
