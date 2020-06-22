package controller;

import model.UserDAO;
import model.UserVO;

public class Controller {

	private UserDAO dao = new UserDAO();
	private UserVO loginUser;

	public UserVO getLoginUser() {
		return loginUser;
	}

	public boolean login(UserVO user) {
		loginUser = dao.selectOne(user);
		if (loginUser == null) {
			return false;
		} else {
			return true;
		}
	}

	public int sendId(String id) {
		int cnt = dao.findId(id);
		return cnt;
	}

	public int join(UserVO joinUser) {
		int cnt = dao.insertUser(joinUser);
		return cnt;
	}

}
