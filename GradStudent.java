

public class GradStudent extends Student2 {
 
 private String college;
 
 
 public GradStudent (String name, int idNum, float gpa, String college) {
      super(name, idNum, gpa);
      this.college = college;
 
 }


   public void printStudent() {
   super.printStudent();//calls superclass method as well as prints below statements
    System.out.println("College for Undergrad: "+college+"");
    System.out.println("");
   }

}