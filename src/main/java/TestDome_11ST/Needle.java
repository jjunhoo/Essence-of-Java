package TestDome_11ST;

import java.io.*;
import java.util.*;

public class Needle {
    public static int count(String needle, InputStream haystack) throws Exception {
        try {
            int result = 0;
            int ch;

            StringBuilder sb = new StringBuilder();
            while ((ch = haystack.read()) != -1) {
                sb.append(Character.toUpperCase((char) ch));
            }

            String test = String.join("\n", sb);
            List<String> list = Arrays.asList(test.split("\n"));

            for (String str : list) {
                if (str.contains(needle.toUpperCase())) {
                    result++;
                }
            }
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) throws Exception {
        String inMessage = "Hello, there!\nHow are you today?\nYes, you over there.";
        try(InputStream inStream = new ByteArrayInputStream(inMessage.getBytes())) {
            System.out.println(Needle.count("there", inStream));
        }
    }
}
