/**
 * Created by Roman on 30.05.2016.
* modify today
 * modifyed for git test
 */
public class KbIn {
    public static void main (String... args)
        throws java.io.IOException
    {
     char ch;
        System.out.println("Press any key");
        do
            {
                ch = (char) System.in.read();
                System.out.print(ch);
            }
        while(ch!='\r'&&ch!='\n');
    }
}
