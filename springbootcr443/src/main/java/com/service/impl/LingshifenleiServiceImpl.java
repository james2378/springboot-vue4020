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


import com.dao.LingshifenleiDao;
import com.entity.LingshifenleiEntity;
import com.service.LingshifenleiService;
import com.entity.vo.LingshifenleiVO;
import com.entity.view.LingshifenleiView;

@Service("lingshifenleiService")
public class LingshifenleiServiceImpl extends ServiceImpl<LingshifenleiDao, LingshifenleiEntity> implements LingshifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingshifenleiEntity> page = this.selectPage(
                new Query<LingshifenleiEntity>(params).getPage(),
                new EntityWrapper<LingshifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingshifenleiEntity> wrapper) {
		  Page<LingshifenleiView> page =new Query<LingshifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingshifenleiVO> selectListVO(Wrapper<LingshifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingshifenleiVO selectVO(Wrapper<LingshifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingshifenleiView> selectListView(Wrapper<LingshifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingshifenleiView selectView(Wrapper<LingshifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
