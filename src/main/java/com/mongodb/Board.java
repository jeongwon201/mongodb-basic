package com.mongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "board")
public class Board {

    @Id
    private String _id;
    private String title;
    private String content;

    protected Board() {}

    public Board(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public Board(String _id, String title, String content) {
        this._id = _id;
        this.title = title;
        this.content = content;
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
}
