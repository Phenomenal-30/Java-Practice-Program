import java.io.File;
import java.lang.Exception;
import java.io.FileInputStream;
public class Inpur {
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\91884\\OneDrive\\Desktop\\Myfile.txt");
            int i;
            while((i=fis.read())!= -1){
                System.out.print((char) i);
        }

        }
        catch(Exception e){
            System.out.println(e);
        }
}

}