package objavi.samo.android.customtoast.utils;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import objavi.samo.android.customtoast.R;

public class CustomToast {

    public static void showToast(Activity activity,
                                 String text,
                                 int toastDuration){

        View layout = activity.getLayoutInflater().inflate(R.layout.toast_custom,
                (ViewGroup) activity.findViewById(R.id.custom_toast_layout_id));

        TextView toastText = layout.findViewById(R.id.text);
        toastText.setText(text);

        Toast toast = new Toast(activity);
        toast.setDuration(toastDuration);
        toast.setView(layout);
        toast.show();

    }
}
