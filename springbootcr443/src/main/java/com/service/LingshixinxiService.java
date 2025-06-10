package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingshixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingshixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingshixinxiView;


/**
 * 零食信息
 *
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
public interface LingshixinxiService extends IService<LingshixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingshixinxiVO> selectListVO(Wrapper<LingshixinxiEntity> wrapper);
   	
   	LingshixinxiVO selectVO(@Param("ew") Wrapper<LingshixinxiEntity> wrapper);
   	
   	List<LingshixinxiView> selectListView(Wrapper<LingshixinxiEntity> wrapper);
   	
   	LingshixinxiView selectView(@Param("ew") Wrapper<LingshixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingshixinxiEntity> wrapper);
   	
}

