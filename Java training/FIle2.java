import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.Exception;
class File2{
    public static void main(String args[]) throws Exception{
        //Same you can do with image (No change in code), video,audio
        //Eg:- FileInputStream fis=new FileInputStream("C:\\Users\\91884\\OneDrive\\Desktop\\img.jpg");
        //     FileOutputStream fos=new FileOutputStream("C:\\FileHandling\\New\\Newimg.jpg");
        //All other thing remains same
        FileInputStream fis=new FileInputStream("C:\\Users\\91884\\OneDrive\\Desktop\\Myfile.txt");
        FileOutputStream fos=new FileOutputStream("C:\\FileHandling\\New\\NewFile.txt");
        int i;
        while((i=fis.read())!=-1){
            fos.write(i);
        }
        fis.close();
        fos.close();
    }
}