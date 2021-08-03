# hershyz/encrypt-decrypt
Reverse-engineerable encryption/decryption algorithm with defined ruleset map -> [Run in Browser](https://replit.com/@hershyz/encrypt-decrypt?v=1).

#### Map Generation Code
```java
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
```
