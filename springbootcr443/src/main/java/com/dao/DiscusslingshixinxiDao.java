package com.dao;

import com.entity.DiscusslingshixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusslingshixinxiVO;
import com.entity.view.DiscusslingshixinxiView;


/**
 * 零食信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
public interface DiscusslingshixinxiDao extends BaseMapper<DiscusslingshixinxiEntity> {
	
	List<DiscusslingshixinxiVO> selectListVO(@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);
	
	DiscusslingshixinxiVO selectVO(@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);
	
	List<DiscusslingshixinxiView> selectListView(@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);

	List<DiscusslingshixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);
	
	DiscusslingshixinxiView selectView(@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);
	
}
