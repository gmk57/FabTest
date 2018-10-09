package gmk57.fabtest;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setSubtitle("com.google.android.material:material:1.0.0");

        setContentView(R.layout.activity_main);
        findViewById(R.id.fab2).setEnabled(false);
        ((FloatingActionButton) findViewById(R.id.fab4)).setScaleType(ImageView.ScaleType.CENTER);
    }
}
