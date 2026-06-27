package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.*;

@Entity
public class Client {
    @Id
    @GeneratedValue()
    private long clientId;

    @Column(nullable = false)
    private String email;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @OneToMany(mappedBy = "client")
    private List<Portfolio> portfolios;

    private String name;

    protected Client() {

    }

    public Client(String name, String email, Advisor advisor) {
        this.name = name;
        this.email = email;
        this.advisor = advisor;

    }

    public Long getClientId() {
        return clientId;
    }

    public String getName() {
        return getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
