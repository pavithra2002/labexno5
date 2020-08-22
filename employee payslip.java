/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance1;
import java.util.*;

/**
 *
 * @author PAVITHRA T
 */
public class emp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int choice;
        do{
            System.out.println("enter \n1 for Programmer payslip\n2 for AssociateProfessor payslip\n3 for AssistantProfessor payslip\n4 for Professor payslip\n");
            Scanner obj=new Scanner(System.in);
            choice=obj.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter basic pay");
                    double bp1=obj.nextDouble();
                    Programmer p=new Programmer(bp1);
                    p.display();
                    break;
                case 2:
                    System.out.println("enter basic pay");
                    double bp2=obj.nextDouble();
                    AssociateProfessor ap=new AssociateProfessor(bp2);
                    ap.display();
                    break;
                case 3:
                    System.out.println("enter basic pay");
                    double bp3=obj.nextDouble();
                    AssistantProfessor assp=new AssistantProfessor(bp3);
                    assp.display();
                    break;
                case 4:
                    System.out.println("enter basic pay");
                    double bp4=obj.nextDouble();
                    Professor pro=new Professor(bp4);
                    pro.display();
                    break;
                default :
                    
                    System.out.println("enter 1 or 2 or 3 or 4");
                    break;
            }
            System.out.println("enter 1 to continue 0 to exit");
            
            choice=obj.nextInt();
            
        }while(choice==1);
    }
    
}
class employee{
    
    String emp_name,address,mail_id;
    int emp_id;
    long mobile_no;
    employee(){
        System.out.println("Enter employee details");
        Scanner obj=new Scanner(System.in);
        System.out.println("enter employee name");
        emp_name=obj.next();
        System.out.println("enter employee id");
        emp_id=obj.nextInt();
        System.out.println("enter employee address");
        address=obj.next();
        System.out.println("enter employee mailid and mobileno");
        mail_id=obj.next();
        mobile_no=obj.nextLong();
    }
    public void slip(double n){
        
        double DA=n*(97f/100);//DA
        double HRA= n*(10f/100f);//HRA
        double PF = n*(12f/100f);//PF
        double SCF= n*(0.1f/100f);//staff club fund
        System.out.println("net salary of the employee"+(DA+HRA));
        System.out.println("gross salary of the employee"+(DA+HRA+PF+SCF));
        //display alll content
    }
    
}
class Programmer extends employee{
    double basicpay;
    Programmer(double bp){
        basicpay=bp;
    }
    void display(){
       System.out.println("Programmer details\n");
      System.out.println("employee name:"+emp_name+"\n"+"employee id:"+emp_id+"\n"+"employee address:"+address+"\n"+"employee mailid:"+mail_id+"\n"+"employee mobileno:"+mobile_no);
      super.slip(basicpay);
  }

    
    
}
class AssociateProfessor extends employee{
   double basicpay;
  AssociateProfessor(double bp){
      basicpay=bp;
      
  }
  void display(){
      System.out.println("payslip of AssociateProfessor details\n");
       System.out.println("employee name:"+emp_name+"\n"+"employee id:"+emp_id+"\n"+"employee address:"+address+"\n"+"employee mailid:"+mail_id+"\n"+"employee mobileno:"+mobile_no);
      super.slip(basicpay);
  }

} 

class AssistantProfessor extends employee{
 double basicpay;
 AssistantProfessor(double bp){
     basicpay=bp;
     
 }
 void display(){
     System.out.println("payslip of AssistantProfessor details\n");
       System.out.println("employee name:"+emp_name+"\n"+"employee id:"+emp_id+"\n"+"employee address:"+address+"\n"+"employee mailid:"+mail_id+"\n"+"employee mobileno:"+mobile_no);
      super.slip(basicpay);
  }
    
}
class Professor extends employee{
  double basicpay;
    Professor(double bp){
       basicpay=bp;
    }
    void display(){
        System.out.println("payslip of Professor details\n");
       System.out.println("employee name:"+emp_name+"\n"+"employee id:"+emp_id+"\n"+"employee address:"+address+"\n"+"employee mailid:"+mail_id+"\n"+"employee mobileno:"+mobile_no);
      super.slip(basicpay);
  }
  
}