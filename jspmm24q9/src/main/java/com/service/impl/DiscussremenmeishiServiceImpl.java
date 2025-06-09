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


import com.dao.DiscussremenmeishiDao;
import com.entity.DiscussremenmeishiEntity;
import com.service.DiscussremenmeishiService;
import com.entity.vo.DiscussremenmeishiVO;
import com.entity.view.DiscussremenmeishiView;

@Service("discussremenmeishiService")
public class DiscussremenmeishiServiceImpl extends ServiceImpl<DiscussremenmeishiDao, DiscussremenmeishiEntity> implements DiscussremenmeishiService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremenmeishiEntity> page = this.selectPage(
                new Query<DiscussremenmeishiEntity>(params).getPage(),
                new EntityWrapper<DiscussremenmeishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremenmeishiEntity> wrapper) {
		  Page<DiscussremenmeishiView> page =new Query<DiscussremenmeishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremenmeishiVO> selectListVO(Wrapper<DiscussremenmeishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremenmeishiVO selectVO(Wrapper<DiscussremenmeishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremenmeishiView> selectListView(Wrapper<DiscussremenmeishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremenmeishiView selectView(Wrapper<DiscussremenmeishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
