package com.toy.mbtiservice.dto;

import com.toy.mbtiservice.domain.MbtiResult;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MbtiDto {
    private int E,I,N,S,T,F,P,J;
    private String mbti1,mbti2,mbti3,mbti4; //mbti 속성 저장
    private String result; //mbti 결과

    public MbtiResult toEntity() {
        return MbtiResult.builder()
                .result(result)
                .build();
    }
}
