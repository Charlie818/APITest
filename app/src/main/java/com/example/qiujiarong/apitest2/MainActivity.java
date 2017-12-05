package com.example.qiujiarong.apitest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button click_botton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click_botton=findViewById(R.id.click_button);
        click_botton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("test","here");
                String str="I left tickets at box office.";
                for(Relation re: StanfordAPI.OpenIE(str)){
                    Log.e("here",re.getRelation());
                }
            }
        }
        );
    }
}
