package com.yejh.coronovirus;

import com.yejh.coronovirus.entity.News;
import com.yejh.coronovirus.mapper.NewsMapper;
import com.yejh.coronovirus.repository.NewsRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CoronovirusApplicationTests {
    @Autowired
    NewsRepository newsRepository;

    @Autowired
    NewsMapper newsMapper;

//    @Test
//    public void contextLoads() throws Exception {
//        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("static/news.yml");
//        Scanner scanner = new Scanner(resourceAsStream);
//        String line;
//        String head;
//        Integer location = 1;
//        News news = null;
//        Date date = null;
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
//        while (scanner.hasNext()) {
//            line = scanner.nextLine().trim();
//            if (line.startsWith("- date")) {
//                date = dateFormat.parse(line.substring(8));
//            } else if (line.startsWith("- item_name: group")) {
//                line = scanner.nextLine();
//                switch (line.charAt(15)) {
//                    case '武':
//                        location = 1;
//                        break;
//                    case '中':
//                        location = 2;
//                        break;
//                    case '国':
//                        location = 3;
//                        break;
//                }
//            } else if(line.startsWith("- item_name: news")){
//                news = new News();
//                news.setLocationId(location);
//                news.setDate(date);
//                line = scanner.nextLine();
//                news.setContent(line.substring(14));
//                System.out.println(news);
//                newsRepository.save(news);
//            }
//        }
//    }
//
//    @Test
//    public void testGetNews(){
//        News one = newsRepository.getOne(1);
//        System.out.println(one);
//    }
//
//    @Test
//    public void testGetDates(){
//        List<Date> dates = newsMapper.getDates();
//        System.out.println(dates);
//    }

}
