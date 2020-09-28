package cn.name.demo.domain;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserExample {
    protected List<User> oredCriteria;

    public UserExample() {
        oredCriteria = new ArrayList<User>();
    }


}