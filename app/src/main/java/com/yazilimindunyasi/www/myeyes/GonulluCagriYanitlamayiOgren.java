package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GonulluCagriYanitlamayiOgren extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonullu_cagri_yanitlamayi_ogren);

        Button btn_geri = (Button)findViewById(R.id.btn_Anladim);
        btn_geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
    }
}

