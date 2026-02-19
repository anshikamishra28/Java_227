// -1 means end of file
import java.io.FileOutputStream;
import java.io.IOException;
public class inputoutput {
    public static void main(String[] args) {
        try {
            FileOutputStream fos=new FileOutputStream("bytefile.txt");
            String data="hello java byte stream";
            byte[] byteData=data.getBytes();
            fos.write(byteData);
            fos.close();
            System.out.println("data written to file successfully");
        } catch (Exception e) {
            System.out.println("an error occurred "+e.getMessage());   
        }   
    }  
}
