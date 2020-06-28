package com.yejh.coronovirus.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yejh.coronovirus.mapper.HeroMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yejh
 * @create 2020-04_17 18:02
 */

@Controller
public class HeroController {
    @Autowired
    private HeroMapper heroMapper;

    @GetMapping("/heroes")
    public String toHeroPage(Model model) {
        model.addAttribute("heroes", heroMapper.getAllHeroes());
        return "hero";
    }

}
