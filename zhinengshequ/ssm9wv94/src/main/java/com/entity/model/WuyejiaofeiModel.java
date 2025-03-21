package com.entity.model;

import com.entity.WuyejiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 物业缴费
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public class WuyejiaofeiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 名称
	 */
	
	private String mingcheng;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 物业费
	 */
	
	private Float wuyefei;
		
	/**
	 * 水电费
	 */
	
	private Float shuidianfei;
		
	/**
	 * 宽带费
	 */
	
	private Float kuandaifei;
		
	/**
	 * 车位费
	 */
	
	private Float cheweifei;
		
	/**
	 * 燃气费
	 */
	
	private Float ranqifei;
		
	/**
	 * 总费用
	 */
	
	private Float zongfeiyong;
		
	/**
	 * 缴费时间
	 */
	
	private String jiaofeishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：名称
	 */
	 
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
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
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：物业费
	 */
	 
	public void setWuyefei(Float wuyefei) {
		this.wuyefei = wuyefei;
	}
	
	/**
	 * 获取：物业费
	 */
	public Float getWuyefei() {
		return wuyefei;
	}
				
	
	/**
	 * 设置：水电费
	 */
	 
	public void setShuidianfei(Float shuidianfei) {
		this.shuidianfei = shuidianfei;
	}
	
	/**
	 * 获取：水电费
	 */
	public Float getShuidianfei() {
		return shuidianfei;
	}
				
	
	/**
	 * 设置：宽带费
	 */
	 
	public void setKuandaifei(Float kuandaifei) {
		this.kuandaifei = kuandaifei;
	}
	
	/**
	 * 获取：宽带费
	 */
	public Float getKuandaifei() {
		return kuandaifei;
	}
				
	
	/**
	 * 设置：车位费
	 */
	 
	public void setCheweifei(Float cheweifei) {
		this.cheweifei = cheweifei;
	}
	
	/**
	 * 获取：车位费
	 */
	public Float getCheweifei() {
		return cheweifei;
	}
				
	
	/**
	 * 设置：燃气费
	 */
	 
	public void setRanqifei(Float ranqifei) {
		this.ranqifei = ranqifei;
	}
	
	/**
	 * 获取：燃气费
	 */
	public Float getRanqifei() {
		return ranqifei;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(Float zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public Float getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：缴费时间
	 */
	 
	public void setJiaofeishijian(String jiaofeishijian) {
		this.jiaofeishijian = jiaofeishijian;
	}
	
	/**
	 * 获取：缴费时间
	 */
	public String getJiaofeishijian() {
		return jiaofeishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
