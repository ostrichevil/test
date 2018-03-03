package demo.RmiTest;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RemoteClient {
    public static void main(String[] args) throws Exception {
        RemoteServiceInterface remoteServiceInterface = (RemoteServiceInterface) Naming.lookup("server_kvl");
        Date date = new Date();
        List<String> bb = new ArrayList<String>();
        String aaa = remoteServiceInterface.BookRoom("adsa", "123", date, (ArrayList<String>) bb);
        String bbb = remoteServiceInterface.CreateRoom("abcd", "abc", date, (ArrayList<String>) bb);
        String ccc = remoteServiceInterface.SearchRoom(date);
        List<UserInfo> list = remoteServiceInterface.queryAllUserinfo();

    }
}
