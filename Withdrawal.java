import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Withdrawal {
    public void withdrawal() throws Exception{
        String id_card=null;
        BufferedReader bfr = null;
        String amount=null;
        Path path = Paths.get("Fichier/withdrawal.csv");
        Charset charset = Charset.forName("UTF-8");
        BufferedWriter bfw = null;
        try {
            bfr = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Insert the ID card:");
            id_card=bfr.readLine();
            System.out.println("Insert the amount to withdraw:");
            amount = bfr.readLine();
            LocalDateTime now = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
             String formattedDateTime = now.format(formatter);
            bfw = Files.newBufferedWriter(path, charset , StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            bfw.write(id_card + "| " + amount + " |" + formattedDateTime);
            bfw.newLine();
            System.out.println("Withdrawal successfull!");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        
        }
         finally {
          
        }
         bfr.close();
         bfw.close();
       
    }
}
