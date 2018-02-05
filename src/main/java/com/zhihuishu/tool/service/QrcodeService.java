package com.zhihuishu.tool.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhihuishu.tool.mapper.VideoQrcodeMapMapper;
import com.zhihuishu.tool.model.VideoQrcodeMap;

@Service("qrcodeService")
public class QrcodeService {
	@Resource
	private VideoQrcodeMapMapper videoQrcodeMapMapper;
	
	public VideoQrcodeMap getVideoQrcodeMap(Integer code){
		return videoQrcodeMapMapper.selectByPrimaryKey(code);
	}
}
