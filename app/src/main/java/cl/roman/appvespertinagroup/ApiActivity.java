package cl.roman.appvespertinagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class ApiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api);
    }

    public String consumeApi(){
        return "ok";
    }
}