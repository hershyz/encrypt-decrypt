import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        EncryptDecrypt encryptDecrypt = new EncryptDecrypt();
        encryptDecrypt.init();
        while (true) {
            System.out.print("> ");
            String input = scn.nextLine();
            System.out.println("encrypted: " + encryptDecrypt.encrypt(input));
            System.out.println("decrypted: " + encryptDecrypt.decrypt(input));
        }
    }
}

class EncryptDecrypt {

    private List<String[]> map = new ArrayList<>();

    public void init() {

        String lower = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String upper = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
        String[] lowerArr = lower.split(" ");
        String[] upperArr = upper.split(" ");

        for (int i = 0; i < lowerArr.length - 1; i++) {
            map.add(new String[]{lowerArr[i], lowerArr[i + 1]});
        }

        for (int i = 0; i < upperArr.length - 1; i++) {
            map.add(new String[]{upperArr[i], upperArr[i + 1]});
        }

        map.add(new String[]{"Z", "Ƶ"});
        map.add(new String[]{"z", "ƶ"});
        map.add(new String[]{"`", "~"});
        map.add(new String[]{"1", "!"});
        map.add(new String[]{"2", "@"});
        map.add(new String[]{"3", "#"});
        map.add(new String[]{"4", "$"});
        map.add(new String[]{"5", "%"});
        map.add(new String[]{"6", "^"});
        map.add(new String[]{"7", "&"});
        map.add(new String[]{"8", "*"});
        map.add(new String[]{"9", "("});
        map.add(new String[]{"0", ")"});
        map.add(new String[]{"_", "="});
        map.add(new String[]{"[", "{"});
        map.add(new String[]{"]", "}"});
        map.add(new String[]{"\\", "|"});
        map.add(new String[]{";", ":"});
        map.add(new String[]{"'", "\""});
        map.add(new String[]{",", "<"});
        map.add(new String[]{".", ">"});
        map.add(new String[]{"/", "?"});
        map.add(new String[]{" ", " "});

        System.out.println("map:");
        for (String[] x : map) {
            System.out.println(Arrays.toString(x));
        }
        System.out.println("--------------------");
    }

    public String encrypt(String input) {

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            for (String[] arr : map) {
                if (arr[0].equals(c)) {
                    result += arr[1];
                    break;
                }
            }
        }

        return result;
    }

    public String decrypt(String input) {

        String result = "";

        for (int i = 0; i < input.length(); i++) {
            String c = String.valueOf(input.charAt(i));
            for (String[] arr : map) {
                if (arr[1].equals(c)) {
                    result += arr[0];
                    break;
                }
            }
        }

        return result;
    }
}