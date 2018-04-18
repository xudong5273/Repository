package org.lostandfound.service;

import org.lostandfound.entity.Found;
import org.lostandfound.entity.Lost;
import org.lostandfound.web.ResultDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface SumService {
    List<ResultDto> getResultDto();

}
