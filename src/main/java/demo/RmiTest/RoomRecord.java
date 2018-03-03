package demo.RmiTest;

import java.util.ArrayList;
import java.util.Date;

public class RoomRecord {





    private Date date;   //日期

    private String roomnum;  //教室号

    private String studentId;

    private String campus_name;  //校区名字

    private ArrayList<String> timeslot = new ArrayList<String>();   //时间表


    public RoomRecord(Date n_date, String n_roomnum, ArrayList<String> n_timeslot, String studentId) {
        this.date = n_date;
        this.roomnum = n_roomnum;
        this.timeslot = n_timeslot;
        this.studentId = studentId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(String roomnum) {
        this.roomnum = roomnum;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCampus_name() {
        return campus_name;
    }

    public void setCampus_name(String campus_name) {
        this.campus_name = campus_name;
    }

    public ArrayList<String> getTimeslot() {
        return timeslot;
    }

    public void setTimeslot(ArrayList<String> timeslot) {
        this.timeslot = timeslot;
    }
}
