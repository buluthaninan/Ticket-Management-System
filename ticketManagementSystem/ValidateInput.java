package ticketManagementSystem;
public class ValidateInput
{
    public static boolean validateFirstName(String firstName)
    {
        return firstName.matches("[a-zA-Z]*");
    }
    public static boolean validateLastName(String lastName)
    {
        return lastName.matches("[a-zA-Z]*");
    }
    public static boolean validatePhoneNumber(String phoneNumber)
    {
        return phoneNumber.matches("[0-9]\\d{9}");
    }
    public static boolean validateTC(String TC)
    {
        return TC.matches("[0-9]\\d{10}");
    }


}