
package employee;

import java.util.Scanner;
public class Employee {
     String name,address;
        float salary;
        int yof;
        public void getInput(){
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER name");
        name =sc.next();
        System.out.println("ENTER EMPLOYEE salary");
        salary = sc.nextFloat();
         System.out.println("ENTER EMPLOYEE yof");
         yof = sc.nextInt();
         System.out.println("ENTER EMPLOYEE address");
         address = sc.next();
        }
        public void display(){
            System.out.println("employee name="+ name);
                    System.out.println("employee salary="+ salary);
                            System.out.println("employee yof="+ yof);
                            System.out.println("employee address="+ address);
            
        }
    public static void main(String[] args) {
        Employee e[] = new Employee[4];
        for(int j=0;j<3;j++){
            e[j]=new Employee();
            e[j].getInput();
        }
        System.out.println("EMLOYEE DETAILS");
        for(int j=0;j<3;j++){
            e[j].display();
        }
     System.out.println();
    }
    
}
