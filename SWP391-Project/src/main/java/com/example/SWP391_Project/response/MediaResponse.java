package com.example.SWP391_Project.response;

import com.example.SWP391_Project.model.Media;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class MediaResponse extends Media {
    String username;

    public MediaResponse(int id, String title, String content, boolean type, boolean status, Date publishedDate, String sendTo, String username) {
        super(id, title, content, type, status, publishedDate, sendTo);
        this.username = username;
    }

}
