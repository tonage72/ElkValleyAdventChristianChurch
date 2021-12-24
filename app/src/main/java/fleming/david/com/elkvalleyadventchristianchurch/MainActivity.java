package fleming.david.com.elkvalleyadventchristianchurch;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        new ShowToast(context);
    }
}