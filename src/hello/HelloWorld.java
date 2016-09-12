package hello;

/**
 * Created by Roman on 29.05.2016.
 */
public class HelloWorld {
    public static void main (String ... argc )
        {
          System.out.println("Hello fucken world "+argc[0]);
            char testByte=0x50;
            System.out.println("Тест байт = "+testByte);
            boolean bool=1<0;
            byte binaryData=0b00001111;
            binaryData=(byte)(~0xA0);
            System.out.println(binaryData);
            System.out.println(BoolToInt(10>2));
        }
private static int BoolToInt(boolean bool)
    {

       if (bool) return 1;
        else return 0;

    }
}
