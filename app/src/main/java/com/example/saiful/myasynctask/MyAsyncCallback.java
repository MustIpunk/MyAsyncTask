package com.example.saiful.myasynctask;

public interface MyAsyncCallback {
    void onPreExecute();
    void onPostExecute(String text);
}
