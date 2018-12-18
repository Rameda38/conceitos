package br.com.apps.rameda.conceitos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoGerar = (Button)findViewById(R.id.btt_gerar);
        botaoGerar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                retornaFrase();
            }
        });
    }

    public void retornaFrase(){
        String [] frases ={
                "google me contrata","ola mundo", "mamae te ama", "bom dia","nunca te pedi nada google"
        };
    int valor =new Random().nextInt(frases.length);
        TextView mostrarTexto = (TextView)findViewById(R.id.tv_mostrarTexto);
        mostrarTexto.setText(frases[valor]);
    }




}
