package com.dao;

import com.entity.ZhuhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuhuxinxiVO;
import com.entity.view.ZhuhuxinxiView;


/**
 * 住户信息
 * 
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public interface ZhuhuxinxiDao extends BaseMapper<ZhuhuxinxiEntity> {
	
	List<ZhuhuxinxiVO> selectListVO(@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);
	
	ZhuhuxinxiVO selectVO(@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);
	
	List<ZhuhuxinxiView> selectListView(@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);

	List<ZhuhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);
	
	ZhuhuxinxiView selectView(@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);
	
}
