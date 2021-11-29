package com.example.AEPB.Build;

import com.example.AEPB.AirCoin;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AirCoinBuild {

    private final AirCoin airCoin = new AirCoin();

    public static AirCoinBuild withDefault(){
       return new AirCoinBuild().withFaceValue(2.1);
    }


    public AirCoinBuild withFaceValue(double faceValue){
        airCoin.setFaceValue(faceValue);
        return this;
    }

    public AirCoin build() {
        return airCoin;
    }

}
