package pl.likonski;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberConverterController {

    @RequestMapping("/converter")
    public String arabicToRoman(@RequestParam(value="number") int number,
                                 @RequestParam(value="type") int type){
        if(type==0) {
            return NumberConverter.convertNumber(number, NumberConverter.ConversionTypes.ROMAN);
        }else if (type==1){
            return NumberConverter.convertNumber(number, NumberConverter.ConversionTypes.HEX);
        }else {
            return "ERROR: Unknown conversion type 0 - ROMAN 1 - HEX";
        }
    }


    @ExceptionHandler(MissingServletRequestParameterException.class)
    public String handleMissingParams(MissingServletRequestParameterException ex) {
        return "Error: " + ex.getParameterName() + " parameter is missing";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String handleNumberFormatException() {
        return "ERROR: Unsupported param format";
    }
}
