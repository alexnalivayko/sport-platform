package net.technology.information.sport.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.util.Map;

@Slf4j
@Controller
public class DashboardController {

	@Autowired
	DataSource dataSource;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homeNewsPage(Map model) {

		return "index";
	}
}
