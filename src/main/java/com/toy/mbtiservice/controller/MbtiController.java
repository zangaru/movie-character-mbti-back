package com.toy.mbtiservice.controller;

import com.toy.mbtiservice.domain.MbtiResult;
import com.toy.mbtiservice.dto.MbtiDto;
import com.toy.mbtiservice.repository.MbtiRepository;
import com.toy.mbtiservice.service.MbtiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mbti")
@RequiredArgsConstructor
public class MbtiController {

    private final MbtiService mbtiService;
    private final MbtiRepository mbtiRepository;

    @PostMapping(value = "/result")
    public String calMbti(@RequestBody MbtiDto mbtiDto) {
        String result = mbtiService.calMbtiResult(mbtiDto); //mbti 결과

        MbtiResult mbtiResult = mbtiDto.toEntity();

        mbtiRepository.save(mbtiResult);

        return result;
    }
}
