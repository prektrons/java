class NameInvalid extends Exception
{
}
class Employee
{
String name;
Employee(String n)
{
try
{
name=n;
for(int i=0;i<name.length();i++)
{	
if(Character.isDigit(name.charAt(i)))
throw new NameInvalid();
}
}
catch(NameInvalid e)
{
System.out.println("Name is invalid");
}
}
void display()
{
System.out.println("name is "+name);
}
public static void main(String str[])
{
Employee e=new Employee("ABC");
e.display();

Employee e1= new Employee("1AB2");
e1.display();
}
}