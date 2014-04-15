package org.ff.findphone.activity;

import android.app.Activity;
import android.os.Bundle;
import org.ff.findphone.R;
import org.ff.findphone.service.PollingService;
import org.ff.findphone.utils.FindPhoneUtils;

public class MyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        //Start polling service
        System.out.println("Start polling service...");
        FindPhoneUtils.startPollingService(this, 5, PollingService.class, PollingService.ACTION);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Stop polling service
        System.out.println("Stop polling service...");
        FindPhoneUtils.stopPollingService(this, PollingService.class, PollingService.ACTION);
    }

}
