package api.models;

public class Credentials {
    /*
    {
        "userName": "alex",
        "password": "asdsad#frew_DFS2"
    }
    */

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
