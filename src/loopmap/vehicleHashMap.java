package loopmap;
import java.util.*;

public class vehicleHashMap
{

    public static void main(String[] args)
    {
        HashMap <String,String> vehicles = new HashMap<>();
        
        vehicles.put("kia", "soul");
        vehicles.put("toyota", "camry");
        vehicles.put("jeep", "compass");
        vehicles.put("nissan","altima");
        
        System.out.println("What kind of car are you looking for?");
        Scanner input = new Scanner(System.in);
        String response = input.next().toLowerCase().strip();
        
        if (vehicles.containsValue(response))
        {
           String make = vehicles.get(response);
           String text = "You're looking for a "+ response +
                   "?\nOur "+ make +" selection is over here.";
           System.out.println(text);
           return;
        }
        else
        {
            System.out.println("\nI don't know what that is. Bye!");
            return;
        }
        

    }

}
