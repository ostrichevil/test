package demo.RmiTest;

import java.io.Serializable;
import java.rmi.RemoteException;

public class UserInfo implements Serializable {

    private static final long serialVersionUID = 6995197013679215525L;

    private String userName;
    private String userDesc;
    private Integer userAge;
    private Boolean userSex;

    public UserInfo() throws RemoteException {

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }
}

