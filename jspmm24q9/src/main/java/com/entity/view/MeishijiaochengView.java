package com.entity.view;

import com.entity.MeishijiaochengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 美食教程
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
@TableName("meishijiaocheng")
public class MeishijiaochengView  extends MeishijiaochengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public MeishijiaochengView(){
	}
 
 	public MeishijiaochengView(MeishijiaochengEntity meishijiaochengEntity){
 	try {
			BeanUtils.copyProperties(this, meishijiaochengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
