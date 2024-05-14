package com.xuecheng.content.service;

import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
@Service
public interface CourseCategoryService {
    public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}
