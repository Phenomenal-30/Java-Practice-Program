import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Exception;
class File1{
    public static void main(String args[]) throws Exception{
        FileInputStream fis=new FileInputStream("C:\\Users\\91884\\OneDrive\\Desktop\\Myfile.txt");
        int i;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }
        fis.close();
    }
}