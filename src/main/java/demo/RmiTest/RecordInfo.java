package demo.RmiTest;

public class RecordInfo {
    private String recordID;
    private RoomRecord roomRecord;

    public RecordInfo(String n_recordID, RoomRecord n_roomRecord) {
        this.recordID = n_recordID;
        this.roomRecord = n_roomRecord;
    }


    public String getRecordID() {
        return recordID;
    }

    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }


    public RoomRecord getRoomRecord() {
        return roomRecord;
    }

    public void setRoomRecord(RoomRecord roomRecord) {
        this.roomRecord = roomRecord;
    }


    public String toString() {
        String str = null;

        str = "RecordID: " + getRecordID() + "\n" + roomRecord.toString();
        return str;

    }
}
