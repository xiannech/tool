package com.zhihuishu.tool.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhihuishu.tool.service.QrcodeService;

@RestController
public class QrcodeController {
	
	@Resource
	private QrcodeService qrcodeService;
	
	@RequestMapping("/getQRcodeInfo")
	public Object getQRcodeInfo(Integer code){
		return qrcodeService.getVideoQrcodeMap(code);
	}
}
