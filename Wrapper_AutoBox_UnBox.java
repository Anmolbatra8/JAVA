public class Main {
  public static void main(String[] args) {
 
//A Wrapper class is a Java class whoose objects contains(wraps) a primitive data type value

//Ex: primitive dtype: char
// Wrapper Class: Character
 
 //Autoboxing is the autmatic conversion of primitive dtypes into object of their corresponding Wrapper classes
 //Ex: int-> Integer 
 char ch = 'z';
 Character Wcharobj = ch;
 System.out.println("Autoboxed Character: "+ Wcharobj);

    
 //Unboxing: automatic conversion of object of wrapper class into correspnding primitive data type
 //Ex: Integer -> int
 Character mobj = 'L';
 char Pm = mobj;
 System.out.println("Unboxed char from Charatcer: " + Pm);
 
 //Wrapping and Unwrappng
 
 //wrapping around Integer object:
 int num = 8;
 Integer intobj = new Integer(num);
 //Siimilar way for :
 //float -> Float
 //double -> Double
 //byte -> Byte
 System.out.println("Wrapped Integer object: "+ intobj);

    
 // Unwrapping Objects into Primitive Data Types
 int pint = intobj;
 System.out.println("Unwrapped int data type: "+ pint);
  }
}
