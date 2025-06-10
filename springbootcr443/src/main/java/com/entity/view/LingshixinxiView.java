package com.entity.view;

import com.entity.LingshixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 零食信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-15 12:56:17
 */
@TableName("lingshixinxi")
public class LingshixinxiView  extends LingshixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingshixinxiView(){
	}
 
 	public LingshixinxiView(LingshixinxiEntity lingshixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, lingshixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
