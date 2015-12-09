package maurercompany.receitasgo;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Cadastro extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText preparo;
    Button btn;
    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nome = (EditText) findViewById(R.id.nome);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        preparo = (EditText) findViewById(R.id.preparo);
        btn = (Button)  findViewById(R.id.gravar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Receita r = new Receita(e1.getText().toString(), e2.getText().toString(), nome.getText().toString(), preparo.getText().toString());

                MainActivity.receita.add(r);

                Toast.makeText(Cadastro.this, "Salvo", Toast.LENGTH_LONG).show();

                onBackPressed();

            }
        });



    }
}