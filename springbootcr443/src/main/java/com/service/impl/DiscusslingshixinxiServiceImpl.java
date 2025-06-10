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


import com.dao.DiscusslingshixinxiDao;
import com.entity.DiscusslingshixinxiEntity;
import com.service.DiscusslingshixinxiService;
import com.entity.vo.DiscusslingshixinxiVO;
import com.entity.view.DiscusslingshixinxiView;

@Service("discusslingshixinxiService")
public class DiscusslingshixinxiServiceImpl extends ServiceImpl<DiscusslingshixinxiDao, DiscusslingshixinxiEntity> implements DiscusslingshixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusslingshixinxiEntity> page = this.selectPage(
                new Query<DiscusslingshixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusslingshixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusslingshixinxiEntity> wrapper) {
		  Page<DiscusslingshixinxiView> page =new Query<DiscusslingshixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusslingshixinxiVO> selectListVO(Wrapper<DiscusslingshixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusslingshixinxiVO selectVO(Wrapper<DiscusslingshixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusslingshixinxiView> selectListView(Wrapper<DiscusslingshixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusslingshixinxiView selectView(Wrapper<DiscusslingshixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
