package com.ghac.tusahre.module.news.service.serviceImpl;

import com.ghac.tusahre.module.news.dao.FilmRecordDao;
import com.ghac.tusahre.module.news.entity.FilmRecordEntity;
import com.ghac.tusahre.module.news.service.FilmRecordService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("filmRecordService")
public class FilmRecordServiceImpl extends ServiceImpl<FilmRecordDao, FilmRecordEntity> implements FilmRecordService {


}
