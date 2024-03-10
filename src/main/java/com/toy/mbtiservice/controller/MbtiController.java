package com.toy.mbtiservice.controller;

import com.toy.mbtiservice.domain.MbtiResult;
import com.toy.mbtiservice.dto.MbtiDto;
import com.toy.mbtiservice.repository.MbtiRepository;
import com.toy.mbtiservice.service.MbtiService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/mbti")
@RequiredArgsConstructor
public class MbtiController {

    private final MbtiService mbtiService;
    private final MbtiRepository mbtiRepository;


    @PostMapping(value = "/result")
    public String calculateMbti(@RequestBody MbtiDto mbtiDto) {
        String result = mbtiService.calculateMbtiResult(mbtiDto); //mbti 결과

        MbtiResult mbtiResult = mbtiDto.toEntity();

        mbtiRepository.save(mbtiResult);

        return result;
    }

    @GetMapping("/count")
    public Map<String, Long> getParticipantCount() {
        long participantCount = mbtiRepository.count();
        Map<String, Long> response = new HashMap<>();
        response.put("participantCount", participantCount);
        return response;
    }
}
