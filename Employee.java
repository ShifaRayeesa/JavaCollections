import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Employee {
    Stack<EmployeeDetails> employeeDetails=new Stack<>();
    public void addDetails(EmployeeDetails details)
    {
        employeeDetails.push(details);
    }

    public void display()
    {
        for(EmployeeDetails i:employeeDetails)
        {
            System.out.println(i.getEmployeeId()+"\n"+i.getName()+"\n"+i.getDesignation());
        }
    }

    public void popOperation()
    {
         if(employeeDetails.isEmpty()) System.out.println("Stack is empty");
         else
            employeeDetails.pop();
    }

    public void getPeek()
    {
        System.out.println(employeeDetails.peek().getEmployeeId());
        System.out.println(employeeDetails.peek().getName());
        System.out.println(employeeDetails.peek().getDesignation());
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int option;
        EmployeeDetails empObj;
        Employee emp=new Employee();

        do{
            System.out.println("Enter your choice\n1.Push\n2.View Stack\n3.Pop\n4.Recent Registration\n0.Back");
            option=sc.nextInt();
            sc.nextLine();

            switch (option)
            {
                case 1://PUSH
                    emp.addDetails(new EmployeeDetails());
                    break;

                case 2://View
                    emp.display();
                    break;

                case 3://pop
                    emp.popOperation();
                    break;

                case 4://recently joined
                    emp.getPeek();
                    break;
            }

        }while(option!=0);
    }
}

class EmployeeDetails{
    Scanner sc=new Scanner(System.in);
    int employeeId;
    String name;
    String designation;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setEmployeeId() {
        System.out.println("Employee Id : ");
        this.employeeId = sc.nextInt();
        sc.nextLine();
    }

    public void setName() {
        System.out.println("Employee name : ");
        this.name = sc.nextLine();
    }

    public void setDesignation(){
        System.out.println("Employee Designation : ");
        this.designation = sc.nextLine();
    }

    EmployeeDetails()
    {
        this.setEmployeeId();
        this.setName();
        this.setDesignation();
    }

}