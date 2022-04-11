import java.io.File;

public class programe21 {
    public static void main(String[] args) {
        try{
            File file = new File("F:\\Java\\Assignments\\src");

            File[] files = file.listFiles();//create the list of file

            for(File folder : files){
                if(folder.isFile()){
                    System.out.println(folder);
                }
            }
        }catch(Exception e){
            e.getStackTrace();
        }
    }
}
