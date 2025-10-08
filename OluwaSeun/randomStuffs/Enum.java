import java.util.List;
import java.util.Scanner;

public class Enum {

    public enum GeopoliticalZone {
        NORTH_CENTRAL("North Central", List.of("Benue", "Kogi", "Kwara", "Nasarawa", "Niger", "Plateau", "Federal Capital Territory")),
        NORTH_EAST("North East", List.of("Adamawa", "Bauchi", "Borno", "Gombe", "Taraba", "Yobe")),
        NORTH_WEST("North West", List.of("Kaduna", "Kano", "Katsina", "Kebbi", "Sokoto", "Jigawa", "Zamfara")),
        SOUTH_EAST("South East", List.of("Abia", "Anambra", "Ebonyi", "Enugu", "Imo")),
        SOUTH_SOUTH("South South", List.of("Akwa Ibom", "Bayelsa", "Cross River", "Delta", "Edo", "Rivers")),
        SOUTH_WEST("South West", List.of("Ekiti", "Lagos", "Ogun", "Ondo", "Osun", "Oyo"));

        GeopoliticalZone(String... states){
        this.states = states;
        }

        private String[] states;

        public String[] getStates(){
            return states;
        }

        public String
    }


}
