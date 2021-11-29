package com.example.AEPB.service;

import com.example.AEPB.AirCoin;
import org.springframework.stereotype.Service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class CaculateService {

    public boolean judgeFaceValue(AirCoin buildAirCoin01, AirCoin buildAirCoin02) {
        if (checkRange(buildAirCoin01, buildAirCoin02)) {
            return buildAirCoin01.getFaceValue() == buildAirCoin02.getFaceValue();
        }
        throw new IllegalArgumentException("Parameter is not valid");
    }

    private boolean checkRange(AirCoin buildAirCoin01, AirCoin buildAirCoin02) {
        if (checkDecimalDigits(buildAirCoin01, buildAirCoin02)) {
            return buildAirCoin01.getFaceValue() >= 0.5 && buildAirCoin01.getFaceValue() <= 5000000
                    && buildAirCoin02.getFaceValue() >= 0.5 && buildAirCoin02.getFaceValue() <= 5000000;
        }
        return false;
    }


    public boolean checkDecimalDigits(AirCoin buildAirCoin01, AirCoin buildAirCoin02) {
        return isNumber(String.valueOf(buildAirCoin01.getFaceValue())) && isNumber(
                String.valueOf(buildAirCoin02.getFaceValue()));
    }


    public static boolean isNumber(String str) {
        Pattern compile = Pattern.compile("^(([1-9]{1}\\d*)|([0]{1}))(\\.(\\d){0,3})?$");
        Matcher match = compile.matcher(str);
        return match.matches();
    }
}
