import java.io.*;

public class lista
{
    public static void main(String[] args) throws IOException
    {
        PrintWriter list = new PrintWriter("lista.txt");
        
        list.println("1.Umyć sie");
        list.println("2.Umyć podłoge");
        list.println("3.Umyć dziadka");
        list.println("4.zjesc kebab w jeruzalem");
        list.println("5.odbyc wyrok w zkladzie karnym");

        
        list.close();
    }
}