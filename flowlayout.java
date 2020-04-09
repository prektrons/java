import java.awt.*;
public class demop extends Frame
{
TextField tf;
demop()
{
tf=new TextField(30);
add(tf);
setSize(300,400);
setLayout(new FlowLayout());
setVisible(true);
}
public static void main(String str[])
{
new demop();
}}
