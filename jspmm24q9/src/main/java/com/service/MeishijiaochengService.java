package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.MeishijiaochengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.MeishijiaochengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishijiaochengView;


/**
 * 美食教程
 *
 * @author 
 * @email 
 * @date 2021-03-22 10:16:10
 */
public interface MeishijiaochengService extends IService<MeishijiaochengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<MeishijiaochengVO> selectListVO(Wrapper<MeishijiaochengEntity> wrapper);
   	
   	MeishijiaochengVO selectVO(@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);
   	
   	List<MeishijiaochengView> selectListView(Wrapper<MeishijiaochengEntity> wrapper);
   	
   	MeishijiaochengView selectView(@Param("ew") Wrapper<MeishijiaochengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<MeishijiaochengEntity> wrapper);
   	
}

