package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นควรจะ INVALID
        PasswordStrength result1 = PasswordValidator.validate("1234567");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }

        // Test Case 1: รหัสผ่านที่เป็น null ควรจะ INVALID
        PasswordStrength result2 = PasswordValidator.validate("");
        if (result2 == PasswordStrength.INVALID) {
            System.out.println("Test Case 2 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected INVALID but got " + result2);
        }

        // Test Case 1: รหัสผ่านที่เป็น Empty ควรจะ INVALID
        PasswordStrength result3 = PasswordValidator.validate("       ");
        if (result3 == PasswordStrength.INVALID) {
            System.out.println("Test Case 3 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected INVALID but got " + result3);
        }


        // Test Case 2: รหัสผ่านที่เป็น ตัวอักษรพิมพ์เล็ก พิมพ์ใหญ่ ตัวเลข ตัวอักษรพิเศษ ต่างกัน 1 หรือ 2 และมีความยาวมากกว่า 7 ตัวอักษร = Weak
        PasswordStrength result4 = PasswordValidator.validate("123456NN");
        if (result4 == PasswordStrength.WEAK) {
            System.out.println("Test Case 4 Passed: Short password is WEAK.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected WEAK but got " + result4);
        }



        // Test Case 3: รหัสผ่านที่เป็น ตัวอักษรพิมพ์เล็ก พิมพ์ใหญ่ ตัวเลข ตัวอักษรพิเศษ ต่างกัน 3 รูปแบบ และมีความยาวมากกว่า 7 ตัวอักษร = Medium
        PasswordStrength result5 = PasswordValidator.validate("123456nN");
        if (result5 == PasswordStrength.WEAK) {
            System.out.println("Test Case 5 Passed: Short password is Medium.");
        } else {
            System.out.println("Test Case 5 FAILED: Expected Medium but got " + result5);
        }



        // Test Case 4: รหัสผ่านที่เป็น ตัวอักษรพิมพ์เล็ก พิมพ์ใหญ่ ตัวเลข ตัวอักษรพิเศษ ต่างกัน 4 รูปแบบ และมีความยาวมากกว่า 7 ตัวอักษร = Strong
        PasswordStrength result6 = PasswordValidator.validate("12345nN*");
        if (result6 == PasswordStrength.WEAK) {
            System.out.println("Test Case 6 Passed: Short password is Strong.");
        } else {
            System.out.println("Test Case 6 FAILED: Expected Strong but got " + result6);
        }


    }
}
