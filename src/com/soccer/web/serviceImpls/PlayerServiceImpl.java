package com.soccer.web.serviceImpls;

import java.util.List;
import com.soccer.web.daoImpls.PlayerDAOImpl;
import com.soccer.web.daos.PlayerDAO;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.services.PlayerService;

public class PlayerServiceImpl implements PlayerService{
	private static PlayerServiceImpl instance = new PlayerServiceImpl();
	public static PlayerServiceImpl getInstance() {
		return instance;
	}
	private PlayerServiceImpl() {
	}
	
	@Override
	public PlayerBean login(PlayerBean param) {
		System.out.println("6. PlayerServiceImpl 의 login()으로 이동");
		System.out.println(String.format("param 값 출력 : %s, %s",
				param.getPlayerId(),
				param.getSolar()));
		return  PlayerDAOImpl.getInstance().selectByPlayerIdSolar(param);
	}
	@Override
	public List<String> findPositions() {
		return PlayerDAOImpl.getInstance().selectPositions();
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		return PlayerDAOImpl.getInstance().findByTeamIdPosition(param);
	}

	@Override
	public List<PlayerBean> findByTeamIdHeightPlayer_Name(PlayerBean param) {
		return PlayerDAOImpl.getInstance().findByTeamIdHeightPlayer_Name(param);
	}


}
