public class NameFromEmail {
    public static void main(String[] args) {
        // Create a function that takes an email address as input in the following format: firstName.lastName@exam.com
        //and returns a string that represents the user name in the following format: lastName firstName
        //example: "elek.viz@exam.com" for this input the output should be: "Viz Elek"
        //accents does not matter
        System.out.println(nameFromEmail("elek.viz@exam.com"));
    }

    public static String nameFromEmail(String emailAddress) {
        String lastName = "";
        String firstName = "";
        int fullStopPlace = emailAddress.indexOf(".");
        if (fullStopPlace != -1) {
            firstName = emailAddress.substring(0, fullStopPlace);
            lastName = emailAddress.substring(fullStopPlace + 1, emailAddress.indexOf("@"));
        }
        return lastName.substring(0, 1).toUpperCase() + lastName.substring(1) + " " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
    }
}