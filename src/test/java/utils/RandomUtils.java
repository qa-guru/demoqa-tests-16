package utils;

import org.apache.commons.lang3.RandomStringUtils;

import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public static void main(String[] args) {
        System.out.println(randomString(50));
        System.out.println(randomEmail(20));
        System.out.println(randomNumber(1000000L, 99999999L));
        System.out.println(randomPhone("+00", 1000000L, 99999999L));

        String[] names = {"a", "b", "c", "d", "e"};
        System.out.println(randomListItem(names));

        System.out.println(RandomStringUtils.random(20, false, false));
        System.out.println(RandomStringUtils.random(20, true, false));
        System.out.println(RandomStringUtils.random(20, false, true));
        System.out.println(RandomStringUtils.random(20, true, true));
    }

    public static String randomString(int len){
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for(int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();

//        String a = "123";
//        a = a + "456";
//        a += "456";

//        String sb = ""; // Bad practice
//        for(int i = 0; i < len; i++)
//            sb += AB.charAt(rnd.nextInt(AB.length()));
//        return sb;
    }

    public static String randomEmail(int len) {
        return randomString(len) + "@qa.guru";
    }

    static Long randomNumber(Long min, Long max) {
        return ThreadLocalRandom.current().nextLong(min, max);
    }

    public static int randInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static String randomPhone(String prefix, Long min, Long max) {
        return prefix + randomNumber(min, max);
    }

    public static String randomListItem(String[] values) {

        int index = randInt(0, values.length);

        return values[index];
    }

}
