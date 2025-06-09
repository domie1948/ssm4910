package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussmeishijiaochengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussmeishijiaochengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussmeishijiaochengView;


/**
 * 美食教程评论表
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface DiscussmeishijiaochengService extends IService<DiscussmeishijiaochengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussmeishijiaochengVO> selectListVO(Wrapper<DiscussmeishijiaochengEntity> wrapper);
   	
   	DiscussmeishijiaochengVO selectVO(@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);
   	
   	List<DiscussmeishijiaochengView> selectListView(Wrapper<DiscussmeishijiaochengEntity> wrapper);
   	
   	DiscussmeishijiaochengView selectView(@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussmeishijiaochengEntity> wrapper);
   	
}

