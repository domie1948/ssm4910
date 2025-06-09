package com.dao;

import com.entity.DiscussmeishijiaochengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishijiaochengVO;
import com.entity.view.DiscussmeishijiaochengView;


/**
 * 美食教程评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface DiscussmeishijiaochengDao extends BaseMapper<DiscussmeishijiaochengEntity> {
	
	List<DiscussmeishijiaochengVO> selectListVO(@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);
	
	DiscussmeishijiaochengVO selectVO(@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);
	
	List<DiscussmeishijiaochengView> selectListView(@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);

	List<DiscussmeishijiaochengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);
	
	DiscussmeishijiaochengView selectView(@Param("ew") Wrapper<DiscussmeishijiaochengEntity> wrapper);
	
}
