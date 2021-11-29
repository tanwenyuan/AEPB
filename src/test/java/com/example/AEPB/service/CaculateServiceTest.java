package com.example.AEPB.service;

import com.example.AEPB.AirCoin;
import com.example.AEPB.Build.AirCoinBuild;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CaculateServiceTest {
    @Autowired
    private CaculateService caculateService;

    @DisplayName("should return is equal given 2 the same face value currency")
    @Test
    public void should_return_isEqual_given_two_theSame_faceValue_currency() {
        // given
        AirCoin buildAirCoin01 = AirCoinBuild.withDefault().withFaceValue(2.1).build();
        AirCoin buildAirCoin02 = AirCoinBuild.withDefault().withFaceValue(2.1).build();

        // when
        boolean isResult = caculateService.judgeFaceValue(buildAirCoin01, buildAirCoin02);

        // then
        Assert.assertTrue(isResult);
    }


    @DisplayName("should return is not equal given 2 different face value currency")
    @Test
    public void should_return_is_not_equal_given_two_different_faceValue_currency() {
        // given
        AirCoin build1 = AirCoinBuild.withDefault().withFaceValue(2.1).build();
        AirCoin build2 = AirCoinBuild.withDefault().withFaceValue(2.2).build();

        // when
        boolean isResult = caculateService.judgeFaceValue(build1, build2);

        // then
        Assert.assertFalse(isResult);
    }

    @Test
    @DisplayName("should throw exception given two more than face value")
    public void should_throw_exception_given_two_more_than_face_value() {
        // given
        AirCoin build1 = AirCoinBuild.withDefault().withFaceValue(50000000).build();
        AirCoin build2 = AirCoinBuild.withDefault().withFaceValue(2.222222).build();
        Assert.assertThrows("Parameter is not valid", IllegalArgumentException.class, () -> {
            caculateService.judgeFaceValue(build1, build2);
        });

    }
}
