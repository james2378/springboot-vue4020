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


import com.dao.LingshixinxiDao;
import com.entity.LingshixinxiEntity;
import com.service.LingshixinxiService;
import com.entity.vo.LingshixinxiVO;
import com.entity.view.LingshixinxiView;

@Service("lingshixinxiService")
public class LingshixinxiServiceImpl extends ServiceImpl<LingshixinxiDao, LingshixinxiEntity> implements LingshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingshixinxiEntity> page = this.selectPage(
                new Query<LingshixinxiEntity>(params).getPage(),
                new EntityWrapper<LingshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingshixinxiEntity> wrapper) {
		  Page<LingshixinxiView> page =new Query<LingshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingshixinxiVO> selectListVO(Wrapper<LingshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingshixinxiVO selectVO(Wrapper<LingshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingshixinxiView> selectListView(Wrapper<LingshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingshixinxiView selectView(Wrapper<LingshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
