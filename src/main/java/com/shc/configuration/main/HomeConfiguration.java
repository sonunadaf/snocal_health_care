package com.shc.configuration.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shc.constant.JSPConstants;

@Controller
public class HomeConfiguration {
	Logger logger = LoggerFactory.getLogger(HomeConfiguration.class);

	public HomeConfiguration() {
		logger.info("Logger instiate from Constructor");
	}

	@RequestMapping(value = "/")
	public String index() {
		return JSPConstants.INDEX;
	}

}
