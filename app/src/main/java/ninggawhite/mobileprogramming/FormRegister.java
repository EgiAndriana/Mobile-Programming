package ninggawhite.mobileprogramming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


    public class FormRegister extends Activity implements View.OnClickListener {
        Button back;
        Intent kembali;

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.form_register);
            back = (Button) findViewById(R.id.btnCancel);
            back.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            kembali = new Intent(this, MainActivity.class);
            startActivity(kembali);
        }
    }
