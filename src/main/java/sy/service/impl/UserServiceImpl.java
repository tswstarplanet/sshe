package sy.service.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import sy.service.UserServiceI;

@Service("userService")
public class UserServiceImpl implements UserServiceI {

	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
	
	public void test() {
		logger.info("測試測試");
	}

}
