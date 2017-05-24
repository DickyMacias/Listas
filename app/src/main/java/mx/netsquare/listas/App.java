package mx.netsquare.listas;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class App extends ListActivity {

    private final String ternuritas [] = {
            "Melissa", "Eduardo", "Tlacua", "Jona", "Erick", "Martin", "Ricardo", "Milton"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.app);
        setListAdapter(new ArrayAdapter<String>(this,R.layout.cutties,ternuritas));
        ListView lista = getListView();
        lista.setTextFilterEnabled(true);

        lista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
}
