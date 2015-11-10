package chen.com.gestureunlock.activity;

import android.app.Activity;
import android.os.Bundle;

import chen.com.gestureunlock.util.LogController;

/**
 * Created by hui on 2015/11/10.
 */
public class BaseActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogController.d("onCreate   "+this.getClass().getSimpleName());
    }
}
