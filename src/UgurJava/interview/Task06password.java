package UgurJava.interview;

public class Task06password {
    /*
6  -->>  Write a return method that can verify if a password is valid or not.
requirements:
+Password MUST be at least have 6 characters and should not contain space
Password should at least contain one upper case letter
Password should at least contain one lowercase letter
Password should at least contain one special characters
Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns false
*/
    public static void main(String[] args) {
        String pass ="Mahmut_16";
        System.out.println("password validation: "+verify(pass));
    }
    public static boolean verify(String pass) {
        boolean flag= false;
        String tumChars="(.*[A-Z, a-z, 0-9, !#$%&'()*+,-./:;<=>?@^_{|}~ ].*)";
        if (pass.length()>5 && !pass.contains(" ")){
            flag=pass.matches(tumChars);
        }
        return flag;
    }
}
