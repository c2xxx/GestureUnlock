package chen.com.gestureunlock.com.chen.gestureunlock.util;

import android.util.Log;

/**
 * Created by hui on 2015/11/10.
 */
public class LogController {
    private static final String TAG = "GestureUnlock";
    private final boolean isDebug=true;
    public static void d(String msg){
        Log.d(TAG,msg);
    }
}
