package com.entity.view;

import com.entity.DiscusslingshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 零食信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
@TableName("discusslingshixinxi")
public class DiscusslingshixinxiView  extends DiscusslingshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusslingshixinxiView(){
	}
 
 	public DiscusslingshixinxiView(DiscusslingshixinxiEntity discusslingshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discusslingshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
