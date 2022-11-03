//Creating Student class.
class Student
{ //field or instance variable
int id = 1;
String name= "Kanishak";
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1
{ //creating main method
public static void main(String args[]){
//creating an object of Student
Student s1=new Student();
//Printing values of the object
System.out.println(s1.id);
System.out.println(s1.name);
}
}