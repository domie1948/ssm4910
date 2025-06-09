package com.entity.view;

import com.entity.DiscussmeishidianpuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食店铺评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
@TableName("discussmeishidianpu")
public class DiscussmeishidianpuView  extends DiscussmeishidianpuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussmeishidianpuView(){
	}
 
 	public DiscussmeishidianpuView(DiscussmeishidianpuEntity discussmeishidianpuEntity){
 	try {
			BeanUtils.copyProperties(this, discussmeishidianpuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
