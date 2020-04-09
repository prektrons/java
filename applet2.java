 
 import java.applet.Applet;
 import java.awt.*;
public class Lifecycle extends Applet
{
public void init()
{
System.out.println("Initialized");
}
public void start()
{
System.out.println("Applet satarted");
}
public void paint(Graphics g)
{
System.out.println("Paint invoked");
}
public void stop()
{
System.out.println("Initialized");
}
public void destroy()
{
System.out.println("destroy");
}
}
/*<applet code="Lifestyle.class"
width="200" height="200">
</applet>*/
