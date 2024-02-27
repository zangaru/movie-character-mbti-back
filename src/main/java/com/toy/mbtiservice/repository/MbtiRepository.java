package com.toy.mbtiservice.repository;

import com.toy.mbtiservice.domain.MbtiResult;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MbtiRepository extends JpaRepository<MbtiResult, Long> {
}
