package org.example.structural.adaptor;

public class EmployeeAdaptor extends Employee{

    private Person person;

    public EmployeeAdaptor(Person person){
        this.person = person;
    }
    @Override
    public String getEmployeeName() {
        return person.getName();
    }

    @Override
    public int getEmployeeAge() {
        return person.getAge();
    }

}
