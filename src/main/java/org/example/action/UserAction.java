package org.example.action;

import com.opensymphony.xwork2.ActionSupport;
import org.example.model.User;

public class UserAction extends ActionSupport {
    private User user;
    public String showForm() {
        user = new User();
        return SUCCESS;
    }
    public String submitForm() {
         if ("admin".equals(user.getUsername ()) && "password".equals(user.getPassword ())) {
            return SUCCESS;
        } else {
            addActionError("Invalid username or password");
            return ERROR;
        }
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
}
