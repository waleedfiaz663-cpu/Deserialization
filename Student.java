import java.io.Serializable;

public class Student implements Serializable {
    
    String name;
    int age;
    
public Student(String name,int age){
    
    this.name=name;
    this.age=age;
    
}    

public String toString(){
    
    return "Name : " +name+ "\n age :" +age;
    
}
    
}
