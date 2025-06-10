package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusslingshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusslingshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusslingshixinxiView;


/**
 * 零食信息评论表
 *
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
public interface DiscusslingshixinxiService extends IService<DiscusslingshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusslingshixinxiVO> selectListVO(Wrapper<DiscusslingshixinxiEntity> wrapper);
   	
   	DiscusslingshixinxiVO selectVO(@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);
   	
   	List<DiscusslingshixinxiView> selectListView(Wrapper<DiscusslingshixinxiEntity> wrapper);
   	
   	DiscusslingshixinxiView selectView(@Param("ew") Wrapper<DiscusslingshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusslingshixinxiEntity> wrapper);
   	
}

