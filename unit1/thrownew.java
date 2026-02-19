import java.io.*;


public class thrownew {

    static void readFile() throws IOException{
        FileReader fr=new FileReader("text.txt");
        System.out.println("file open");

    }

    // throw - single exception handle , unchecked , works like method signature , single exception
    // throws - multiple, need object creation , checked , works like method block , tells many exceptions will come
    // 

    public static void main(String[] args) {
        // try{
        //     throw new ArithmeticException();

        // }catch(ArithmeticException e){
        //     e.printStackTrace();

        // }

        try{
            readFile();
        }catch (IOException e){
            System.out.println("exception handled : "+e.getMessage());

            // exception handled : text.txt (The system cannot find the file specified)


        }
        
    }
    
}
