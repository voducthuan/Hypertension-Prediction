package tool;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class DBManager{

  public static Connection con = null;//Tao ket noi
  public static Statement stm = null; //Tao statement de thuc hien lenh SQL
  public static ResultSet rss = null; //Ket qua tra ve sau truy van
  private Vector data = null;         //Vector du lieu cua bang
  private Vector columnName = null;   //Vector chua cac ten cua cac columm
  private int colCount;               //So cot cua bang
  private String report = null;       //Thong tin thong bao neu co loi
  // Constructor
  public DBManager(){
    connect(DBConstant.driver,DBConstant.connetionstring);
  }
  // Tao ket noi
  public boolean connect(String driver,String cnstring){
    if(con==null){
      try {
        Class.forName(driver);
        con = DriverManager.getConnection(cnstring);
      }
      catch (ClassNotFoundException e) { // bat ngoai le khi khong khoi tao duoc doi tuong quan ly driver
        report = e.toString();
        return false;
      }
      catch (SQLException e) { // khong tao duoc connection
        report = e.toString();
        return false;
      }
    }
    return true;
  }
  protected boolean getData(){
    try{
      data = new Vector();
      ResultSetMetaData meta = rss.getMetaData();
      columnName = new Vector();
      colCount = meta.getColumnCount();
      for(int i=0;i<colCount;i++){
        columnName.addElement(meta.getColumnName(i+1));
      }
      while(rss.next()){
        Vector rowData = new Vector();
        for(int i=0;i<colCount;i++){
          String field = rss.getString(i+1);
          rowData.addElement(field);
        }
        data.addElement(rowData);
      }
    }catch(SQLException e){
      report = e.toString();
      return false;
    }
    return true;
  }
  // Thuc hien mot cau query
  public boolean querySql(String sql){
    boolean result = true;
    try{
      stm = con.createStatement();
      rss = stm.executeQuery(sql);
      result = getData();
    }catch(SQLException e){
      report = e.toString();
      result = false;
    }
    return result;
  }
  // Thuc hien mo mot ban trong CSDL
  public boolean openTable(String tblName)
  {
    String sql = "Select * From " + tblName;
    return querySql(sql);
  }
  // Lay Vector data dung cho table
  public Vector getDataVector(){
    return data;
  }
  // Lay Vector column dung cho table
  public Vector getColumnNameVector(){
    return columnName;
  }
  // Lay mot field
  public String getItem(int row,int col){
    if(row<0 || row>data.size()) return null;
    if(col<0 || col>(((Vector)data.get(0)).size())) return null;
    return (String)((Vector)data.get(row)).get(col);
  }
  // Lay tong so column
  public int getColsCount(){
   return colCount;
  }
  // Lay tong so record
  public int getRowsCount(){
   return data.size();
  }
  // Thiet lap gia tri moi cho data va datacolumn cua table
  public void setDataVector(Vector data, Vector columnName){
    data = data;
    columnName = columnName;
  }
  // Thuc hien lenh SQL
  public boolean updateSql(String sql){
    try {
      stm = con.createStatement();
      stm.executeUpdate(sql);
    }
    catch (SQLException ex) {
      report = ex.toString();
      return false;
    }
    return true;
  }
  // Tao doi tuong CallableStatement de chuan bi goi Stored Proc
  // sProc co dinh dang "{? = call ProcName(?,?,...)}" -> neu khong co tham so thi khong co ()
  // Dung phuong thuc setxxx() de thiet lap InputParam
  // Dung phuong thuc registerOutParameter() de dang ki kieu du lieu tra ve tu SP
  public CallableStatement makeCall(String sProc){
    CallableStatement cs = null;
    try{
      cs = con.prepareCall(sProc);
    }catch(SQLException e){
      report = e.toString();
    }
    return cs;
  }
  // Goi mot query Stored Proc
  public boolean runQueryStoredProc(CallableStatement cs){
    boolean result = true;
    try{
      rss = cs.executeQuery();
      result = getData();
    }catch(SQLException e){
      report = e.toString();
      result = false;
    }
    return result;
  }
  // Goi mot update Stored Proc
  public boolean runUpdateStoredProc(CallableStatement cs){
    boolean result = true;
    try{
      cs.executeUpdate();
    }catch(SQLException e){
      report = e.toString();
      result = false;
    }
    return result;
  }
  // Lay thong bao sao khi thuc hien mot cau sql va xoa rong thong bao
  public String getReport(){
    String temp = report.toString();
    report = null;
    return temp;
  }
}

