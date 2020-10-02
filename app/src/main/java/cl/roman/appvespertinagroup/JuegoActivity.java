package cl.roman.appvespertinagroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class JuegoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego);
    }


    public void test(){
        System.out.println("hello");
    }
}