package unit2;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class bytedata {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("bytefile.txt"); // jvm activate
            int data;
            while( (data=fis.read())!=-1){
                System.out.print((char)data);
            }
            fis.close();
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
          
        }
    }

    
}
