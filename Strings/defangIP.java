package PrepDSA.Strings;

/**
 * @author: sonali.shakya
 */
public class defangIP {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    static String defangIPaddr(String address) {
        String updatedIP = "";
        for (int i = 0; i < address.length() ; i++) {
            if (address.charAt(i) == '.') {
                updatedIP = updatedIP + "[.]";
            } else {
                updatedIP = updatedIP + address.charAt(i);
            }
        }
        return updatedIP;
    }
}
