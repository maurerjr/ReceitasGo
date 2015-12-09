package maurercompany.receitasgo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class ReceitaAdapter extends ArrayAdapter <Receita> {


    public ReceitaAdapter(Context context, int resource, List<Receita> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View linha = LayoutInflater.from(getContext()).inflate(R.layout.activity_receita_adapter, null);

        TextView nome = (TextView) linha.findViewById(R.id.nome);
        TextView en1 = (TextView) linha.findViewById(R.id.in1);
        TextView en2 = (TextView) linha.findViewById(R.id.in2);
        TextView preparo = (TextView) linha.findViewById(R.id.modo);

        Receita receita = getItem(position);
        nome.setText(receita.getNome());
        en1.setText(receita.getEd1());
        en2.setText(receita.getEd2());
        preparo.setText(receita.getPreparo());

        return linha;
        //return super.getView(position, convertView, parent);
    }
}