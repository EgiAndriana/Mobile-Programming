package ninggawhite.mobileprogramming;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnlogin,btnRegister,btnCancel;
    EditText ed1, ed2;
    int counter = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        ed1      = (EditText) findViewById(R.id.username);
        ed2      = (EditText) findViewById(R.id.password);
        btnRegister = (Button) findViewById(R.id.btnRegister);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), FormRegister.class);
                startActivity(intent);
            }
        });


        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1.getText().toString().equals("admin") && ed2.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);
                    Intent loginsukses = new Intent(MainActivity.this, berhasil_login.class);
                    startActivity(loginsukses);

                }
                else {
                    Toast.makeText(getApplicationContext(), "Username atau Password Salah", Toast.LENGTH_SHORT) .show();
                }
            }
        });
    }
    public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com"));
        startActivity(browserIntent);
    }

    public void browser2 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.gmail.com"));
        startActivity(browserIntent);
    }

    public void browser3 (View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com"));
        startActivity(browserIntent);
    }


}