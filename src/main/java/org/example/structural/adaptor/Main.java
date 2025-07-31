package org.example.structural.adaptor;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(30);
        person.setName("Tom");
        Employee employee = new EmployeeAdaptor(person);
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeAge());

    }
}
