class Complex {
  
int real;
int imaginary;

Complex(int r,int i) {
this.real = r;
this.imaginary = i;
}

public void show() {
System.out.println(this);
}

//Overriding toString method to control print of object in show()
@Override
public String toString() {
return (this.real + " + " + this.imaginary + "i");
}

//The type of function is "Complex"(class) object type
public static Complex add(Complex obj1,Complex obj2) {
int realsum = obj1.real + obj2.real;
int imaginesum = obj1.imaginary + obj2.imaginary;
return new Complex(realsum,imaginesum);
/* this return statement initialises the "Complex(int r,int i)"
   constructor creating a new object with sum values as their real and imaginary values
   
*/
}
/*
Why the add() method is static in this case?

The add() method is a utility function. It doesn’t operate on the properties of a specific instance of the 
Complex class but instead takes two external Complex objects and returns a new one. Since it doesn’t need to access any instance-specific data (fields of a particular object), it can be made static.
Example:

*/
public static void main(String[] args) {

Complex c1 = new Complex(8,10);
Complex c2 = new Complex(5,11);
Complex result = Complex.add(c1,c2);
result.show();
}
}
//Link: https://www.geeksforgeeks.org/java-program-to-add-two-complex-numbers/
