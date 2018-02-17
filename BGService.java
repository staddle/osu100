package hirofushikar.com.osu100;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class BGService extends Service {
    public BGService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
