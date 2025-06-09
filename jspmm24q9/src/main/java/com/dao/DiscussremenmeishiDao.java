package com.dao;

import com.entity.DiscussremenmeishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremenmeishiVO;
import com.entity.view.DiscussremenmeishiView;


/**
 * 热门美食评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface DiscussremenmeishiDao extends BaseMapper<DiscussremenmeishiEntity> {
	
	List<DiscussremenmeishiVO> selectListVO(@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);
	
	DiscussremenmeishiVO selectVO(@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);
	
	List<DiscussremenmeishiView> selectListView(@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);

	List<DiscussremenmeishiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);
	
	DiscussremenmeishiView selectView(@Param("ew") Wrapper<DiscussremenmeishiEntity> wrapper);
	
}
