package com.aprileclipse;

public class PasswordConverter {
	public static void main(String[] args) {
        String password = "India'sAge72@2019";
        String convertedPassword = convertToFormat(password);
        String shortenedPassword = shortenFormat(convertedPassword);

        System.out.println("Original Password: " + password);
        System.out.println("Converted Password: " + convertedPassword);
        System.out.println("Shortened Password: " + shortenedPassword);
    }

    private static String convertToFormat(String password) {
        StringBuilder result = new StringBuilder();

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append("U");
            } else if (Character.isLowerCase(c)) {
                result.append("l");
            } else if (Character.isDigit(c)) {
                result.append("N");
            } else {
                result.append("S");
            }
        }

        return result.toString();
    }

    private static String shortenFormat(String convertedPassword) {
        StringBuilder result = new StringBuilder();
        char currentChar = convertedPassword.charAt(0);
        int count = 1;

        for (int i = 1; i < convertedPassword.length(); i++) {
            if (convertedPassword.charAt(i) == currentChar) {
                count++;
            }
            else {
                result.append(currentChar);
                if (count > 1) {
                    result.append(count);
                }
                currentChar = convertedPassword.charAt(i);
                count = 1;
            }
        }

        result.append(currentChar);
        if (count > 1) {
            result.append(count);
        }

        return result.toString();
    }
}
	


