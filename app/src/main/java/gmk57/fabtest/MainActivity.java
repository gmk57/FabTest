package gmk57.fabtest;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setSubtitle("com.android.support:design:27.1.1");

        setContentView(R.layout.activity_main);
        findViewById(R.id.fab2).setEnabled(false);
        ((FloatingActionButton) findViewById(R.id.fab4)).setScaleType(ImageView.ScaleType.CENTER);
    }
}
