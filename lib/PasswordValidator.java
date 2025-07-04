package lib;

public class PasswordValidator {

    /**
     * ตรวจสอบความถูกต้องของ Password 
     * @param password string ที่ต้องการตรวจสอบ
     * @return PasswordStrength INVALID อื่นๆ
     */
    public static PasswordStrength validate(String password) {  
        int minLength = 8;
                if (password.length() < minLength) {
            return PasswordStrength.INVALID;
        }
        if (password == null || password.isEmpty()) {
            return PasswordStrength.INVALID;
        }
        boolean Upper = password.matches(".*[A-Z].*");
        boolean Lower = password.matches(".*[a-z].*");
        boolean Digit = password.matches(".*\\d.*");
        boolean Special = password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>/?].*");

        if(Upper && Lower && Digit && Special && password.length() >= minLength){
            return PasswordStrength.STRONG;
        }
        if(Upper && Lower && Digit && password.length() >= minLength){
            return PasswordStrength.MEDIUM;
        }
        if(Upper && Lower && Special && password.length() >= minLength){
            return PasswordStrength.MEDIUM;
        }
        if(Upper && Special && Digit && password.length() >= minLength){
            return PasswordStrength.MEDIUM;
        }
        if(Lower && Special && Digit && password.length() >= minLength){
            return PasswordStrength.MEDIUM;
        }
        else 
        return PasswordStrength.WEAK;
  }
}
