package br.com.caranovabrecho.minhasvendas.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import br.com.caranovabrecho.minhasvendas.R;
import br.com.caranovabrecho.minhasvendas.database.TinyDB;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfigTipoItemFragment extends Fragment {

    private TinyDB sharedPreferencesUtil = new TinyDB(getActivity());
    private Button botaoInserir;
    private EditText inputTipoItem;
    private ArrayList<String> listaDeTiposDeItem = new ArrayList<>();
    private Button botaoContinuar;

    public ConfigTipoItemFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        botaoInserir = getView().findViewById(R.id.fragment_config_tipo_item_botao_inserir);
        botaoContinuar = getView().findViewById(R.id.fragment_config_tipo_item_botao_continuar);
        inputTipoItem = getView().findViewById(R.id.fragment_config_tipo_item_input_edittext);

        botaoInserir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tipoItem = String.valueOf(inputTipoItem.getText());
                listaDeTiposDeItem.add(tipoItem);
                inputTipoItem.getText().clear();
                Toast.makeText(getActivity(), "Tipo de Item salvo com sucesso", Toast.LENGTH_SHORT).show();
            }
        });

        botaoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sharedPreferencesUtil.putListString("ListaTipoItem", listaDeTiposDeItem);
                //navigate to fragment method
            }
        });

        return inflater.inflate(R.layout.fragment_config_tipo_item, container, false);
    }
}
