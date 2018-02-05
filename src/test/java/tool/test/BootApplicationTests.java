package tool.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhihuishu.tool.BootApplication;
import com.zhihuishu.tool.constant.Constant;
import com.zhihuishu.tool.mapper.VideoQrcodeMapMapper;
import com.zhihuishu.tool.model.VideoQrcodeMap;
import com.zhihuishu.tool.utils.QRCodeUtil;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootApplication.class)
public class BootApplicationTests {
	@Resource
	private VideoQrcodeMapMapper videoQrcodeMapMapper;
	
	@Test
	public void getVideoQrcodeMap(){
		VideoQrcodeMap dto = videoQrcodeMapMapper.selectByPrimaryKey(1001);
		System.out.println(dto.toString());
	}
	
	@Test
	public void batchInsertQRCodeRecord(){
		for (int i = 0; i < 200; i++) {
			VideoQrcodeMap dto = new VideoQrcodeMap();
		    videoQrcodeMapMapper.insertSelective(dto);
		}
	}
	
	
	@Test
	public void findAll(){
		//分页插件测试
		PageHelper.startPage(0, 10, true);
		List<VideoQrcodeMap> dtoList = videoQrcodeMapMapper.findAll();
		PageInfo<VideoQrcodeMap> pageInfo = new PageInfo<VideoQrcodeMap>(dtoList);
		System.out.println(dtoList.size());
	}
	
	
	@Test
	public void batchCreateQRCode() throws Exception{
		List<VideoQrcodeMap> codeList = videoQrcodeMapMapper.findQRCodeIdList(null, null);
		if(!CollectionUtils.isEmpty(codeList)){
			for (VideoQrcodeMap codeDto : codeList) {
				String content = Constant.content + codeDto.getId() + "&item=" + codeDto.getItem();
				String destPath = Constant.dir + codeDto.getId() + ".png";
//				QRCodeUtil.encode(content, destPath);
				QRCodeUtil.encode(content, Constant.logoImgPath, destPath, true);
			}
		}
	}
	
	@Test
	public void createQRCode() throws Exception{
		Integer code = 131;
		Integer item = 2;
		String content = Constant.content + code + "&item=" + item;
		String destPath = Constant.dir + code + ".png";
		QRCodeUtil.encode(content, Constant.logoImgPath, destPath, true);
	}
}
