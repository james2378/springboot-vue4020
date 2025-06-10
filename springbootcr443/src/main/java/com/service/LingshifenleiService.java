package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingshifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingshifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingshifenleiView;


/**
 * 零食分类
 *
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
public interface LingshifenleiService extends IService<LingshifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingshifenleiVO> selectListVO(Wrapper<LingshifenleiEntity> wrapper);
   	
   	LingshifenleiVO selectVO(@Param("ew") Wrapper<LingshifenleiEntity> wrapper);
   	
   	List<LingshifenleiView> selectListView(Wrapper<LingshifenleiEntity> wrapper);
   	
   	LingshifenleiView selectView(@Param("ew") Wrapper<LingshifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingshifenleiEntity> wrapper);
   	
}

