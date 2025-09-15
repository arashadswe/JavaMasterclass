public class Main {

    public static void main(String[] args) {

        int currentYear = 2022;
        String userDateOfBirth = "1999";
        int dateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("Age = " + (currentYear - dateOfBirth));
    }
}
