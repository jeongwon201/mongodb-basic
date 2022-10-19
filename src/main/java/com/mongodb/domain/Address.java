package com.mongodb.domain;

public class Address {
    private String addr1;
    private String addr2;

    public Address(String addr1, String addr2) {
        this.addr1 = addr1;
        this.addr2 = addr2;
    }

    public String getAddr1() {
        return addr1;
    }

    public String getAddr2() {
        return addr2;
    }
}
