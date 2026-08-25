import java.io.*;

public class Main {
    
    public static void main(String[]args){
        
        try{
            
            Student S = new Student("Waleed",23);
            
            Student S1 =new Student("Ahsan",22);
            
            FileInputStream fis = new FileInputStream("C:/Users/Administrator/OneDrive/Desktop/Student.Ser");
            
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            Student s = (Student) ois.readObject();
            
            Student s1 = (Student) ois.readObject();
            
            ois.close();
                    
        }
    
        catch(Exception e){
            
            System.out.println(e.getMessage());
            
        }
    
}
    
}
