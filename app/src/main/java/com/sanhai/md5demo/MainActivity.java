package com.sanhai.md5demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.tv);

        try {
            System.out.println(tv.getText().toString());

            MessageDigest md = MessageDigest.getInstance("MD5");
            String md5 = EncryUtil.MD5(tv.getText().toString(), md);
            System.out.println("md5 : " + md5);

            md = MessageDigest.getInstance("SHA-1");
            String sha1 = EncryUtil.MD5(tv.getText().toString(), md);
            System.out.println("sha-1 : " + sha1);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
