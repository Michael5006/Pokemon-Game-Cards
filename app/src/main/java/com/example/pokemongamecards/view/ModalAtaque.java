package com.example.pokemongamecards.view;

import android.app.Dialog;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.example.pokemongamecards.R;

public class ModalAtaque extends DialogFragment {

    private String ataque;
    private int icono;

    public ModalAtaque(String ataque, int icono) {
        this.ataque = ataque;
        this.icono = icono;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.modal_ataque);

        // Posicion del modal
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            window.setGravity(Gravity.CENTER);
        }

        // Dentro del modal
        TextView txtAtaque = dialog.findViewById(R.id.txt_ataque);
        ImageView imgIcono = dialog.findViewById(R.id.img_ataque_icono);
        Button btnCerrar = dialog.findViewById(R.id.btn_cerrar);

        // Llamamos los ataques del pokemon
        txtAtaque.setText(ataque);
        imgIcono.setImageResource(icono);

        // Cerrar Modal
        btnCerrar.setOnClickListener(v -> dismiss());

        return dialog;
    }
}
