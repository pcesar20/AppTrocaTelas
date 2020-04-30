package br.com.pauloc.trocatela;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CarregaPrincipal();
    }

    public void CarregaPrincipal(){
        setContentView(R.layout.activity_main);
        Button btnTela2 = findViewById(R.id.btn_tela2);
        final EditText editNome = findViewById(R.id.edit_nome);
        final EditText editSenha = findViewById(R.id.edit_senha);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = editNome.getText().toString();
                String senha = editSenha.getText().toString();
                if (nome.equals("paulo") && senha.equals("123")){
                CarregarTela2();} else{
                    AlertDialog.Builder msgSemCad = new AlertDialog.Builder(MainActivity.this);
                    msgSemCad.setTitle(R.string.sem_cad);
                    msgSemCad.setMessage("Realize seu cadastro");
                    msgSemCad.setNeutralButton("Ok",null);
                    msgSemCad.show();

                }
            }
        });
    }

    public void CarregarTela2(){
        setContentView(R.layout.tela2);
        Button btnTelaPrin = findViewById(R.id.btn_telaPrin);
        btnTelaPrin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregaPrincipal();
            }
        });
    }

}
