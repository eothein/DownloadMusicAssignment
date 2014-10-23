package com.example.jbuy519.asynctaskexample;

import android.os.AsyncTask;
import android.os.Environment;
import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by jbuy519 on 08/10/2014.
 */
public class DownloadMusic extends AsyncTask<String, String, String> {

    private static String TAG = "DownloadMusic";

    private MusicInterface mI;

    public DownloadMusic(MusicInterface mI){
        this.mI = mI;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        mI.downloadFinished();
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }


    @Override
    protected void onProgressUpdate(String... values) {
        super.onProgressUpdate(values);
        int value = Integer.parseInt(values[0]);
        mI.setProgressStatus(value);
    }

    @Override
    protected String doInBackground(String... params) {
        
        try{
			// TODO: add code to download music file
			// add it to local repo

        } catch (Exception e) {
            Log.e(TAG, e.getMessage());
        }
        return null;
    }
}
