package PrepDSA.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author: sonali.shakya
 */
public class dateToEpochTime {
    public static void main(String[] args) {
        String str = "2023-10-12 16:38:50";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long epoch = 0;
        try {
            epoch = df.parse(str).getTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        System.out.println(epoch);

        //String null check fails, empty check passed
        String str1 = "";
        if (str1.isEmpty())
            System.out.println("Here");

        System.out.println(System.currentTimeMillis());


        BigDecimal handlingCharges = BigDecimal.valueOf(0.0);
        System.out.println(handlingCharges.compareTo(BigDecimal.ZERO) < 0);
    }
}
