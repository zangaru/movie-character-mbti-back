package com.toy.mbtiservice.service;

import com.toy.mbtiservice.dto.MbtiDto;

public interface MbtiService {
    String calculateMbtiResult(MbtiDto mbtiDto);
}