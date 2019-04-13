package ua.lviv.iot;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringProcessorTest {

    private String text;
    private String expectedText;
    private StringProcessor processor;

    @BeforeEach
    void setUp() {
        text = "dfg dfg34 dfg3456 dfg34dfg dfg34dfg34dfg dfg345dfg3456 123 dfg345-345 dfg-dfg dfg3456-345dfg 3-4-5 dfg34-35-36dfg 044-332-50-91";
        expectedText = "dfg dfg34 dfg34dfg dfg34dfg34dfg 123 dfg-dfg 3-4-5";
        processor = new StringProcessor(text, 4);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void textProcessing() {
        assertEquals(processor.textProcessing().toString(), expectedText);
    }
}