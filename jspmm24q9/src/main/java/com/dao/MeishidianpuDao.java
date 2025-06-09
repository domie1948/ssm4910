package com.dao;

import com.entity.MeishidianpuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishidianpuVO;
import com.entity.view.MeishidianpuView;


/**
 * 美食店铺
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface MeishidianpuDao extends BaseMapper<MeishidianpuEntity> {
	
	List<MeishidianpuVO> selectListVO(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
	MeishidianpuVO selectVO(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
	List<MeishidianpuView> selectListView(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);

	List<MeishidianpuView> selectListView(Pagination page,@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
	MeishidianpuView selectView(@Param("ew") Wrapper<MeishidianpuEntity> wrapper);
	
}
