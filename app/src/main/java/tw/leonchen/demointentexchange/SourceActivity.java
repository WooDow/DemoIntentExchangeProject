package tw.leonchen.demointentexchange;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SourceActivity extends AppCompatActivity {

    private int myRequestCode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_source);

        // 設置要intent 的 class
        // 要在 Manifest 加上 <activity android:name=".DestActivity"></activity>
        Intent intent = new Intent(SourceActivity.this, DestActivity.class);
        intent.putExtra("name", "judy");
        intent.putExtra("age", 18);
        //startActivity(intent);

        //要回傳資料到這個 Activity
        myRequestCode = 001;
        startActivityForResult(intent, myRequestCode);
        //finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==myRequestCode){
            if(resultCode== Activity.RESULT_OK){
                Toast.makeText(SourceActivity.this, "ok", Toast.LENGTH_LONG).show();
            }
        }
    }
}
