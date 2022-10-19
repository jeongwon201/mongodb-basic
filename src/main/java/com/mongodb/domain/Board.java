package com.mongodb.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document(collection = "board")
public class Board {

    @Id
    private String _id;
    private String title;
    private String content;
    private Set<Address> addresses;

    protected Board() {}

    public Board(String title, String content, Set<Address> addresses) {
        this.title = title;
        this.content = content;
        this.addresses = addresses;
    }
    public Board(String _id, String title, String content, Set<Address> addresses) {
        this._id = _id;
        this.title = title;
        this.content = content;
        this.addresses = addresses;
    }

    public String get_id() {
        return _id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Set<Address> getAddresses() {
        return addresses;
    }
}
