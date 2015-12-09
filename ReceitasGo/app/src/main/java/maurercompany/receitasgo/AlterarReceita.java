package maurercompany.receitasgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class AlterarReceita extends AppCompatActivity {

    EditText e1;
    EditText e2;
    EditText preparo;
    Button btn;
    Button remover;
    EditText nome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_receita);

        nome = (EditText) findViewById(R.id.nome);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        preparo = (EditText) findViewById(R.id.preparo);
        btn = (Button)  findViewById(R.id.gravar);
        remover = (Button) findViewById(R.id.remover);

        final Bundle extras = getIntent().getExtras();
        final  int id = extras.getInt("id");

        final Receita r = MainActivity.receita.get(id);

        e1.setText(r.getEd1().toString());
        e2.setText(r.getEd2().toString());
        preparo.setText(r.getPreparo().toString());
        nome.setText(r.getNome().toString());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                r.setNome(nome.getText().toString());
                r.setEd1(e1.getText().toString());
                r.setEd2(e2.getText().toString());
                r.setPreparo(preparo.getText().toString());

                Toast.makeText(AlterarReceita.this, "Removido com Sucesso", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });

        remover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.receita.remove(id);
                Toast.makeText(AlterarReceita.this, "Removido com sucesso", Toast.LENGTH_LONG).show();
                Lista.adapter.notifyDataSetChanged();
                onBackPressed();
            }
        });


    }
}
