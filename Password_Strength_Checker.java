import java.util.Scanner;

// Class to handle password checking
class PasswordChecker {
    private String password;

    public PasswordChecker(String password) {
        this.password = password;
    }


    public void checkPassword() {
        int length = password.length();
        boolean hasLetter = password.matches(".*[a-zA-Z].*");
        boolean hasDigit = password.matches(".*[0-9].*");
        boolean hasSpecial = password.matches(".*[!@#$%^&*].*");

        if (length < 6) {
            System.out.println("Password Strength: Too Short");
        } else if (length <= 10) {
            if ((hasLetter && !hasDigit) || (!hasLetter && hasDigit)) {
                System.out.println("Password Strength: Weak");
            } else if (hasLetter && hasDigit) {
                System.out.println("Password Strength: Medium");
            } else {
                System.out.println("Password Strength: Weak");
            }
        } else {
            if (hasLetter && hasDigit && hasSpecial) {
                System.out.println("Password Strength: Strong");
            } else {
                System.out.println("Password Strength: Medium");
            }
        }
    }
}


public class Password_Strength_Checker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your password: ");
        String inputPassword = sc.nextLine();

       
        PasswordChecker checker = new PasswordChecker(inputPassword);
        checker.checkPassword();

        sc.close();
    }
}
