package app.com.example.pankajkumar.myappportofolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayButtonToast(View view) {

        int b_id= view.getId();

        switch (b_id){
            case R.id.button1:
                showToast("Button1 clicked");
                break;
            case R.id.button2:
                showToast("Button2 clicked");
                break;
            case R.id.button3:
                showToast("Buttonn 3 clicked");
                break;
            case R.id.button4:
                showToast("Button 4 clicke");
                break;
            case R.id.button5:
                showToast("Button5 clicked");
                break;
            default: showToast("Default Case!");
        }


    }

    void showToast(String s1){
        Toast.makeText(getApplicationContext(),"TostMessage:  "+s1,Toast.LENGTH_LONG).show();
    }
}


