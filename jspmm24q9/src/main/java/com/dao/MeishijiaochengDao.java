package com.dao;

import com.entity.MeishijiaochengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.MeishijiaochengVO;
import com.entity.view.MeishijiaochengView;


/**
 * 美食教程
 * 
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface MeishijiaochengDao extends BaseMapper<MeishijiaochengEntity> {
	
	List<MeishijiaochengVO> selectListVO(@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);
	
	MeishijiaochengVO selectVO(@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);
	
	List<MeishijiaochengView> selectListView(@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);

	List<MeishijiaochengView> selectListView(Pagination page,@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);
	
	MeishijiaochengView selectView(@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);
	
}
