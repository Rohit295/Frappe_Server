package com.dr.server.endpoint;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/v1/*")
public class ExpenseController implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Post a New Expense
	 * @return
	 */
	@RequestMapping(value = "/expense", method = RequestMethod.GET)
    public String addExpense() {
        return "This is a test String";

    }

}