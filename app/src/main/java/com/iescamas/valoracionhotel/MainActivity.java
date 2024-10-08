package com.iescamas.valoracionhotel;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    RatingBar rtb1,rtb2,rtb3,rtb4,rtb5,rtb6,rtb7;
    TextView lbl_rating1,lbl_rating2,lbl_rating3,lbl_rating4,lbl_rating5,lbl_rating6,lbl_rating7,txt_resultado;
    Button btn_Borrar;
    final int cantidadElecciones = 7;
    float suma = 0;
    float ratingAnterior1 = 0,ratingAnterior2 = 0;
    float ratingAnterior3 = 0,ratingAnterior4 = 0;
    float ratingAnterior5 = 0,ratingAnterior6 = 0;
    float ratingAnterior7 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rtb1 = findViewById(R.id.rtb1);
        rtb2 = findViewById(R.id.rtb2);
        rtb3 = findViewById(R.id.rtb3);
        rtb4 = findViewById(R.id.rtb4);
        rtb5 = findViewById(R.id.rtb5);
        rtb6 = findViewById(R.id.rtb6);
        rtb7 = findViewById(R.id.rtb7);
        txt_resultado = findViewById(R.id.txt_resultado);
        lbl_rating1 = findViewById(R.id.lbl_rating1);
        lbl_rating2 = findViewById(R.id.lbl_rating2);
        lbl_rating3 = findViewById(R.id.lbl_rating3);
        lbl_rating4 = findViewById(R.id.lbl_rating4);
        lbl_rating5 = findViewById(R.id.lbl_rating5);
        lbl_rating6 = findViewById(R.id.lbl_rating6);
        lbl_rating7 = findViewById(R.id.lbl_rating7);
        btn_Borrar = findViewById(R.id.btn_Borrar);


        rtb1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {

            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating1.setText(String.valueOf(v));
                if(ratingAnterior1!=0){
                    suma -= ratingAnterior1;
                }

                suma += v;
                ratingAnterior1 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));
            }
        });
        rtb2.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating2.setText(String.valueOf(v));
                if(ratingAnterior2!=0){
                    suma -= ratingAnterior2;
                }
                suma += v;
                ratingAnterior2 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));
            }
        });
        rtb3.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating3.setText(String.valueOf(v));
                if(ratingAnterior3!=0){
                    suma -= ratingAnterior3;
                }
                suma += v;
                ratingAnterior3 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));


            }
        });
        rtb4.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating4.setText(String.valueOf(v));
                if(ratingAnterior4!=0){
                    suma -= ratingAnterior4;
                }
                suma += v;
                ratingAnterior4 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));

            }
        });
        rtb5.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating5.setText(String.valueOf(v));
                if(ratingAnterior5!=0){
                    suma -= ratingAnterior5;
                }
                suma += v;
                ratingAnterior5 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));


            }
        });
        rtb6.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating6.setText(String.valueOf(v));
                if(ratingAnterior6!=0){
                    suma -= ratingAnterior6;
                }
                suma += v;
                ratingAnterior6 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));

            }
        });
        rtb7.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                lbl_rating7.setText(String.valueOf(v));
                if(ratingAnterior7!=0){
                    suma -= ratingAnterior7;
                }
                suma += v;
                ratingAnterior7 = v;
                txt_resultado.setText(String.format("%.2f",puntuacion(suma,cantidadElecciones)));

            }
        });

        btn_Borrar.setOnClickListener(view -> clear() );

    }


    private  float puntuacion(float suma,int total){
        return suma/total;
    }

    private void clear(){
        rtb1.setRating(0);
        rtb2.setRating(0);
        rtb3.setRating(0);
        rtb4.setRating(0);
        rtb5.setRating(0);
        rtb6.setRating(0);
        rtb7.setRating(0);
        lbl_rating1.setText(R.string.lbl_rating1);
        lbl_rating2.setText(R.string.lbl_rating2);
        lbl_rating3.setText(R.string.lbl_rating3);
        lbl_rating4.setText(R.string.lbl_rating4);
        lbl_rating5.setText(R.string.lbl_rating5);
        lbl_rating6.setText(R.string.lbl_rating6);
        lbl_rating7.setText(R.string.lbl_rating7);
        txt_resultado.setText(R.string.txt_resultado);

    }


}
