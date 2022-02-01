package chandan.prasad.bcadaysix;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
ImageButton button_image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button_image=findViewById(R.id.imageButton);
        button_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity2.this, "5G", Toast.LENGTH_SHORT).show();
            }
        });

    }
}