import java.io.*;
import java.lang.Exception;
public class FileExist {
    public static void main(String args[]) throws Exception{
        File obj=new File("C:\\Users\\91884\\OneDrive\\Desktop\\Hello.txt");
        if(obj.createNewFile()){
            System.out.println("File create succesfully");
        }
        else{
            System.out.println("File already exist");
            throw new Exception("Can not create a file");
        }
    }
}
