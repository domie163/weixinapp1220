package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuhuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuhuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuhuxinxiView;


/**
 * 住户信息
 *
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public interface ZhuhuxinxiService extends IService<ZhuhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuhuxinxiVO> selectListVO(Wrapper<ZhuhuxinxiEntity> wrapper);
   	
   	ZhuhuxinxiVO selectVO(@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);
   	
   	List<ZhuhuxinxiView> selectListView(Wrapper<ZhuhuxinxiEntity> wrapper);
   	
   	ZhuhuxinxiView selectView(@Param("ew") Wrapper<ZhuhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuhuxinxiEntity> wrapper);
   	
}

