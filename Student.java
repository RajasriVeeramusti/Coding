import java.util.Scanner;
class Student
{
int id;
String name;
void display(){
System.out.println("ID: "+id+", Name: "+name);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Student student=new Student();
System.out.println("Enter student ID: ");
student.id=sc.nextInt();
sc.nextLine();
System.out.println("Enter student Name: ");
student.name=sc.nextLine();
student.display();
}
}

