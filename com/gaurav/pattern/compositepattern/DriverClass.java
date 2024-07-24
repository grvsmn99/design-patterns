package com.gaurav.pattern.compositepattern;

public class DriverClass {
    public static void main(String[] args) {
        Developer dev1 = new Developer(100, "John Doe");
        Developer dev2 = new Developer(101, "Jane Smith");

        CompanyDirectory devDirectory = new CompanyDirectory();
        devDirectory.addEmployee(dev1);
        devDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Mike Brown");
        Manager man2 = new Manager(201, "Sara Johnson");

        CompanyDirectory manDirectory = new CompanyDirectory();
        manDirectory.addEmployee(man1);
        manDirectory.addEmployee(man2);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(devDirectory);
        companyDirectory.addEmployee(manDirectory);

        companyDirectory.showEmployee();
    }
}
