package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishidianpuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishidianpuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishidianpuView;


/**
 * 美食店铺评论表
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface DiscussmeishidianpuService extends IService<DiscussmeishidianpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishidianpuVO> selectListVO(Wrapper<DiscussmeishidianpuEntity> wrapper);
   	
   	DiscussmeishidianpuVO selectVO(@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);
   	
   	List<DiscussmeishidianpuView> selectListView(Wrapper<DiscussmeishidianpuEntity> wrapper);
   	
   	DiscussmeishidianpuView selectView(@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishidianpuEntity> wrapper);
   	
}

