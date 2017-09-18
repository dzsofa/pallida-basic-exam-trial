public class NameFromEmail {
    public static void main(String[] args) {
        // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
        //and returns a string that represents the user name in the following format: lastName firstName
        //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
        //accents does not matter
        System.out.println(nameFromEmail("elek.viz@exam.com"));
    }

    public static String nameFromEmail(String emailAddress) {
        String  username = "";
        for (int i = 0; i <= emailAddress.length(); i ++) {
            username = emailAddress.substring(emailAddress.indexOf("."), emailAddress.indexOf("@")) + emailAddress.substring(emailAddress.charAt(0) + emailAddress.indexOf("@"));
        }
        return username;
    }
}
