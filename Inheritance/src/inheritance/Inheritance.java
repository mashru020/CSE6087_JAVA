
package inheritance;
public class Inheritance {
    public static void main(String[] args) {
        Student s1,s2;
        Employee e1,e2;
        
//        Inheritance property
        s1=new Student("mashru", 28,012222013, 3.01 );
        e1=new Employee("mashru", 28, 000375);

        s1.display();
        e1.display();
        
//        Polymorphism
        Person p1,p2;
        
        p1 = new Student("persion Student", 20,012222012, 2.01 );
        p2 = new Employee("Persion Employee", 25, 000275);
        
        
        System.out.println("============================");
        p1.display();
        p2.display();
        
        int ID1 = p1.getId();
        System.out.println("ID of Student = " + ID1);
    }
    
}
