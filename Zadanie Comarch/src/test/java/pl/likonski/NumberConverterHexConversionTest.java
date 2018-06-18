package pl.likonski;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberConverterHexConversionTest {

    @Test
    public void convertToHex_15_ShouldReturn_f(){
        assertEquals("f", NumberConverter.convertNumber(15,
                NumberConverter.ConversionTypes.HEX));
    }

    @Test
    public void convertToHex_10_ShouldReturn_a(){
        assertEquals("a", NumberConverter.convertNumber(10,
                NumberConverter.ConversionTypes.HEX));
    }

    @Test
    public void convertToHex_16_ShouldReturn_10(){
        assertEquals("10", NumberConverter.convertNumber(16,
                NumberConverter.ConversionTypes.HEX));
    }

    @Test
    public void convertToHex_0_ShouldReturn_0(){
        assertEquals("0", NumberConverter.convertNumber(0,
                NumberConverter.ConversionTypes.HEX));
    }

    @Test
    public void convertToHex_negative_1_ShouldReturn_ffffffff(){
        assertEquals("ffffffff", NumberConverter.convertNumber(-1,
                NumberConverter.ConversionTypes.HEX));
    }
}
