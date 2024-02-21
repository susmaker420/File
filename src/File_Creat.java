import java.io.File;
import java.io.IOException;



public class File_Creat {


    public static void main(String[] args) {
        try {
            File obj = new File("hitta_mig");
            if (obj.createNewFile()) {
                System.out.println("filen skappades" + obj.getName());
            }else{
                System.out.println("filen existerar redan");
            }

        }catch (IOException e){
            System.out.println("ett fel har uppstått");
            e.printStackTrace();

        }



    }




}

