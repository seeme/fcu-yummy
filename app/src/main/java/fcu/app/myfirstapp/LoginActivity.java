package fcu.app.myfirstapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText etNid;
    private EditText etPassword;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etNid = findViewById(R.id.et_nid);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nid = etNid.getText().toString();
                String password = etPassword.getText().toString();

                if(nid.equals("D123456") && password.equals("123456")) {
                    Toast.makeText(LoginActivity.this, "登入成功", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("nid", nid);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "登入失敗，請確認帳號密碼", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}