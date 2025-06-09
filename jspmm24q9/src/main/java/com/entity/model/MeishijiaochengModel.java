package com.entity.model;

import com.entity.MeishijiaochengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 美食教程
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public class MeishijiaochengModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 分类
	 */
	
	private String fenlei;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用料
	 */
	
	private String yongliao;
		
	/**
	 * 烹饪方法
	 */
	
	private String pengrenfangfa;
		
	/**
	 * 烹饪时长
	 */
	
	private Float pengrenshizhang;
		
	/**
	 * 美食特色
	 */
	
	private String meishitese;
		
	/**
	 * 制作方法
	 */
	
	private String zhizuofangfa;
		
	/**
	 * 小贴士
	 */
	
	private String xiaotieshi;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
				
	
	/**
	 * 设置：分类
	 */
	 
	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}
	
	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：用料
	 */
	 
	public void setYongliao(String yongliao) {
		this.yongliao = yongliao;
	}
	
	/**
	 * 获取：用料
	 */
	public String getYongliao() {
		return yongliao;
	}
				
	
	/**
	 * 设置：烹饪方法
	 */
	 
	public void setPengrenfangfa(String pengrenfangfa) {
		this.pengrenfangfa = pengrenfangfa;
	}
	
	/**
	 * 获取：烹饪方法
	 */
	public String getPengrenfangfa() {
		return pengrenfangfa;
	}
				
	
	/**
	 * 设置：烹饪时长
	 */
	 
	public void setPengrenshizhang(Float pengrenshizhang) {
		this.pengrenshizhang = pengrenshizhang;
	}
	
	/**
	 * 获取：烹饪时长
	 */
	public Float getPengrenshizhang() {
		return pengrenshizhang;
	}
				
	
	/**
	 * 设置：美食特色
	 */
	 
	public void setMeishitese(String meishitese) {
		this.meishitese = meishitese;
	}
	
	/**
	 * 获取：美食特色
	 */
	public String getMeishitese() {
		return meishitese;
	}
				
	
	/**
	 * 设置：制作方法
	 */
	 
	public void setZhizuofangfa(String zhizuofangfa) {
		this.zhizuofangfa = zhizuofangfa;
	}
	
	/**
	 * 获取：制作方法
	 */
	public String getZhizuofangfa() {
		return zhizuofangfa;
	}
				
	
	/**
	 * 设置：小贴士
	 */
	 
	public void setXiaotieshi(String xiaotieshi) {
		this.xiaotieshi = xiaotieshi;
	}
	
	/**
	 * 获取：小贴士
	 */
	public String getXiaotieshi() {
		return xiaotieshi;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
			
}
