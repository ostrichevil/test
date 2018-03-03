package demo.RmiTest;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class RemoteUnicastServiceImpl extends UnicastRemoteObject implements RemoteServiceInterface {

    private static final long serialVersionUID = -3869563861765333058L;

    private String server_name = null;

    private HashMap<Date, HashMap<String, ArrayList<String>>> hashMapHashMap =new HashMap<Date, HashMap<String, ArrayList<String>>>();  //课程信息

    private List<RoomRecord> bookRecord = new ArrayList<RoomRecord>();   //选课记录

    private HashMap<String, Integer> bookNum =new HashMap<String, Integer>();  //学生选课次数

    private List<RecordInfo> recordInfoList =new LinkedList<RecordInfo>();   //选课记录

    //  studentId，选课ID

    protected RemoteUnicastServiceImpl(String server_name) throws RemoteException {
        super();
        this.server_name =server_name;
    }

    @Override
    public List<UserInfo> queryAllUserinfo() throws RemoteException {
        List<UserInfo> users = new ArrayList<UserInfo>();

        UserInfo user1 = new UserInfo();
        user1.setUserAge(21);
        user1.setUserDesc("userDesc1");
        user1.setUserName("userName1");
        user1.setUserSex(true);
        users.add(user1);

        UserInfo user2 = new UserInfo();
        user2.setUserAge(21);
        user2.setUserDesc("userDesc2");
        user2.setUserName("userName2");
        user2.setUserSex(false);
        users.add(user2);
        return users;
    }

    @Override
    public String BookRoom(String studentId, String roomnum, Date date, ArrayList<String> d_timeslot) throws RemoteException {
        StringBuilder sb = new StringBuilder(4);
        String str = "bookId";   //生成一个随机id
        for (int i = 0; i < 4; i++) {
            char ch = str.charAt(new Random().nextInt(str.length()));
            sb.append(ch);
        }
        RoomRecord roomRecord = new RoomRecord(date, roomnum, d_timeslot, studentId);
        roomRecord.setCampus_name(server_name);
        bookRecord.add(roomRecord);
        RecordInfo recordInfo = new RecordInfo(sb.toString(), roomRecord);
        recordInfoList.add(recordInfo);
        if(bookNum.containsKey(studentId))
        {
            if (bookNum.get(studentId) > 3) {
                return "you have booked beyond three courses this week";
            }
            else {
                Integer num = bookNum.get(studentId);
                num += 1;
                bookNum.put(studentId, num);
                return "studentId:" + studentId + "books  successfully";
            }
        }
        else {
            Integer num =1;
            bookNum.put(studentId, num);
            return "first book";
        }
    }

    @Override
    public String SearchRoom(Date date) throws RemoteException {
        HashMap<String, ArrayList<String>> sub_map = new HashMap<String, ArrayList<String>>();
        sub_map = hashMapHashMap.get(date);
        int size = sub_map.size();
        return "the amount of" + server_name + " is " + String.valueOf(size);
    }

    @Override
    public String CancelRoom(String bookingID) throws RemoteException {
        for (int i = 0; i < bookRecord.size(); i++) {
            if (recordInfoList.get(i).getRecordID().equalsIgnoreCase(bookingID)) {
                recordInfoList.remove(i);
            }
        }
        return "successfully remove";    }

    @Override
    public String CreateRoom(String adminId, String roomnum, Date date, ArrayList<String> timeslot) throws RemoteException {
        HashMap<String, ArrayList<String>> sub_map = new HashMap<String, ArrayList<String>>();
        sub_map.put(roomnum, timeslot);
        hashMapHashMap.put(date, sub_map);
        if (hashMapHashMap.containsKey(date)) {
            return "you have created successfully";
        } else {
            return "failed,please try again";
        }    }

    @Override
    public String DeleteRoom(String adminId, String roomnum, Date date, ArrayList<String> timeslot) throws RemoteException {
        if (hashMapHashMap.containsKey(date)) {
            HashMap<String, ArrayList<String>> sub_map = hashMapHashMap.get(date);
            if (sub_map.containsKey(roomnum)) {
                if (sub_map.get(roomnum).equals(timeslot)) {
                    hashMapHashMap.remove(date);
                    return "remove successfully";
                } else {
                    sub_map.get(roomnum).remove(timeslot);
                    return "remove successfully";
                }

            } else {
                return "no record of" + roomnum + " exists ,please check out";
            }
        } else {
            return "no record exists ,please check out";
        }    }


}
