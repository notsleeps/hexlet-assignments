package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public static long getCountOfFreeEmails(List<String> emails) {
        long email = emails.stream()
        .filter(s -> s.contains("@hotmail.com") || s.contains("@gmail.com") || s.contains("@yandex.ru"))
        .count();
        return email;
        }
// END
