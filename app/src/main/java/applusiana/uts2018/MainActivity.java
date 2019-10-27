package applusiana.uts2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLaptop, btnLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLaptop = findViewById(R.id.button);
        btnLayout = findViewById(R.id.button2);

        btnLaptop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent laptop = new Intent(MainActivity.this, Laptop.class);
                startActivity(laptop);
            }
        });

        btnLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent layout = new Intent(MainActivity.this, LinearLayout.class);
                startActivity(layout);
            }
        });
    }
}
