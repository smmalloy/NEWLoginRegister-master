package com.tonikamitv.loginregister;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by joe on 28/04/2016.
 */
public class Attendancerequest extends StringRequest {
    private static final String LOGIN_REQUEST_URL = "http://joemalloy.co.uk/baj/attendance.php";
    private Map<String, String> params;

    public Attendancerequest ( Response.Listener<String> listener) {
        super(Request.Method.POST, LOGIN_REQUEST_URL, listener, null);
        params = new HashMap<>();

           }
}





