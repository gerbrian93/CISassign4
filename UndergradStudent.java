

public class UndergradStudent extends Student2 {
 
 private boolean isTransfer;
 
 
 public UndergradStudent(String name, int idNum, float gpa, boolean isTransfer) {
      super(name, idNum, gpa);
       this.isTransfer = isTransfer;
 }




      public void printStudent() {
         super.printStudent();//calls superclass method and prints below statements
         System.out.println("Transfer Student: "+isTransfer+"");
         System.out.println("");
      }


}