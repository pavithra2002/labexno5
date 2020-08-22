/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance1;

/**
 *
 * @author PAVITHRA T
 */
public class display1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        degree obj = new degree();
        obj.getdegree();
        UnderGraduate obj1 = new UnderGraduate();
        obj1.getdegree();
        postGraduate obj2 = new postGraduate();
        obj2.getdegree();
    }
}
class degree
{
    public void getdegree()
    {
        System.out.println("I got a degree");
    }
}
class UnderGraduate extends degree
{
    public void getdegree()
    {

        System.out.println("Iam a undergraduate");
    }
}
class postGraduate extends degree
{
    public void getdegree()
    {
        System.out.println("Iam a postgraduate");
    }
}
    
    

