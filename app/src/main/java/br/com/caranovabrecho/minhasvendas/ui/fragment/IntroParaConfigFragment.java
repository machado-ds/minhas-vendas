package br.com.caranovabrecho.minhasvendas.ui.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.caranovabrecho.minhasvendas.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class IntroParaConfigFragment extends Fragment {

    private Button botaoContinuar;

    public IntroParaConfigFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        botaoContinuar = getView().findViewById(R.id.fragment_intro_continuar_button);

        botaoContinuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //navigate to fragment method
            }
        });

        return inflater.inflate(R.layout.fragment_intro_para_config, container, false);
    }
}
