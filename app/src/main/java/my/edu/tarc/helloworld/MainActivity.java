package my.edu.tarc.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView = findViewById(R.id.textViewMessage);
        setContentView(R.layout.activity_main);
    }

    protected void showMessage(View v){
        textView.setText("Hello, Lfin");
    }

    public void clearScreen(View v){
        textView.setText("");
    }
}
