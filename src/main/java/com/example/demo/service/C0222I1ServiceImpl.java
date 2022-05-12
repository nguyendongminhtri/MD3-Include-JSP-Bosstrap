package com.example.demo.service;

import com.example.demo.model.C0222I1;

import java.util.ArrayList;
import java.util.List;

public class C0222I1ServiceImpl implements IC0222I1Service{
    public static List<C0222I1> c0222I1List = new ArrayList<>();
    static {
        c0222I1List.add(new C0222I1(1,"Long","Hà Nội"));
        c0222I1List.add(new C0222I1(2,"Thành","Hải Dương"));
        c0222I1List.add(new C0222I1(3,"Huệ","Hải Phòng"));
    }

    @Override
    public List<C0222I1> findAll() {
        return c0222I1List;
    }
}
