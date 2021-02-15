package lt.vtmc.smirnovascolorchanger;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private LinearLayout linearLayout1;
    private Button buttonGreen;
    private Button buttonRed;
    private Button buttonBlue;
    private Button buttonYellow;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout1 = findViewById(R.id.linearLayout1);
        buttonGreen = findViewById(R.id.buttonGreen);
        buttonRed = findViewById(R.id.buttonRed);
        buttonBlue = findViewById(R.id.buttonBlue);
        buttonYellow = findViewById(R.id.buttonYellow);
        txt = (TextView) findViewById(R.id.colorName);


        buttonGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.GREEN);
                txt.setText("Color Green");
            }
        });

        buttonRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.RED);
                txt.setText("Color Red");
            }
        });

        buttonBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.BLUE);
                txt.setText("Color Blue");
            }
        });

        buttonYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearLayout1.setBackgroundColor(Color.YELLOW);
                txt.setText("Color Yellow");
            }
        });
    }
}