package com.example.udemyStudy.app.inquiry;

import lombok.Data;
import lombok.NonNull;

@Data
public class InquiryForm {

    private String name;

    @NonNull
    private String email;

    @NonNull
    private String contents;

}

