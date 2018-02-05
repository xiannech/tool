package com.zhihuishu.tool.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhihuishu.tool.model.VideoQrcodeMap;

@Mapper
public interface VideoQrcodeMapMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VideoQrcodeMap record);

    int insertSelective(VideoQrcodeMap record);

    VideoQrcodeMap selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VideoQrcodeMap record);

    int updateByPrimaryKey(VideoQrcodeMap record);
    
    List<VideoQrcodeMap> findQRCodeIdList(@Param("type") Integer type, @Param("bookId") Integer bookId);
    
    List<VideoQrcodeMap> findAll();
}