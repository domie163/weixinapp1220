package com.dao;

import com.entity.XiaoqudituEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoqudituVO;
import com.entity.view.XiaoqudituView;


/**
 * 小区地图
 * 
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public interface XiaoqudituDao extends BaseMapper<XiaoqudituEntity> {
	
	List<XiaoqudituVO> selectListVO(@Param("ew") Wrapper<XiaoqudituEntity> wrapper);
	
	XiaoqudituVO selectVO(@Param("ew") Wrapper<XiaoqudituEntity> wrapper);
	
	List<XiaoqudituView> selectListView(@Param("ew") Wrapper<XiaoqudituEntity> wrapper);

	List<XiaoqudituView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoqudituEntity> wrapper);
	
	XiaoqudituView selectView(@Param("ew") Wrapper<XiaoqudituEntity> wrapper);
	
}
