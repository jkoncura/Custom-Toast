package objavi.samo.android.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import objavi.samo.android.customtoast.utils.CustomToast;

public class MainActivity extends AppCompatActivity {

    private Button mCustomToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCustomToast = findViewById(R.id.btn_custom_toast);

        mCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomToast.showToast(MainActivity.this,
                                            "Custom Toast",
                                            Toast.LENGTH_LONG);
            }
        });


    }
}
