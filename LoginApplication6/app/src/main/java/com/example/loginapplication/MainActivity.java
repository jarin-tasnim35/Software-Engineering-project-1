package com.example.loginapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widset.EditText;
import android.widset.TextView;
import android.widset.Toast;


public class MainActivity extends AppCompatActivity {

   private EditText eName;
   private EditText epassword;
    private  Button elogin;
    private  TextView eAttemptsInfo;

   private final  String Username = "Admin";
   private final String password = "12345678";

   boolean isValid = false;
   private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);
        eAttemptsInfo = findViewById(R.id.tvAttemptsInfo);

        eLogin.setonClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                String inputName = eName.getText().toString();
                String inputPassword = epassword.get.Text().toString();

                if (inputName.isEmpty() || inputPassword.isEmpty()) {

                    Toast.makeText(context:MainActivity.this, text:
                    "Please enter all the detail correctly!", Toast.LENGTH_SHORT).show();
                } else {
                    isValid = validate(inputName, inputPassword);

                    if (!isValid) {
                        counter--;
                        Toast.makeText(context:MainActivity.this, text:
                        "Incorrect credentials entered!", Toast.LENGTH_SHORT).show();
                        eAttemptsInfo.setText("No of attempts remaining: "  + counter);

                        if (counter == 0) {

                            elogin.setEnabled(false);
                        }
                    } else {
                        Toast.makeText(context:MainActivity.this, text:
                        "Login successful!", Toast.LENGTH_SHORT).show();

                    }



        }
    }

});
}

private boolean validate(String name, String password) {
    if (name.equals(Username) && password.equals(Password)){
        return true;
}

return false;

                }
        }