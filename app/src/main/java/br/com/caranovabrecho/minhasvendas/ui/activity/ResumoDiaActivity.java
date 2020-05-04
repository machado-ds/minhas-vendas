package br.com.caranovabrecho.minhasvendas.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

import br.com.caranovabrecho.minhasvendas.R;
import br.com.caranovabrecho.minhasvendas.util.DataUtil;

public class ResumoDiaActivity extends AppCompatActivity {

    private TextView dataCorrente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo_dia);
        setTitle("Resumo do dia");
        dataCorrente = findViewById(R.id.activity_resumo_dia_data_textview);
        dataCorrente.setText(DataUtil.getDataAtualFormatada());
    }
}
