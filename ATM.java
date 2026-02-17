import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ATM{
    public static void main(String[] args) throws Exception{
       System.out.println("Welcome to the ATM!");
       System.out.println("please choice an option:");
       System.out.println("1.check balance");
       System.out.println("2.deposit");
       System.out.println("3.make the withdrawal");
       BufferedReader reader = null;
       String option=null;
       try{
        reader = new BufferedReader(new InputStreamReader(System.in));
        option = reader.readLine();
        switch(option){
            case "1":
                Balance balance = new Balance();
                balance.balance();
                break;
                case "2":
                    Deposit deposit = new Deposit();
                    deposit.deposit();
                    break;
                    case "3":
                        Withdrawal withdrawal = new Withdrawal();
                        withdrawal.withdrawal();
                        break;
                        default:
                            System.out.println("invalid option");
        }
       }
       catch(Exception e){
        System.out.println(e.getMessage());
       }
       finally{
        
       }
      
    }
}