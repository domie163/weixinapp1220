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


import com.dao.ZhuhuxinxiDao;
import com.entity.ZhuhuxinxiEntity;
import com.service.ZhuhuxinxiService;
import com.entity.vo.ZhuhuxinxiVO;
import com.entity.view.ZhuhuxinxiView;

@Service("zhuhuxinxiService")
public class ZhuhuxinxiServiceImpl extends ServiceImpl<ZhuhuxinxiDao, ZhuhuxinxiEntity> implements ZhuhuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuhuxinxiEntity> page = this.selectPage(
                new Query<ZhuhuxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhuhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuhuxinxiEntity> wrapper) {
		  Page<ZhuhuxinxiView> page =new Query<ZhuhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuhuxinxiVO> selectListVO(Wrapper<ZhuhuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuhuxinxiVO selectVO(Wrapper<ZhuhuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuhuxinxiView> selectListView(Wrapper<ZhuhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuhuxinxiView selectView(Wrapper<ZhuhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
