package com.study.mysite;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
//@RequiredArgsConstructor
//@Getter
//@Setter
@Data //웬만한 메소드는 자동으로 생성
public class Blombok {
    private String id;
    private int num;

    private final String name;
    private final int code;
    
    public static void main(String[] args) {
        Blombok lombok2 = new Blombok("cuty", 1);
    }
}
