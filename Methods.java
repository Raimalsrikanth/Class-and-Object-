import java.util.Scanner;
Class Employee {
  int id;
  String name;
  float sel;
  Scanner s2;
 Public Employee(Scanner s1){
  s2=s1;
}
Public void setEmp1(){
   System.out.println("Enter ID:-");
   id=s2.nextInt();
   
   s2.nextLine();
   System.out.println("Enter name:-");
   name=s2.nextLine();
   
   System.out.println("Enter salary:-");
   sel=s2.nextFloat();
}
Public void display();

   System.out.println("ID="+id);
   System.out.println("Name="+name);
   System.out.println("Selary="+sel);
}
}
Class Mainclass{
  Public static void main (String a[]){
   Scanner s1=new Scanner (System.in);

  Employee obj=new Employee(s1);
  Obj.setEmp1();
  Obj.display();
}
}
