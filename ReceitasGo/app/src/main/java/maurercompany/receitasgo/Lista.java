package maurercompany.receitasgo;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

public class Lista extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    ListView listView;

    static ReceitaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        listView = (ListView) findViewById(R.id.listView);

        adapter = new  ReceitaAdapter(this, R.layout.activity_receita_adapter, MainActivity.receita);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Receita receita = (Receita) parent.getAdapter().getItem(position);

                int p = MainActivity.receita.indexOf(receita);

                Intent intent = new Intent(Lista.this, AlterarReceita.class);
                intent.putExtra("id", p);

                startActivity(intent);


            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}