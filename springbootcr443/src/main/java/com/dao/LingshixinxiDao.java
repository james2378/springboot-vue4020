package com.dao;

import com.entity.LingshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingshixinxiVO;
import com.entity.view.LingshixinxiView;


/**
 * 零食信息
 * 
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
public interface LingshixinxiDao extends BaseMapper<LingshixinxiEntity> {
	
	List<LingshixinxiVO> selectListVO(@Param("ew") Wrapper<LingshixinxiEntity> wrapper);
	
	LingshixinxiVO selectVO(@Param("ew") Wrapper<LingshixinxiEntity> wrapper);
	
	List<LingshixinxiView> selectListView(@Param("ew") Wrapper<LingshixinxiEntity> wrapper);

	List<LingshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<LingshixinxiEntity> wrapper);
	
	LingshixinxiView selectView(@Param("ew") Wrapper<LingshixinxiEntity> wrapper);
	
}
