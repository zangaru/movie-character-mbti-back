package com.toy.mbtiservice.controller;

import com.toy.mbtiservice.dto.MbtiDto;
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

    @PostMapping(value = "/result")
    public String calMbti(@RequestBody MbtiDto mbtiDto) {
        return mbtiService.calMbtiResult(mbtiDto);
    }
}
