package ua.lviv.iot;

import java.io.IOException;

public class Main {
    public static void main(final String[] args) throws IOException {

        StringProcessor processor = new StringProcessor();
        processor.readInputText();
        String text = processor.textProcessing();
        System.out.println(text);
    }
}
