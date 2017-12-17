package com.yazilimindunyasi.www.myeyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import static com.basgeekball.awesomevalidation.ValidationStyle.BASIC;
public class GonulluGirisYap extends AppCompatActivity {

    AwesomeValidation formValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gonullu_giris_yap);

        setFormValidationStyle();
        addFormValidation();
        operationOnButton();
    }

    // Step 1: designate a style
    public void setFormValidationStyle(){

        formValidation = new AwesomeValidation(BASIC);

    }

    // Step 2: add validations
    public void addFormValidation(){

        // support regex string, java
        // you can pass resource or string
        formValidation.addValidation(this, R.id.txt_Email, "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$", R.string.GecersizEmail);
        formValidation.addValidation(this, R.id.txt_Sifre, "a-zA-Z0-9_-", R.string.GecersizSifre);


    }

    // Step 3: Buton
    public void operationOnButton(){

        findViewById(R.id.btn_OturumAc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                formValidation.validate();
            }
        });
    }

    public void SifremiUnuttum(View view)
    {
        Intent i = new Intent(GonulluGirisYap.this,SifremiUnuttum.class);
        startActivity(i);
    }
}

