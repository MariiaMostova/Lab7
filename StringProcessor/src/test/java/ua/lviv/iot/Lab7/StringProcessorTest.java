package ua.lviv.iot.Lab7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {

    private StringProcessor stringProcessor;

    @BeforeEach
    public void setUp() {
        stringProcessor = new StringProcessor();
    }

    @Test
    public void makeAllLastLettersUpperTest() {
        assertEquals(
                "yelloW submarinE? oR jumpinG foX! anotheR trY tO gO! rO. anD fly-to-higH9 oR 9-jumpS. FocuS!! IS playeR47 winneR? AnD tesT iS noT100 f-a-i-l-D!!! ",
                stringProcessor.makeAllLastLettersUpper(
                        "yellow submarine? or jumping fox! another try to go! ro. and fly-to-high9 or 9-jumps. Focus!! Is player47 winner? And test is not100 f-a-i-l-d!!! "));
    }
}