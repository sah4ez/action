package com.github.sah4ez.ejb;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Created by aleksandr on 08.05.17.
 */
@Entity
public class Action implements Serializable {

    private User user;
    private Long id;
    private LocalDateTime time;
    private String actionText;
    private String object;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getActionText() {
        return actionText;
    }

    public void setActionText(String action) {
        this.actionText = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Action{" + "user=" + user +
                ", id=" + id +
                ", time=" + time +
                ", actionText='" + actionText + '\'' +
                ", object='" + object + '\'' +
                '}';
    }
}
