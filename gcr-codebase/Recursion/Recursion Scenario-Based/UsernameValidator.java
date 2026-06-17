public class UsernameValidator {
    public static boolean isValid(String username, int index) {
        if (index == username.length()) return true;
        if (!Character.isLowerCase(username.charAt(index))) return false;
        return isValid(username, index + 1);
    }

    public static void main(String[] args) {
        System.out.println(isValid("abcdays", 0));
        System.out.println(isValid("abcD123", 0));
    }
}