package unit2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
public class charWriteExample {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("charfile.txt");
            int data;
            while( (data=fr.read())!=-1){
                System.out.print((char)data);
            }
            fr.close();
            
        } catch (Exception e) {
           System.out.println("error:"+e.getMessage());
        }
    }
    
}
