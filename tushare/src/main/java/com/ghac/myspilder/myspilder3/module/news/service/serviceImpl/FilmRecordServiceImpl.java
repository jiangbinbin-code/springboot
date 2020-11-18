package com.ghac.myspilder.myspilder3.module.news.service.serviceImpl;

import com.ghac.myspilder.myspilder3.module.news.dao.FilmRecordDao;
import com.ghac.myspilder.myspilder3.module.news.entity.FilmRecordEntity;
import com.ghac.myspilder.myspilder3.module.news.service.FilmRecordService;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

@Service("filmRecordService")
public class FilmRecordServiceImpl extends ServiceImpl<FilmRecordDao, FilmRecordEntity> implements FilmRecordService {


}
