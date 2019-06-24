package edu.zut.cs.software.sun.show.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


import edu.zut.cs.software.jdbc.BaseDao;

public class ClothesBaseDao extends BaseDao{
	
	public static ClothesBaseDao instan = new ClothesBaseDao();
	public static ClothesBaseDao getintstan(){
		return instan;
	}
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	
	public int update(Clothes c)    //更新
	{
		//String sql="update T_CAR set car_number=?,car_volume=?,car_owner?,car_status?,car_owner_tel?,car_road?"+" where id?";
		String sql="update clothes set price=?, where name=?";
		String[] params= {
				c.getPrice(),
				String.valueOf(c.getName())
		};
		return this.exeUda(params, sql);
	}
	
	/**public Clothes findOne(String SiteId){
		Clothes s=null;
		try {
			conn=this.getConn();
			ps=conn.prepareStatement("select * from T_SITE where SITE_ID=?");
			ps.setInt(1, SiteId);
			rs=ps.executeQuery();
			while(rs.next()){
				s=new Clothes();
				s.setSiteId(rs.getInt("SITE_ID"));
				s.setName(rs.getString("SITE_NAME"));
				s.setInfo(rs.getString("SITE_INFO"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.closeAll(rs, ps, conn);
		}
		
		return s;
	}**/
}
	
	
