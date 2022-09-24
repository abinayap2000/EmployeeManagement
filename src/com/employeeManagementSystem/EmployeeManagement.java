package com.employeeManagementSystem;
	import java.util.ArrayList;
	import java.util.*;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Scanner;

//	public class Main {
	public class EmployeeManagement {

	    static ArrayList<Employee> employeeList = new ArrayList<>();
	    static List<String> ename = Arrays.asList(new String[] {"aasd", "adssad", "sfdsdf", "dgfdfgd", "asudu", "adsasd", "fgdgfd"});
	    static Scanner ins;
	    public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) {
	        	
	            employeeList.add(new Employee(i, (int) ((i * Math.random()) * 5000), 18 + 1, getName() + " " + getName()));
	        }
	        System.out.println(employeeList);
	        ins = new Scanner(System.in);
	        String name = "";
	        while (!name.equals("4")) {
	            System.out.print("Choose Option\n" +
	                    "1)List All Employees\n" +
	                    "2)List Employees by Descending Order of Name\n" +
	                    "3)Update Salary\n" +
	                    "4)Exit\n");
	            name = ins.next();
	            switch (name) {
	                case "1":
	                    showAllEmployees(employeeList);
	                    break;
	                case "2":
	                    showAllEmployeesDesc(employeeList);
	                    break;
	                case "3":
	                    updateSalary();
	                case "4":
	                    break;
	            }
	        }
	    }

	    private static void updateSalary() {
	        System.out.println("Please Enter Employee Number - ");
	        String empNos = ins.next();
	        System.out.println("Please Enter New Salary - ");
	        String newSalary = ins.next();

	        for (int i = 0; i < employeeList.size(); i++) {
	            Employee employee = employeeList.get(i);
	            if ((employee.id) == Integer.parseInt(empNos)) {
	                System.out.println("Old Employee Details - " + employee);
	                employee.setSalary(Integer.parseInt(newSalary));
	                employeeList.set(i, employee);
	                System.out.println("New Employee Details - " + employee);
	            }
	        }
	    }

	    private static String getName() {
	        return ename.get((int) (Math.random() * ename.size() - 1));
	    }

	    private static void showAllEmployeesDesc(ArrayList<Employee> employeeList) {
	        employeeList.sort(Comparator.comparing(o -> o.name));
	        showAllEmployees(employeeList);
	    }

	    private static void showAllEmployees(ArrayList<Employee> employeeList) {
	        employeeList.iterator().forEachRemaining(employee -> System.out.println(employee + "\n"));
	    }

	    public static class Employee {
	        @Override
	        public String toString() {
	            return String.format("ID - %s, Name = %s, Age - %s, Salary = %s", id + "", name + "", age + "", salary + "");
	        }

	        public Employee(int id, int salary, int age, String name) {
	            this.id = id;
	            this.salary = salary;
	            this.age = age;
	            this.name = name;
	        }

	        int id, salary, age;
	        String name;

	        public int getId() {
	            return id;
	        }

	        public void setId(int id) {
	            this.id = id;
	        }

	        public int getSalary() {
	            return salary;
	        }

	        public void setSalary(int salary) {
	            this.salary = salary;
	        }

	        public int getAge() {
	            return age;
	        }

	        public void setAge(int age) {
	            this.age = age;
	        }

	        public String getName() {
	            return name;
	        }

	        public void setName(String name) {
	            this.name = name;
	        }
	    }
	
	

}


