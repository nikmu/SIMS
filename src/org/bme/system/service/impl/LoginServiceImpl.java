package org.bme.system.service.impl;

import org.bme.common.dao.BaseDao;
import org.bme.common.entity.Yhxxb;
import org.bme.system.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl<T> implements LoginService<T> {
	@Autowired
	private BaseDao<Yhxxb> baseDao;

	@Override
	public Yhxxb addYhxxb(Yhxxb yhxxb) {
		return baseDao.add(yhxxb);
	}
}
