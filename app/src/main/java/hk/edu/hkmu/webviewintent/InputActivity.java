package hk.edu.hkmu.webviewintent;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputActivity extends AppCompatActivity {

    private EditText urlEditText;
    private Button urlButton;

    static String EXTRA_MESSAGE = "EXTRA_MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        urlEditText = findViewById(R.id.urledittext);
        urlButton = findViewById(R.id.urlbutton);

        urlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlStr = urlEditText.getText().toString();
                Intent intent = new Intent(InputActivity.this, WebViewActivity.class);
                intent.putExtra(EXTRA_MESSAGE, urlStr);
                startActivity(intent);
            }
        });


    }
}