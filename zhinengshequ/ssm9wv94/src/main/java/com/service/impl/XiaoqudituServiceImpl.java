package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaoqudituDao;
import com.entity.XiaoqudituEntity;
import com.service.XiaoqudituService;
import com.entity.vo.XiaoqudituVO;
import com.entity.view.XiaoqudituView;

@Service("xiaoqudituService")
public class XiaoqudituServiceImpl extends ServiceImpl<XiaoqudituDao, XiaoqudituEntity> implements XiaoqudituService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoqudituEntity> page = this.selectPage(
                new Query<XiaoqudituEntity>(params).getPage(),
                new EntityWrapper<XiaoqudituEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoqudituEntity> wrapper) {
		  Page<XiaoqudituView> page =new Query<XiaoqudituView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoqudituVO> selectListVO(Wrapper<XiaoqudituEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoqudituVO selectVO(Wrapper<XiaoqudituEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoqudituView> selectListView(Wrapper<XiaoqudituEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoqudituView selectView(Wrapper<XiaoqudituEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
