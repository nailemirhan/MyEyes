package com.yazilimindunyasi.www.myeyes;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;

import static com.basgeekball.awesomevalidation.ValidationStyle.BASIC;


public class SifremiUnuttum extends AppCompatActivity {

    AwesomeValidation formValidation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sifremi_unuttum);
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
    }

    // Step 3: Buton
    public void operationOnButton(){

        findViewById(R.id.btn_SifremiUnuttum).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean a = formValidation.validate();
                if (a==true)
                {
                    finish();
                    Toast.makeText(getApplicationContext(),"Mail adresinize şifre değiştirme linki gönderildi!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
