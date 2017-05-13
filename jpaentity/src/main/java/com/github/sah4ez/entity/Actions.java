package com.github.sah4ez.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Action")
public class Actions implements Serializable {

    private static final long serialVersionUID = 6006114548092569473L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Version
    @Column(name = "version")
    private int version;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(referencedColumnName = "id")
    private User user;

    @Column(name = "verbose")
    private String verbose;

    @Column(name = "noune")
    private String noune;

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(final int version) {
        this.version = version;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getVerbose() {
        return verbose;
    }

    public void setVerbose(String verbose) {
        this.verbose = verbose;
    }

    public String getNoune() {
        return noune;
    }

    public void setNoune(String noune) {
        this.noune = noune;
    }

    @Override
    public String toString() {
        String result = getClass().getSimpleName() + " ";
        if (id != null)
            result += "id: " + id;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Actions)) {
            return false;
        }
        Actions other = (Actions) obj;
        return !(id != null && !id.equals(other.id));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
}