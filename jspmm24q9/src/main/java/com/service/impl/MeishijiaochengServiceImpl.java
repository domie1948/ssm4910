package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.MeishijiaochengDao;
import com.entity.MeishijiaochengEntity;
import com.service.MeishijiaochengService;
import com.entity.vo.MeishijiaochengVO;
import com.entity.view.MeishijiaochengView;

@Service("meishijiaochengService")
public class MeishijiaochengServiceImpl extends ServiceImpl<MeishijiaochengDao, MeishijiaochengEntity> implements MeishijiaochengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<MeishijiaochengEntity> page = this.selectPage(
                new Query<MeishijiaochengEntity>(params).getPage(),
                new EntityWrapper<MeishijiaochengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<MeishijiaochengEntity> wrapper) {
		  Page<MeishijiaochengView> page =new Query<MeishijiaochengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<MeishijiaochengVO> selectListVO(Wrapper<MeishijiaochengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public MeishijiaochengVO selectVO(Wrapper<MeishijiaochengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<MeishijiaochengView> selectListView(Wrapper<MeishijiaochengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public MeishijiaochengView selectView(Wrapper<MeishijiaochengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
