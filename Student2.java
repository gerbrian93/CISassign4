

public class Student2 {

   private String name;
   private int idNum;
   private float gpa;

      
      public Student2(){
      
      }
      
      
      
      
      public Student2(String name, int idNum, float gpa) {
         this.name = name;
         this.idNum = idNum;
         this.gpa = gpa;
      }
      
      public void printStudent() {
       System.out.println("Name = "+name+"\nID = "+idNum+"\nGPA = "+gpa+"");
        }
       
       public int getID() {
         return idNum;
       }
      
        } 