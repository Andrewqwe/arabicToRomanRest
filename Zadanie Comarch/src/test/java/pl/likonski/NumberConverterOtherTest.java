package pl.likonski;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterOtherTest {

    @Test
    public void failToConvertIfTypeIsNull(){
        assertEquals("Conversion type is null", NumberConverter.convertNumber(-1,
                null));
    }
}
