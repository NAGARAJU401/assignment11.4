package Session11;
//package : Package is name that organizes a set of related classes and interfaces similar to 
///here I have created a package as Session11
import java.io.IOException;
public class ExceptionDemo {
	//public : members which can access as public,public members are visible to all other classes.
		//class : is a context of java that are used to create objects and to define object data types and methods.
		//classes are the basics of opps(object oriented programming)
	void show() throws ArithmeticException {//void as no return type or value
        //throws airthemeticException
System.out.println("parent class");
//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
}
}

class Child extends ExceptionDemo {//extends class ExceptionDemo
void show() throws IOException {      		//Compile time Error  	  

System.out.println("child class");
//system : is a class in java language pacakge.
		//out : static member of the system class.
		//println : to print what is output.
} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Public is a keyword that is used as an access modifier for methods and variables.
		//static used to prepare a field,method or inner classes as a class field.
		//void: it is void if the method does not return a value.
		//main:it is a function name When a program starts running, it has to start execution from somewhere.				
	//String[] args: it is  defining a String array to pass arguments at command line. args is the variable name of the String array.
		 try {
			   ExceptionDemo sub=new Child();//taking new child
			      sub.show();//compile time error
			   }
			  catch(Exception e){
	}

}
}