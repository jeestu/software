package edu.zut.cs.software.sun.order.domain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import edu.zut.cs.software.jdbc.BaseDao;



public class Order_Up extends BaseDao{
	public static Order_Up instan=new Order_Up();
    public static Order_Up getintstan() {
        return instan;
    }
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public List findAll(){
        List list=new ArrayList();
        try {
           // conn=this.getCo
            ps=conn.prepareStatement("select * from t_order");
            rs=ps.executeQuery();

            while(rs.next()){
            	Order order=new Order();
               
            	order.setOrder_Name(rs.getString("ORDERNAME"));
            	order.setOrderTimer(rs.getString("ORDERTIME"));
                list.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeAll(rs, ps, conn);
        }
        return list;
    }
    public int upd(Order order){
        String sql="update t_order set  ORDERTIME=? where ORDERNAME=?";
        String[] params={
        	
        		//order.getOrder_Name(),
        		order.getOrderTimer(),
        		order.getOrder_Name(),
                //String.valueOf(order.getId())
        };
        return this.exeUda(params, sql);
    }
    public int del(String orderName){
        String sql="delete from t_order where ORDERNAME=?";
        String[] params={
                String.valueOf(orderName)
        };
        return this.exeUda(params, sql);
    }
    public Order findOne(String orderName){
    	Order order=new Order();
        try {
            conn=this.getConn();
            ps=conn.prepareStatement("select * from t_order where ORDERNAME=?");
            ps.setString(1, orderName);
            rs=ps.executeQuery();
            while(rs.next()){
               
                order.setOrder_Name(rs.getString("ORDERNAME"));
                
                order.setOrderTimer(rs.getString("ORDERTIME"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.closeAll(rs, ps, conn);
        }

        return order;
    }
}
