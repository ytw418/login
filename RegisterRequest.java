package com.ytw418.loginregisterexample;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest
{
    // 서버 URL 설정 (PHP파일연동)

    final  static private String URL = "http://ytw418.dothome.co.kr/Register.php";
    private Map<String, String> map;
    //private Map<String, String>parameters;

    public RegisterRequest(String userID, String userName, String userPassword, int userEmail, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("userID", userID);
        map.put("userPassword", userPassword);
        map.put("userName", userName);
        map.put("userEmail", userEmail + "");
    }

    @Override
    protected Map<String, String>getParams() throws AuthFailureError {
        return map;
    }
}
