package EmployeeSalary;
import java.util.Scanner;
class Salary{
    String emp_name,address,mail,phone,emp_id,Programmer,designation;
    double bp,da,hra,gp,pf,staff,np;
    public void input(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Employee Name : ");
        emp_name=scan.nextLine();
        System.out.print("Employee id   : ");
        emp_id=scan.nextLine();
        System.out.print("Mail id       : ");
        mail=scan.nextLine();
        System.out.print("Mopile Number : ");
        phone=scan.nextLine();
        System.out.print("Basic Pay     : ");
        bp=scan.nextDouble();
    }
    public void output(){
        System.out.println("Employee Name      : "+emp_name);
        System.out.println("Employee id        : "+emp_id);
        System.out.println("Address            : "+address);
        System.out.println("Mail ID            : "+mail);
        System.out.println("Mobile No          : "+phone);
        System.out.println("Designation        : "+designation);
        System.out.println("Basic Pay          : "+bp);
        System.out.println("Employee DA        : "+da);
        System.out.println("Employee HRA       : "+hra);
        System.out.println("Employee PF        : "+pf);
        System.out.println("Staff Club Fund    : "+staff);
        System.out.println("Gross Salary       : "+gp);
        System.out.println("Net Salary         : "+np);
       
    }
}
   
class Programmer extends Salary{
   
    Programmer(){
    designation="Programmer";
    }
   
    public void programmerSalary(){
    da=bp*0.97;
    hra=bp*0.10;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.01;
    np=gp-(pf+staff);
    }
}

class AssistantProfessor extends Salary{
   
    AssistantProfessor(){
    designation="Programmer";
    }
   
    public void programmerSalary(){
    da=bp*1.1;
    hra=bp*0.20;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.05;
    np=gp-(pf+staff);
    }
}

class AssociateProfessor extends Salary{
    AssociateProfessor(){
    designation="Programmer";
    }
    public void programmerSalary(){
    da=bp*1.3;
    hra=bp*0.30;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.10;
    np=gp-(pf+staff);
    }
       
    }
class Professor extends Salary{
    Professor(){
    designation="AssitantProfessor";
    }
    public void programmerSalary(){
    da=bp*1.4;
    hra=bp*0.40;
    gp=bp+da+hra;
    pf=bp*0.12;
    staff=bp*0.15;
    np=gp-(pf+staff);
    }
       
    }
public class EmployeeSalary{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("1 - Programmer \n 2 - Assistant Professor \n 3 - Associate Professor \n 4 - Professor");
        System.out.println("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                Programmer pg=new Programmer();
                pg.input();
                pg.programmerSalary();
                pg.output();
                break;
               
            case 2:
                AssistantProfessor asp=new AssistantProfessor();
                asp.input();
                asp.programmerSalary();
                asp.output();
                break;
               
            case 3:
                AssociateProfessor aop=new AssociateProfessor();
                aop.input();
                aop.programmerSalary();
                aop.output();
                break;
               
            case 4:
                Professor p=new Professor();
                p.input();
                p.programmerSalary();
                p.output();
                break;
           
            default:
                System.out.print("Invalid Input");
        }
       
    }
}
