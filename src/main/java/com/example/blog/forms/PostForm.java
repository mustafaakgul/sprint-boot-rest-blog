package com.example.blog.forms;


import lombok.Data;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;


@Data
public class PostForm {
    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    private String summary;

    @NotNull
    private PostFormat postFormat;

    @NotNull
    private PostStatus postStatus;

    @NotNull
    private String permalink;

    @NotNull
    private String postTags;

    @NotNull
    private PostType postType;

}
