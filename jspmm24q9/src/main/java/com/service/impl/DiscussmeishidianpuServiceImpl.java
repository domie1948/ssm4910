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


import com.dao.DiscussmeishidianpuDao;
import com.entity.DiscussmeishidianpuEntity;
import com.service.DiscussmeishidianpuService;
import com.entity.vo.DiscussmeishidianpuVO;
import com.entity.view.DiscussmeishidianpuView;

@Service("discussmeishidianpuService")
public class DiscussmeishidianpuServiceImpl extends ServiceImpl<DiscussmeishidianpuDao, DiscussmeishidianpuEntity> implements DiscussmeishidianpuService {


    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussmeishidianpuEntity> page = this.selectPage(
                new Query<DiscussmeishidianpuEntity>(params).getPage(),
                new EntityWrapper<DiscussmeishidianpuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussmeishidianpuEntity> wrapper) {
		  Page<DiscussmeishidianpuView> page =new Query<DiscussmeishidianpuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussmeishidianpuVO> selectListVO(Wrapper<DiscussmeishidianpuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussmeishidianpuVO selectVO(Wrapper<DiscussmeishidianpuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussmeishidianpuView> selectListView(Wrapper<DiscussmeishidianpuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussmeishidianpuView selectView(Wrapper<DiscussmeishidianpuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
