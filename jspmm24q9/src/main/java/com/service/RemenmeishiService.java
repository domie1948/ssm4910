package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenmeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenmeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenmeishiView;


/**
 * 热门美食
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface RemenmeishiService extends IService<RemenmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenmeishiVO> selectListVO(Wrapper<RemenmeishiEntity> wrapper);
   	
   	RemenmeishiVO selectVO(@Param("ew") Wrapper<RemenmeishiEntity> wrapper);
   	
   	List<RemenmeishiView> selectListView(Wrapper<RemenmeishiEntity> wrapper);
   	
   	RemenmeishiView selectView(@Param("ew") Wrapper<RemenmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenmeishiEntity> wrapper);
   	
}

