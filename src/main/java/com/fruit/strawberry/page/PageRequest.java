package com.fruit.strawberry.page;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by hanlei6 on 2016/10/2.
 */
@Setter
@Getter
public class PageRequest {
    private int page;

    private int size;

    private String[] orders;

    public PageRequest(int page, int size, String... orders) {
        this.page = page;
        this.size = size;
        this.orders = orders;
    }
}
