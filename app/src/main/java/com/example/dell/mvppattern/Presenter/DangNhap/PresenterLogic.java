package com.example.dell.mvppattern.Presenter.DangNhap;

import com.example.dell.mvppattern.View.DangNhap.ViewXuLiDangNhap;

/**
 * Created by Dell on 3/8/2018.
 */

public class PresenterLogic implements PresenterimpXuLiDangNhap {
    ViewXuLiDangNhap viewXuLiDangNhap;
    public  PresenterLogic(ViewXuLiDangNhap viewXuLiDangNhap)
    {
        this.viewXuLiDangNhap=viewXuLiDangNhap;
    }
    @Override
    public void KiemTraDangNhap(String username,String password) {
        if(username.equals("Hung")&&password.equals("123"))
        {
            viewXuLiDangNhap.DangNhapThanhCong();
            viewXuLiDangNhap.chuyenActivity();
        }else{
            viewXuLiDangNhap.DangNhapThatBai();
        }
    }
}
