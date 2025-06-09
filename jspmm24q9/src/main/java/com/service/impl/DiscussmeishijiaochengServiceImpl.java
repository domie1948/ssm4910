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


import com.dao.DiscussmeishijiaochengDao;
import com.entity.DiscussmeishijiaochengEntity;
import com.service.DiscussmeishijiaochengService;
import com.entity.vo.DiscussmeishijiaochengVO;
import com.entity.view.DiscussmeishijiaochengView;

@Service("discussmeishijiaochengService")
public class DiscussmeishijiaochengServiceImpl extends ServiceImpl<DiscussmeishijiaochengDao, DiscussmeishijiaochengEntity> implements DiscussmeishijiaochengService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishijiaochengEntity> page = this.selectPage(
                new Query<DiscussmeishijiaochengEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishijiaochengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishijiaochengEntity> wrapper) {
		  Page<DiscussmeishijiaochengView> page =new Query<DiscussmeishijiaochengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishijiaochengVO> selectListVO(Wrapper<DiscussmeishijiaochengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishijiaochengVO selectVO(Wrapper<DiscussmeishijiaochengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishijiaochengView> selectListView(Wrapper<DiscussmeishijiaochengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishijiaochengView selectView(Wrapper<DiscussmeishijiaochengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
