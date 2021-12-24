package fleming.david.com.elkvalleyadventchristianchurch;

import android.app.Activity;
import android.content.Context;
import android.widget.Toast;

public class ShowToast extends Activity {

    public ShowToast(Context context) {
        Toast.makeText(context,"TOAST MESSAGE",Toast.LENGTH_SHORT).show();

    }
}
