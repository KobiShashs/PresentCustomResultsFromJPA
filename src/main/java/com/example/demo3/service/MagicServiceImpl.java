package com.example.demo3.service;

import com.example.demo3.beans.custom.CustomResult;
import com.example.demo3.repos.MagicRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by kobis on 24 Dec, 2020
 */
@Service
@RequiredArgsConstructor
public class MagicServiceImpl implements MagicService {

    private final MagicRepository magicRepository;

    @Override
    public List<CustomResult> getAllCustomResults() {
        List<Map<String, Object>> results = magicRepository.go();
        return results.stream().map(CustomResult::new).collect(Collectors.toList());
    }
}
