package com.entity.view;

import com.entity.XiaoqudituEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 小区地图
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
@TableName("xiaoquditu")
public class XiaoqudituView  extends XiaoqudituEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoqudituView(){
	}
 
 	public XiaoqudituView(XiaoqudituEntity xiaoqudituEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoqudituEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
