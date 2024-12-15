package com.example.porcentagemjava;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText etDinheiro = (EditText) findViewById(R.id.etDinheiro);
        EditText etDesconto = (EditText) findViewById(R.id.etDesconto);
        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        TextView tvRes = (TextView) findViewById(R.id.tvRes);
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etDinheiro.getText().toString().equals("") || etDesconto.getText().toString().equals("")){
                    tvRes.setText("Error");
                }else{
                    float dinheiro = new Float(etDinheiro.getText().toString());
                    float desconto = new Float(etDesconto.getText().toString());
                    String res = String.format("%.2f",dinheiro * desconto / 100);
                    tvRes.setText(res);
                }

            }
        });


    }
}