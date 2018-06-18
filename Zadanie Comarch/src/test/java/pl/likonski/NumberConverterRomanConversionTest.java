package pl.likonski;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberConverterRomanConversionTest {
    @Test
    public void convertToRoman_19_ShouldReturn_XIX(){
        assertEquals("XIX", NumberConverter.convertNumber(19,
                NumberConverter.ConversionTypes.ROMAN));
    }

    @Test
    public void convertToRoman_4_ShouldReturn_IV(){ // sorry Louis XIV of France
        assertEquals("IV", NumberConverter.convertNumber(4,
                NumberConverter.ConversionTypes.ROMAN));
    }

    @Test
    public void convertToRoman_1234_ShouldReturn_MCCXXXIV(){
        assertEquals("MCCXXXIV", NumberConverter.convertNumber(1234,
                NumberConverter.ConversionTypes.ROMAN));
    }

    @Test
    public void convertToRoman_0_ShouldReturn_EmptyString(){
        assertEquals("", NumberConverter.convertNumber(0,
                NumberConverter.ConversionTypes.ROMAN));
    }

    @Test
    public void convertToRoman_negative_ShouldReturn_unsupported(){
        assertEquals("Negative numbers are not supported", NumberConverter.convertNumber(-1,
                NumberConverter.ConversionTypes.ROMAN));
    }

}
