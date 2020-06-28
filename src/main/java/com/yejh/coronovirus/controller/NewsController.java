package com.yejh.coronovirus.controller;

import com.yejh.coronovirus.entity.News;
import com.yejh.coronovirus.mapper.NewsMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.runtime.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author yejh
 * @create 2020-04_16 22:40
 */

@Controller
public class NewsController {
    @Autowired
    private NewsMapper newsMapper;

    private static Logger logger = LoggerFactory.getLogger(NewsController.class);

    @GetMapping("/news")
    public String toNewsPage(Model model){
        List<Date> dates = newsMapper.getDates();
        model.addAttribute("dates", dates);
        return "timeline";
    }

    @ResponseBody
    @GetMapping("/news/date/{date}")
    public List<News> findNewsByDate(@PathVariable("date") Date date){
        logger.info("findNewsByDate(" + date + ")");
        List<News> newsByDate = newsMapper.findNewsByDate(date);
        return newsByDate;
    }

    @GetMapping("/nav")
    public String toNavPage(){
        return "commons/nav";
    }
}
