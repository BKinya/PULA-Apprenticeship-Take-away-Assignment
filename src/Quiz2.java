/**
 * Write a program that takes a string and checks whether it is a valid IPv4 address. The program
 * should return a boolean. Do not use regular expressions
 */
public class Quiz2 {

    public static void main(String[] args){
        System.out.println(isValidIPv4("192.168.10.10"));
        System.out.println(isValidIPv4("192.168.10."));

    }

    /**
     * @param address
     * @return a valid ipv4 address contains four integers ranging between 0 and 255
     * separated by (.) e.g. 192.168.17.10
     */
    public static boolean isValidIPv4(String address) {
        //split the address string into an array
        String[] mArray = address.split("\\.");
        //check that the provided address has four parts
        if (address.endsWith(".")) {
            return false;
        }
        if (mArray.length != 4) {
            return false;
        }
        //convert the string to integer
        //check if the integer parts fall within the valid range
        for (String item : mArray) {
            int num = Integer.parseInt(item);
            if (num < 0 || num > 255) {
                return false;
            }
        }

        return true;
    }

}
