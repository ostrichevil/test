package demo.RmiTest;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public interface RemoteServiceInterface extends Remote {
    /**
     * 这个RMI接口负责查询目前已经注册的所有用户信息
     */
    public List<UserInfo> queryAllUserinfo() throws RemoteException;


    public String BookRoom(String studentId, String roomnum, Date date, ArrayList<String> d_timeslot) throws RemoteException;
    public String SearchRoom(Date date) throws RemoteException;
    public String CancelRoom(String bookingID) throws RemoteException;

    public String CreateRoom (String adminId,String roomnum, Date date, ArrayList<String> timeslot) throws RemoteException;
    public String DeleteRoom (String adminId,String roomnum, Date date, ArrayList<String> timeslot) throws RemoteException;
}
