package ua.lviv.iot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    private String text;
    private int number;

    public StringProcessor() {
    }

    public StringProcessor(final String text, final int number) {
        this.text = text;
        this.number = number;
    }

    public final void readInputText() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(
                System.in, StandardCharsets.UTF_8));
        System.out.println("Enter your string:");
        this.text = br.readLine();
        System.out.println("Enter your number:");
        this.number = Integer.parseInt(br.readLine());
    }

    public final StringBuffer textProcessing() {
        StringBuffer resultText = new StringBuffer();
        String[] words = text.split("\\s+");
        String regex = String.format("(\\d-?){%d,}", number);
        Pattern pattern = Pattern.compile(regex);

        for (String word : words) {
            Matcher matcher = pattern.matcher(word);
            if (!matcher.find()) {
                resultText.append(word);
                resultText.append(" ");
            }
        }
        return resultText.delete(resultText.length() - 1, resultText.length());
    }
}
