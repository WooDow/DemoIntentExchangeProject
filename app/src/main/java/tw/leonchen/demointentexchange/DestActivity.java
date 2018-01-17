package tw.leonchen.demointentexchange;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class DestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dest);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age", 3);

        Toast.makeText(DestActivity.this, "name:" + name + " age:" + age, Toast.LENGTH_LONG).show();

        //將 RESULT_OK 的值回傳
        int myResultCode = Activity.RESULT_OK;
        setResult(myResultCode);
    }
}
