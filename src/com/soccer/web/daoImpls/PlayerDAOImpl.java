package com.soccer.web.daoImpls;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.soccer.web.daos.PlayerDAO;
import com.soccer.web.domains.PlayerBean;
import com.soccer.web.factory.DatabaseFactory;
import com.soccer.web.pool.Constants;

public class PlayerDAOImpl implements PlayerDAO{
	private static PlayerDAOImpl instance = new PlayerDAOImpl();	
	public static PlayerDAOImpl getInstance() {return instance;}
	private PlayerDAOImpl() {}

	@Override
	public PlayerBean selectByPlayerIdSolar(PlayerBean param) {
		PlayerBean player = null;
		String sql = "SELECT *\n" + 
				"FROM PLAYER\n" + 
				"WHERE PLAYER_ID LIKE ?\n" + 
				"AND SOLAR LIKE ?";
		try {
			PreparedStatement stmt = DatabaseFactory
					.createDatabase(Constants.VENDOR)
					.getcConnection()
					.prepareStatement(sql);
			stmt.setString(1, param.getPlayer_Id());
			stmt.setString(2, param.getSolar());
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				player = new PlayerBean();
				player.setBack_No(rs.getString("BACK_NO"));
				player.setBirth_Date(rs.getString("BIRTH_DATE"));
				player.setPlayer_name(rs.getString("PLAYER_NAME"));
				player.setHeight(rs.getString("HEIGHT"));
				player.setJoin_Yyyy(rs.getString("JOIN_YYYY"));
				player.setNation(rs.getString("NATION"));
				player.setNickname(rs.getString("NICKNAME"));
				player.setPlayer_Id(rs.getString("PLAYER_ID"));
				player.setE_Player_Name(rs.getString("E_PLAYER_NAME"));
				player.setPosition(rs.getString("POSITION"));
				player.setSolar(rs.getString("SOLAR"));
				player.setTeam_Id(rs.getString("TEAM_ID"));
				player.setWeight(rs.getString("WEIGHT"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("9. 반환된 결과값 : "+ player);
		return player;
		
	}
	
	@Override
	public List<String> selectPositions() {
		List<String> positions = new ArrayList<>();
		try {
			String sql = "SELECT DISTINCT POSITION position \n" +
					"FROM PLAYER";
			ResultSet rs = DatabaseFactory.createDatabase(Constants.VENDOR)
					.getcConnection()
					.prepareStatement(sql)
					.executeQuery();
				
			while(rs.next()) {
				positions.add(rs.getString("position"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return positions;
	}

	@Override
	public List<PlayerBean> findByTeamIdPosition(PlayerBean param) {
		List<PlayerBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public List<PlayerBean> findByTeamIdHeightPlayer_Name(PlayerBean param) {
		List<PlayerBean> list2 = new ArrayList<>();
		return list2;
	}
	@Override
	public List<PlayerBean> selectMany(PlayerBean param) {
		List<PlayerBean> list3 = new ArrayList<>();
		return list3;
	}
}
