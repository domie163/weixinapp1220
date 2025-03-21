package com.entity.model;

import com.entity.FangwuzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 房屋租赁
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public class FangwuzulinModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 楼层
	 */
	
	private String louceng;
		
	/**
	 * 单元号
	 */
	
	private String danyuanhao;
		
	/**
	 * 房型
	 */
	
	private String fangxing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 户型
	 */
	
	private String huxing;
		
	/**
	 * 面积
	 */
	
	private String mianji;
		
	/**
	 * 价格
	 */
	
	private Integer jiage;
		
	/**
	 * 详细地址
	 */
	
	private String xiangxidizhi;
		
	/**
	 * 入住状态
	 */
	
	private String ruzhuzhuangtai;
				
	
	/**
	 * 设置：楼层
	 */
	 
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
				
	
	/**
	 * 设置：单元号
	 */
	 
	public void setDanyuanhao(String danyuanhao) {
		this.danyuanhao = danyuanhao;
	}
	
	/**
	 * 获取：单元号
	 */
	public String getDanyuanhao() {
		return danyuanhao;
	}
				
	
	/**
	 * 设置：房型
	 */
	 
	public void setFangxing(String fangxing) {
		this.fangxing = fangxing;
	}
	
	/**
	 * 获取：房型
	 */
	public String getFangxing() {
		return fangxing;
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
	 * 设置：户型
	 */
	 
	public void setHuxing(String huxing) {
		this.huxing = huxing;
	}
	
	/**
	 * 获取：户型
	 */
	public String getHuxing() {
		return huxing;
	}
				
	
	/**
	 * 设置：面积
	 */
	 
	public void setMianji(String mianji) {
		this.mianji = mianji;
	}
	
	/**
	 * 获取：面积
	 */
	public String getMianji() {
		return mianji;
	}
				
	
	/**
	 * 设置：价格
	 */
	 
	public void setJiage(Integer jiage) {
		this.jiage = jiage;
	}
	
	/**
	 * 获取：价格
	 */
	public Integer getJiage() {
		return jiage;
	}
				
	
	/**
	 * 设置：详细地址
	 */
	 
	public void setXiangxidizhi(String xiangxidizhi) {
		this.xiangxidizhi = xiangxidizhi;
	}
	
	/**
	 * 获取：详细地址
	 */
	public String getXiangxidizhi() {
		return xiangxidizhi;
	}
				
	
	/**
	 * 设置：入住状态
	 */
	 
	public void setRuzhuzhuangtai(String ruzhuzhuangtai) {
		this.ruzhuzhuangtai = ruzhuzhuangtai;
	}
	
	/**
	 * 获取：入住状态
	 */
	public String getRuzhuzhuangtai() {
		return ruzhuzhuangtai;
	}
			
}
