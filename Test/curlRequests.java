package PrepDSA.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: sonali.shakya
 */
public class curlRequests {
    public static void main(String[] args) {
        List<String> suborders = new ArrayList<>();
        suborders.add("7836r98304r");
        for (String s : suborders) {
            System.out.println("curl --location 'http://10.100.49.191:8080/service/shipping/cancelShipment' \\\n" +
                    "--header 'Content-Type: application/json' \\\n" +
                    "--header 'Cookie: SCOUTER=x2vi31oehgupj0' \\\n" +
                    "--data '{\n" +
                    "\t\"responseProtocol\": \"PROTOCOL_JSON\",\n" +
                    "\t\"requestProtocol\": \"PROTOCOL_JSON\",\n" +
                    "\t\"suborderCode\": \""+s+"\",\n" +
                    "\t\"reasonCode\":\"POSTSHIP_CUSTOMER_CANCELLATION\"\n" +
                    "}'");
        }
    }
}
