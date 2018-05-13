package com.nkber;

import org.springframework.stereotype.Service;

@Service(value = "sayHi")
public class SayHiImpl implements SayHi{
    public String sayHi(String name) {
        return "Hi: "+name;
    }
}
