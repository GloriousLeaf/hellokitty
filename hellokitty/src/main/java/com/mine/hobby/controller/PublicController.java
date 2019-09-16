package com.mine.hobby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zengnian
 * @date 2019/9/9 17:03
 */

@Controller
public class PublicController {

   private static final Logger logger = LoggerFactory.getLogger("appLogger");

   @RequestMapping("/public/test")
   public String test() {
      logger.info("这是测试");
      return "test.html";
   }

   @RequestMapping("/public/get")
   @ResponseBody
   public String get() {
      return "我爱你中国";
   }
}
