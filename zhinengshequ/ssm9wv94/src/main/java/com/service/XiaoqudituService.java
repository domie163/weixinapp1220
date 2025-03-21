package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoqudituEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoqudituVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoqudituView;


/**
 * 小区地图
 *
 * @author 
 * @email 
 * @date 2021-05-20 20:14:45
 */
public interface XiaoqudituService extends IService<XiaoqudituEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoqudituVO> selectListVO(Wrapper<XiaoqudituEntity> wrapper);
   	
   	XiaoqudituVO selectVO(@Param("ew") Wrapper<XiaoqudituEntity> wrapper);
   	
   	List<XiaoqudituView> selectListView(Wrapper<XiaoqudituEntity> wrapper);
   	
   	XiaoqudituView selectView(@Param("ew") Wrapper<XiaoqudituEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoqudituEntity> wrapper);
   	
}

