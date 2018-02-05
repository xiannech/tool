package com.zhihuishu.tool.model;

import java.util.Date;

public class VideoQrcodeMap {
	
	private Integer id;		   //二维码编号
    private Integer type;	   //类型（1：视频 2：直播 3：文档）
    private Integer bookId;    //书籍id
    private Integer bCourseId; //2B课程id
    private Integer bVideoId;  //2B视频id
    private Integer cCourseId; //2C课程id
    private Integer cVideoId;  //2C视频id
    private Integer liveId;	   //直播id
    private String url;		   //文档url地址
    private Integer useStatus; //是否被使用
    private Integer item;	   //使用类别
    private String itemName;   //使用类型名称
    private Date createTime;
    private Date updateTime;
    private Integer isDelete;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getbCourseId() {
		return bCourseId;
	}
	public void setbCourseId(Integer bCourseId) {
		this.bCourseId = bCourseId;
	}
	public Integer getbVideoId() {
		return bVideoId;
	}
	public void setbVideoId(Integer bVideoId) {
		this.bVideoId = bVideoId;
	}
	public Integer getcCourseId() {
		return cCourseId;
	}
	public void setcCourseId(Integer cCourseId) {
		this.cCourseId = cCourseId;
	}
	public Integer getcVideoId() {
		return cVideoId;
	}
	public void setcVideoId(Integer cVideoId) {
		this.cVideoId = cVideoId;
	}
	public Integer getLiveId() {
		return liveId;
	}
	public void setLiveId(Integer liveId) {
		this.liveId = liveId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(Integer useStatus) {
		this.useStatus = useStatus;
	}
	public Integer getItem() {
		return item;
	}
	public void setItem(Integer item) {
		this.item = item;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}
	
	@Override
	public String toString() {
		return "VideoQrcodeMap [id=" + id + ", type=" + type + ", bookId="
				+ bookId + ", bCourseId=" + bCourseId + ", bVideoId="
				+ bVideoId + ", cCourseId=" + cCourseId + ", cVideoId="
				+ cVideoId + ", liveId=" + liveId + ", url=" + url
				+ ", useStatus=" + useStatus + ", item=" + item + ", itemName="
				+ itemName + ", createTime=" + createTime + ", updateTime="
				+ updateTime + ", isDelete=" + isDelete + "]";
	}
    
}