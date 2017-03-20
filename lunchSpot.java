import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;

/**
 * Created by Psambaraju on 07-02-2017.
 */
public class lunch {
    private static String returnClass(){
        double rand = Math.random();
        if(rand<=0.6){
            return "0";
        } else if(rand<=0.9){
            return "1";
        }else {
            return "2";
        }
    }
    private static int returnRandom(int max){
        int range = Math.abs(max) + 1;
        return (int)(Math.random() * range) + (0 <= max ? 0 : max);
    }
    public static void main(String[] args) {
 /*     String[] hotels = new String[]{"Rasganga", "Adigas", "Aggarwals", "Spicy Kitchen", "Leon Grill"};
        List lunch = (List) Arrays.asList(hotels);
        Collections.shuffle(lunch);
        System.out.println(lunch.get(0));
        System.out.println(Math.random());*/
        List lunchHistory = new ArrayList();/*need help*/
        String hotel;
        String normalHotels[] = new String[]{"Rasganga","Adigas"};
        String moderateHotels[] = new String[]{"Aggarwals","Spicy Kitchen","Leon Grill","Subway"};
        String costlyHotels[] = new String[]{"Punjabi Rasoi","The Bakers"};
        String hotelClass = returnClass();
        switch (hotelClass){
            case "0":   hotel = normalHotels[returnRandom(normalHotels.length-1)];
                        /* Add code to check if same hotel is visited more than 3 times in last 7 days */
                lunchHistory.add(hotel);
                System.out.println(hotel);
                break;
            case "1":   hotel = moderateHotels[returnRandom(moderateHotels.length-1)];
                        /* Add code to check if visited more than 2 times in last 7 days */
                lunchHistory.add(hotel);
                System.out.println(hotel);
                break;
            case "2":   hotel = costlyHotels[returnRandom(costlyHotels.length-1)];
                        /* Add code to check if visited more than 1 time in last 7 days */
                lunchHistory.add(hotel);
                System.out.println(hotel);
                break;
            default:    System.out.println("Dude, you entered default. This ain't working!!!");
                break;
        }
        System.out.println(lunchHistory);
    }
}