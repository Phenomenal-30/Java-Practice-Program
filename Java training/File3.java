import java.io.FileReader;
import java.io.FileWriter;
import java.lang.Exception;
//No change in text file but you cannot use image file in this library
//In case of any other language other than english it will not write the data in new file(Large data)
class File3{
    public static void main(String args[]) throws Exception{
        FileReader fr=new FileReader("C:\\Users\\91884\\OneDrive\\Desktop\\Myfile.txt");
        FileWriter fw=new FileWriter("C:\\FileHandling\\New\\NewFile1.txt");
        int i;
        while((i=fr.read())!=-1){
            fw.write(i);
        }
        fr.close();
        fw.close();
    }
}