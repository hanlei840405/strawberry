package com.fruit.strawberry.page;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * Created by hanlei6 on 2016/10/2.
 */
@Setter
@Getter
public class PageResponse<T> implements Serializable {
    private int totalPages; // 总页码
    private int totalElements; // 总数量
    private int number; // 当前页吗
    private int size; // 每页数量
    private int numberOfElements; //
    private List<T> content;
    private boolean hasContent;
    private boolean first;
    private boolean hasNext;
    private boolean hasPrevious;

    public PageResponse(int totalPages, int totalElements, int number, int size, List<T> content) {
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.number = number;
        this.size = size;
        this.content = content;
    }
}
