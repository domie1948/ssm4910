package com.dao;

import com.entity.DiscussmeishidianpuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussmeishidianpuVO;
import com.entity.view.DiscussmeishidianpuView;


/**
 * 美食店铺评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface DiscussmeishidianpuDao extends BaseMapper<DiscussmeishidianpuEntity> {
	
	List<DiscussmeishidianpuVO> selectListVO(@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);
	
	DiscussmeishidianpuVO selectVO(@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);
	
	List<DiscussmeishidianpuView> selectListView(@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);

	List<DiscussmeishidianpuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);
	
	DiscussmeishidianpuView selectView(@Param("ew") Wrapper<DiscussmeishidianpuEntity> wrapper);
	
}
