package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremenmeishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremenmeishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremenmeishiView;


/**
 * 热门美食评论表
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface DiscussremenmeishiService extends IService<DiscussremenmeishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremenmeishiVO> selectListVO(Wrapper<DiscussremenmeishiEntity> wrapper);
   	
   	DiscussremenmeishiVO selectVO(@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);
   	
   	List<DiscussremenmeishiView> selectListView(Wrapper<DiscussremenmeishiEntity> wrapper);
   	
   	DiscussremenmeishiView selectView(@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremenmeishiEntity> wrapper);
   	
}

