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


import com.dao.RemenmeishiDao;
import com.entity.RemenmeishiEntity;
import com.service.RemenmeishiService;
import com.entity.vo.RemenmeishiVO;
import com.entity.view.RemenmeishiView;

@Service("remenmeishiService")
public class RemenmeishiServiceImpl extends ServiceImpl<RemenmeishiDao, RemenmeishiEntity> implements RemenmeishiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenmeishiEntity> page = this.selectPage(
                new Query<RemenmeishiEntity>(params).getPage(),
                new EntityWrapper<RemenmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenmeishiEntity> wrapper) {
		  Page<RemenmeishiView> page =new Query<RemenmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenmeishiVO> selectListVO(Wrapper<RemenmeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenmeishiVO selectVO(Wrapper<RemenmeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenmeishiView> selectListView(Wrapper<RemenmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenmeishiView selectView(Wrapper<RemenmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
